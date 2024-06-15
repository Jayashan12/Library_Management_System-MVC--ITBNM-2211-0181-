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
public class adminController {
public static void Form(String id, String username, String password, String email) {
new model.AddRecord().Form(id,username, password, email);
JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
}   
    
}
