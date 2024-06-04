package class_activities_4;

import class_activities_4.service.impl.HttpServerServiceImpl;

import static class_activities_4.common.SimpleHttpServer.PORT;

public class Main {
    public static void main(String[] args) {
        HttpServerServiceImpl service = new HttpServerServiceImpl();
        service.start(PORT);
    }
}