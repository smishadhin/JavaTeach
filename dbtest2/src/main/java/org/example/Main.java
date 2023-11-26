package org.example;

import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/shadhin";
    static final String USER = "root";
    static final String PASS = "18081994";
    static final String QUERY = "SELECT*FROM info";

    public static void main(String[] args) {
//        // Open a connection
//        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(QUERY); {
//            // Extract data from result set
//            while (rs.next()) {
//                // Retrieve by column name
//                System.out.print("ID: " + rs.getInt("id"));
//                System.out.print(", Name: " + rs.getString("name"));
//                System.out.print(", age: " + rs.getInt("age"));
//
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

try{
    Main main = new Main();
    main.dbConnection();
}catch (Exception e){

}



    }


    void dbConnection() throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shadhin","root","18081994");


            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM info");
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Name: " + rs.getString("name"));
                System.out.print(", age: " + rs.getInt("age"));
                System.out.println();

            }


        if(!connection.isClosed()){
            System.out.println("true");
        }else {
            System.out.println("open");
        }

    }
}