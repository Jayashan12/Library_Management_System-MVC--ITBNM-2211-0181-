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
public class memberController {
    public static void Form2(String id, String name, String age, String gender, String address, String contact) {
new model.Addmembers().Form2(id,name, age, gender, address, contact);
JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
} 
}
