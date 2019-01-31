package com.example.myproject.test;

import java.util.ServiceLoader;

public interface Cmand {
     void execute();
}

 class ShutdownCommand implements Cmand {
    public void execute() {
        System.out.println("shutdown....");
    }
}
 class StartCommand implements Cmand {
    public void execute() {
        System.out.println("start....");
    }
}
 class SPIMain {
    public static void main(String[] args) {
        ServiceLoader<Cmand> loader = ServiceLoader.load(Cmand.class);
        System.out.println(loader);
        for (Cmand Cmand : loader) {
            Cmand.execute();
        }
    }
}