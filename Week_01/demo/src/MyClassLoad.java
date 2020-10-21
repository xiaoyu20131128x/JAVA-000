import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: Week_01
 * @description: 自定义一个 Classloader，加载一个 Hello.xlass 文件，执行 hello 方法，
 * 此文件内容是一个 Hello.class 文件所有字节（x=255-x）处理后的文件
 * @author: hutao
 * @create: 2020-10-19 23:35
 */
public class MyClassLoad extends ClassLoader {

    public static void main(String[] args) {
        try {
            // 获取要加载的类对象
            Class<?> clz = new MyClassLoad().findClass("Hello");
            // 获取类中方法的实列
            Method hello = clz.getMethod("hello");
            // 调用指定实例的方法
            hello.invoke(clz.newInstance());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String filePath = this.getClass().getResource("/file/Hello.xlass").getPath();
        File file = new File(filePath);
        int length = (int) file.length();
        byte[] bytes = new byte[length];//
        try {
            new FileInputStream(file).read(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return super.findClass(name);
        }
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (255 - bytes[i]);
        }
        return defineClass(name, bytes, 0, length);
    }
}