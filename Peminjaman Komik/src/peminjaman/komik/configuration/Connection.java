/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjaman.komik.configuration;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author OWNER
 */
public class Connection {
    private com.mysql.jdbc.Connection connection;
    
    public com.mysql.jdbc.Connection openConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/peminjamankomik", "root", "");
            System.out.println("Koneksi Berhasil");
            return connection;
        } catch (ClassNotFoundException ex) {
            System.out.println("Koneksi Gagal. Class tidak ditemukan");
        } catch (SQLException ex) {
            System.out.println("Koneksi Gagal. SQLException");
        }
        return null;
    }
    
    public void closeConnection(){
        
        
    }
}
