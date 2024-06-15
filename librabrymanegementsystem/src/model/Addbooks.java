/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class Addbooks {
    Statement stmt;
public void Form1(String bookid, String title, String authur, String genre, String year, String quantity) {
try {
stmt = databaseconnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO books VALUES('"+bookid+"', '"+title+"', '"+authur+"', '"+genre+"','"+year+"', '"+quantity+"')");
} catch (Exception e) {
e.printStackTrace();
}
}
}
