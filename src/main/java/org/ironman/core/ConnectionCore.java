package org.ironman.core;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCore {




    public Connection open() throws Exception {
        // Attributes
        String hostName = "dpg-cikq795ph6eg6kd57o10-a.oregon-postgres.render.com";
        String port = "5432";
        String dataBase = "dbfarmacia";
        String userName = "developer";
        String password = "f9WbWkyeGg4O7ul7KlcsziknwPwBKxmc";

        // Load Driver
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://" + hostName +":" + port + "/" + dataBase;

        // results/return
        return DriverManager.getConnection(url, userName, password);
    }

}
