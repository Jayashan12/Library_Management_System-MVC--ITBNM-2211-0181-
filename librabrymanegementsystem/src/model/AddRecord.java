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
public class AddRecord {
    Statement stmt;
public void Form(String id, String username, String password, String email) {
try {
stmt = databaseconnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO admin VALUES('"+id+"', '"+username+"', '"+password+"', '"+email+"')");
} catch (Exception e) {
e.printStackTrace();
}}}
