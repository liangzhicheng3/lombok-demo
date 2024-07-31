package com.liangzhicheng.lombok.cleanup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Cleanup {

    /**
     * 自动在try-finally块中调用in.close()方法，释放资源
     */
    public void cleanup1() throws FileNotFoundException {
        @lombok.Cleanup InputStream in = new FileInputStream("lzc/file");
    }

    /**
     * 如果要释放资源的方法名不是close，也可以指定要调用的方法名
     * 自动在try-finally块中调用resource.release()方法，释放资源
     */
    public void cleanup2() {
        @lombok.Cleanup("resource") MyResource resource = new MyResource();
    }

}