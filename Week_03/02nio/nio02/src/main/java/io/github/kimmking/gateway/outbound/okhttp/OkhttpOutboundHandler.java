package io.github.kimmking.gateway.outbound.okhttp;

import com.sun.istack.internal.NotNull;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpUtil;
import okhttp3.*;

import java.io.IOException;

public class OkhttpOutboundHandler {

    private final String proxyServer;
    private static OkHttpClient httpClient;

    public OkhttpOutboundHandler(String proxyServer) {
        this.proxyServer = proxyServer.endsWith("/") ? proxyServer.substring(0, proxyServer.length() - 1) : proxyServer;
        if (httpClient == null) {
            httpClient = new OkHttpClient();
        }
    }

    public void handle(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        String url = proxyServer + fullRequest.uri();
        doRequest(fullRequest, ctx, url);
    }

    private static void doRequest(FullHttpRequest fullRequest, ChannelHandlerContext ctx, String url) {
        Request request = new Request.Builder().url(url).get().build();
        httpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                System.out.println("error, e:" + e.toString());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                if (fullRequest != null) {
                    if (!HttpUtil.isKeepAlive(fullRequest)) {
                        ctx.write(response).addListener(ChannelFutureListener.CLOSE);
                    } else {
                        ctx.write(response);
                    }
                    ctx.flush();
                }
            }
        });
    }
}
