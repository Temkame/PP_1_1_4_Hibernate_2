package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 35);
        userService.saveUser("Antov", "Kulibin", (byte) 25);
        userService.saveUser("Stas", "Mihailjlob", (byte) 55);
        userService.saveUser("Andrey", "Zadrotov", (byte) 27);

        System.out.println(userService.getAllUsers());

        userService.removeUserById(1);

        userService.cleanUsersTable();

        userService.dropUsersTable();

        Util.closeSessionFactory();
    }
}