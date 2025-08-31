package com.example.config;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "app.properties";
        AppSettings.getInstance().loadFromFile(Path.of(path)); // not thread-safe, re-loadable
        System.out.println("app.name=" + AppSettings.getInstance().get("app.name"));
        System.out.println("instance=" + System.identityHashCode(AppSettings.getInstance()));
    }
    //
}
