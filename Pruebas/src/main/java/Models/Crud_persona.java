/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Conexion.Conectores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.CallableStatement;
//import interfaz.CRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;

public class Crud_persona extends Conectores {
    /*public boolean ingresar() {
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "Select * from usuarios";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }*/


//------------------------INGRESAR-----------------------
    public boolean Ingresar() {

        //PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call mostrar()}";
        boolean response = false;

        try {
            cst = con.prepareCall(sql);
            rs = cst.executeQuery();
            response = rs.next();
            if (response) {
                do {
                    System.out.println("El id es: " + rs.getString(1));
                    System.out.println("El nombre es: " + rs.getString(2));
                    System.out.println("El Psswd es: " + rs.getString(3));
                } while (rs.next());
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    //------------------------GUARDAR-----------------------
    public boolean guardar(int id, String nombre, String passwd) {
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call usuarios(?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, id);
            cst.setString(2, nombre);
            cst.setString(3, passwd);
            cst.execute();

            return true;

        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
        }

    }
    
}
