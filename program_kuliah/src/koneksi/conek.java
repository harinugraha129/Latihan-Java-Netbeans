/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author YUDHA_P
 */
public class conek {
    private static Connection koneksi;
    private static Driver Driver;
        
    public static Connection GetConnection()throws SQLException{
       if (koneksi==null){
           Driver = new Driver();
           
       koneksi=DriverManager.getConnection("jdbc:mysql://localhost/dbperkuliahan", "root", "123456");
       }      catch (SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN");
    return koneksi;
    }
    
    
}
