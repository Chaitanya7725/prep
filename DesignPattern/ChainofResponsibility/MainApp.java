package DesignPattern.ChainofResponsibility;

import DesignPattern.ChainofResponsibility.handlers.Handler;
import DesignPattern.ChainofResponsibility.handlers.RoleCheckHandler;
import DesignPattern.ChainofResponsibility.handlers.UserExistsHandler;
import DesignPattern.ChainofResponsibility.handlers.ValidPasswordHandler;

public class MainApp {

    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database)).setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
        System.out.println(service.logIn("username", "password"));
        System.out.println("==========================================");
        System.out.println(service.logIn("user_username", "password"));
        System.out.println("==========================================");
        System.out.println(service.logIn("admin_username", "admin_password"));
    }

}
