package conc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;

/**
 * @program: Week_04
 * @description: CountDownLatch
 * @author: hutao
 * @create: 2020-11-11 23:20
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {

        long start=System.currentTimeMillis();
        CountDownLatchDemo latchDemo = new CountDownLatchDemo();
        CountDownLatch latch = new CountDownLatch(1);
        latchDemo.setCountDownLatch(latch);

        // 在这里创建一个线程或线程池
        Thread thread = new Thread(()-> {
            latchDemo.sum();
        });

        // 异步执行 下面方法
        thread.start();
        int result = latchDemo.getVal(); //这是得到的返回值

        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);

        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        // 然后退出main线程
    }
        private volatile Integer val = null;
        private CountDownLatch countDownLatch;

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    private void sum() {
        val = fibo(36);
        countDownLatch.countDown();
    }

    private int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }

    private int getVal() throws InterruptedException {
        countDownLatch.await();
        return val;
    }

}