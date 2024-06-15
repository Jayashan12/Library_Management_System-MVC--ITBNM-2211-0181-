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
public class Addmembers {
        Statement stmt;
public void Form2(String id, String name, String age, String gender, String address, String contact) {
try {
stmt = databaseconnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO members VALUES('"+id+"', '"+name+"', '"+age+"', '"+gender+"','"+address+"', '"+contact+"')");
} catch (Exception e) {
e.printStackTrace();
}
}
}
