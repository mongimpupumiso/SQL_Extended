package com.mongi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// DATABASE CLASS

    public class Database {

        // CONNECTION METHOD
        public static Connection getConnection(){
            Connection connection = null;
            try{
                Class.forName("com.postgresql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql//localhost:5432/test","postgres","0321");

            }catch (Exception e){
                e.printStackTrace();
            }
            return connection;
        }

        // MAIN METHOD
        public static void main(String[] args) {
            Connection connection = null;
            try {
                connection = Database.getConnection();
                if(connection != null){
                    System.out.println("connection is okay");
                }

            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if (connection != null){
                    try {
                        connection.close();
                    }catch (SQLException e){
                        e.printStackTrace();
                    }

                }

            }

        }

    }


