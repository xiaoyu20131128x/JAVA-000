package conc;

import java.util.Objects;
import java.util.concurrent.*;

/**
 * @program: Week_04
 * @description:
 * @author: hutao
 * @create: 2020-11-11 23:35
 */
public class FutureCallDemo implements Callable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long start=System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future future = executor.submit(new FutureCallDemo());
        // 异步执行 下面方法

        Object result = future.get(); //这是得到的返回值

        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);

        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        // 然后退出main线程
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }

    @Override
    public Object call() throws Exception {
        return sum();
    }
}