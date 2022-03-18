package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.awt.dnd.DragGestureEvent;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

        private static final UserService userService = new UserServiceImpl();

        public static void main(String[] args) {
            userService.createUsersTable();
            userService.saveUser("Artem", "Fokin", (byte) 20);
            userService.saveUser("Sergey", "Lomov", (byte) 30);
            userService.saveUser("Mihail", "Rognin", (byte) 45);
            userService.saveUser("Evgeniy", "Artemov", (byte) 40);
            System.out.println(userService.getAllUsers());
//            userService.cleanUsersTable();
//            userService.dropUsersTable();
        }
}
