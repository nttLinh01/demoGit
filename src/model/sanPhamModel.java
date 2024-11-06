/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class sanPhamModel {
    private String maSP;
    private String RAM;
    private String CPU;
    private String GPU;
    private int gia;
    private String mauSac;
    private String dungLuong;
    private int soLuong;

    public sanPhamModel() {
    }

    public sanPhamModel(String maSP, String RAM, String CPU, String GPU, int gia, String mauSac, String dungLuong, int soLuong) {
        this.maSP = maSP;
        this.RAM = RAM;
        this.CPU = CPU;
        this.GPU = GPU;
        this.gia = gia;
        this.mauSac = mauSac;
        this.dungLuong = dungLuong;
        this.soLuong = soLuong;
    }
    
    

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
    
    
}
