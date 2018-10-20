/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fc
 */
public class conexionDB {

    private Connection cn = null;
    //instancia cath
    private String urlSqlServer = "jdbc:sqlserver://localhost:49547;databaseName=HOTEL;integratedSecurity=false;user=sa;password=Sql4321";
    //private String urlSqlServer = "jdbc:sqlserver://localhost:61964;databaseName=HOTEL;integratedSecurity=false;user=sa;password=Sql4321";

    public Connection getConexionSqlServer() throws SQLException {
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            cn = DriverManager.getConnection(urlSqlServer);
            return cn;
        } catch (SQLException ex) {
            return null;
        }
    }
}
