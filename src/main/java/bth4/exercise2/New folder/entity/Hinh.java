/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public abstract class Hinh {
    private String ten;
    
    public Hinh(String ten) {
        this.ten = ten;
    }
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public abstract double tinhDienTich();
    
    public abstract double tinhChuVi();
    
    public String toString() {
        return String.format("%s\nDien tich: %.1f\nChu vi: %.1f\n", ten, this.tinhDienTich(), this.tinhChuVi());
    }
}
