/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import duan1.conDB;
import model.sanPhamModel;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class sanPhamSr {
    private Connection conn;

    public sanPhamSr() {
        conn = conDB.getMyConnection();
    }
    
    public  ArrayList<sanPhamModel> getData() throws SQLException{
        ArrayList<sanPhamModel> lst = new ArrayList<>();
        String query = "select masp, soluongtonkho, ram, cpu, gia, mausac, gpu from SanPham";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(query);
        
        
        while(rs.next()){
            sanPhamModel sp = new sanPhamModel();
            sp.setMaSP(rs.getString(1));
            sp.setSoLuong(rs.getInt(2));
            sp.setRAM(rs.getString(3));
            sp.setCPU(rs.getString(4));
            sp.setGia(rs.getInt(5));
            sp.setMauSac(rs.getString(6));
            sp.setGPU(rs.getString(7));
            
            lst.add(sp);
        }
               return lst;
        
    }
    
}
