package com.example.myproject.rpc;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //url前加上http协议头，标明该请求为http请求
        String url = "https://www.baidu.com";
        //组装请求
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet(url);
        //接收响应
        HttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        byte[] byteArray = EntityUtils.toByteArray(entity);
        String result = new String(byteArray, "utf8");
        System.out.println(result);
    }
}
