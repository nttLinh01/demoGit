/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import duan1.conDB;
import model.hoaDonModel;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class hoaDonSr {
    private Connection conn;

    public hoaDonSr() {
    }
    
    public ArrayList<hoaDonModel> getData() throws SQLException{
        String query = "select masp, soluongtonkho, ram, cpu, gia, mausac, gpu from SanPham";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(query);
        
        while(rs.next()){
            hoaDonModel hd = new hoaDonModel()
        }
    }
}
