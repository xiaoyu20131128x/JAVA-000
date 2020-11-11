package conc;

/**
 * @program: Week_04
 * @description:
 * @author: hutao
 * @create: 2020-11-11 22:22
 */
public class ThereDemo {

    public static void main(String[] args) {

        long start=System.currentTimeMillis();

        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        ThereDemo demo = new ThereDemo();
        Thread thread = new Thread(()->{
            demo.sum();
        });

        thread.start();
        int result = demo.getVal();

        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);

        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        // 然后退出main线程
    }

    private volatile Integer val = null;

    private void sum() {
        val = fibo(36);
    }

    private int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
    private int getVal(){
        while (val == null){
        }
        return val;
    }

}