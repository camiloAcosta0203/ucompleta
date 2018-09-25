/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_Datos;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author EliotM
 */
public class Conexiones {    
    
    Connection conectar = null;
    Statement st;

    public Connection conexion1() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/proyectodrawing", "root", "root");
            System.out.println("Conexión a la base de datos " + " ... Ok");
            System.out.println(conectar);
        } catch (Exception e) {
            System.out.println("ERROR Conexión a la base de datos ");
            System.out.print(e.getMessage());
        }
        return conectar;
    }

    public boolean conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");                                      //user  //pass
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/proyectodrawing", "root", "root");
            st = conectar.createStatement();
            System.out.println("Conexion a la base de datos " + " ... OK");
            System.out.println(conectar);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Error en la conexion con la base de datos");
            System.out.println(ex.getMessage());
            return false;
        } catch (ClassNotFoundException ex) {
            
            ex.printStackTrace();
            return false;
        }

        return true;
    }
    
    
}
