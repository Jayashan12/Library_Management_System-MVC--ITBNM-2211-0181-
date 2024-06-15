/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class bookController {
public static void Form1(String bookid, String title, String authur, String genre, String year, String quantity) {
new model.Addbooks().Form1(bookid,title, authur, genre, year, quantity);
JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
}  
}
