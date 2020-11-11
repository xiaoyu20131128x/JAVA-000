package conc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @program: Week_04
 * @description:
 * @author: hutao
 * @create: 2020-11-11 22:46
 */
public class CyclicBarrierDemo {

    public static void main(String[] args) {

        long start=System.currentTimeMillis();
        CyclicBarrierDemo demo = new CyclicBarrierDemo();
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        CyclicBarrier cyclicBarrier = new CyclicBarrier(1, ()-> {
            int result = demo.getVal() ; //这是得到的返回值
            // 确保  拿到result 并输出
            System.out.println("异步计算结果为："+result);
            System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        });
        demo.setBarrier(cyclicBarrier);

        Thread thread = new Thread(()->{
            try {
                demo.sum();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();

        // 然后退出main线程
    }

    private volatile Integer val = null;
    CyclicBarrier barrier;

    public void setBarrier(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    private void sum() throws BrokenBarrierException, InterruptedException {
        val = fibo(36);
        barrier.await();
    }

    private int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
    private int getVal(){
        return val;
    }

}