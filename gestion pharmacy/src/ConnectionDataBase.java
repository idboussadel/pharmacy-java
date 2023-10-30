/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
import javax.swing.JOptionPane;

public class ConnectionDataBase{
  public static Connection getConnection(){
    Connection connection = null;
    try{
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacie","root","");  
       } catch (SQLException ex){ 
              JOptionPane.showMessageDialog(null,"Connection Failed");
                                 }
    return connection;
                                          }
                                }
