/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Modelo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.Modelo.Huesped;
import com.conexion.conexionDB;
import java.sql.PreparedStatement;
/**
 *
 * @author CatherineV
 */
public class HuespedI {
    
    public static boolean agregarHuesped(Huesped huesped1){
 boolean agregado=false;
  try {
   conexionDB c = new conexionDB();
   Connection con = c.getConexionSqlServer();
   if(con!=null){
    String consulta = "INSERT INTO HUESPED VALUES ('"+huesped1.getNombre()+"','"+huesped1.getApellido()+"',"+huesped1.getDireccion()+"')";
           
         PreparedStatement pst;
          pst = con.prepareStatement(consulta);
          pst.executeQuery();
          agregado=true;
   }    
  /*
    Statement st;
    st = con.prepareStatement(null);
    st.executeUpdate("INSERT INTO HUESPED VALUES (NULL,'"+huesped1.getNombre()+"','"+huesped1.getApellido()+"',"+huesped1.getDireccion()+"')");
   */
  } catch (SQLException e) {
 agregado=false;
   e.printStackTrace(); 
  }
 return agregado;
 
    }
}

    






 
 