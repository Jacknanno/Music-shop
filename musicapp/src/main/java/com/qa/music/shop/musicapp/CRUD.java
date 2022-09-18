package com.qa.music.shop.musicapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class CRUD<mysql> {

    private static Object java;

    public static final Logger LOGGER = extracted();
    private static com.qa.music.shop.musicapp.Logger extracted() {
        return Logger.getLogger(CRUD.java);
    }

  
    private String password;

    private mysql database;

    private String root;

    private String h2;/ /**
     * @param h2
     * @param database
     * @param root
     * @param password
     */
    public CRUD(String h2, mysql database, String root, String password) {
        this.h2 = h2;
        this.database = database;
        this.root = root;
        this.password = password;
    }

    
    
}
