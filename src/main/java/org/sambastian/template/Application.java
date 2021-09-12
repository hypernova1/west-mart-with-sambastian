package org.sambastian.template;

import org.sam.server.annotation.ComponentScan;
import org.sam.server.http.context.HttpServer;

@ComponentScan
public class Application {
    public static void main(String[] args) {
        HttpServer.start();
    }
}
