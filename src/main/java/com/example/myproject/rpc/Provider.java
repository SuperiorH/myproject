package com.example.myproject.rpc;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Provider {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1234);
        Map<Object, Object> services = new HashMap<>();
        services.put(HelloService.class.getName(), new HelloServiceImpl());
        while (true) {
            System.out.println("服务提供者启动，等待客户端调用…………");
            Socket socket = server.accept();
            //读取服务信息
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            String interfaceName = in.readUTF();
            String methodName = in.readUTF();
            Class<?>[] parameterTypes = (Class<?>[]) in.readObject();
            Object[] arguments = (Object[]) in.readObject();
            System.out.println("客户端调用服务端接口" + interfaceName + "的" + methodName + "方法");
            //执行调用
            Class serviceClass = Class.forName(interfaceName);//得到接口的class
            Object service = services.get(interfaceName);//取得服务实现的对象
            Method method = serviceClass.getMethod(methodName, parameterTypes);//获得要调用的方法
            Object result = method.invoke(service, arguments);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(result);
            System.out.println("服务端返回结果为：" + result);
        }
    }
}