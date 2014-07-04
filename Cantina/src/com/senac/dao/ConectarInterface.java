/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.dao;

/**
 *
 * @author Daniel
 */
public interface ConectarInterface {
    
    String driverJDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String host = "jdbc:sqlserver://localhost;databaseName=Cantina";
    String usuario = "sa";
    String senha = "12345";
    
}
