/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSearch {
Statement stmt;
ResultSet rs;
public ResultSet searchadmin(String usName) {
try {
stmt = databaseconnection.getStatementConnection();
String name = usName;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM admin where username='" + name + "'");
} catch (Exception e) {
e.printStackTrace();
}
return rs;
}

public ResultSet alladmin(){
try{
stmt = databaseconnection.getStatementConnection();
rs = stmt.executeQuery("SELECT * FROM admin");
}
catch(Exception e){
}
return rs;
}
public ResultSet allbooks(){
try{
stmt = databaseconnection.getStatementConnection();
rs = stmt.executeQuery("SELECT * FROM books");
}
catch(Exception e){
}
return rs;
}
public ResultSet allmembers(){
try{
stmt = databaseconnection.getStatementConnection();
rs = stmt.executeQuery("SELECT * FROM members");
}
catch(Exception e){
}
return rs;
}
}




