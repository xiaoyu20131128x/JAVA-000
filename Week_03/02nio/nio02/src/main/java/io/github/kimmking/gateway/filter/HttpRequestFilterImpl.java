package io.github.kimmking.gateway.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

/**
 * @program: netty-gateway
 * @description: 自定义 filter
 * @author: hutao
 * @create: 2020-11-05 00:00
 */
public class HttpRequestFilterImpl implements HttpRequestFilter {

    public static final String NIO_KEY = "NIO_DEMO";

    public static final String NIO_VAL = "HU_TAO";


    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
//        fullRequest.headers().set(NIO_KEY,NIO_VAL);
    }
}