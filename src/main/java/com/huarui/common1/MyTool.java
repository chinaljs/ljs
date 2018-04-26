package com.huarui.common1;

/**
 * Created by Administrator on 2018/4/24.
 */
//@Component
public class MyTool {

    private String serverPath;

    public MyTool() {
    }

    public MyTool(String serverPath) {
        this.serverPath = serverPath;
    }

    public  void test(){
        System.out.println("上传文件到：" + serverPath);
    }
}
