/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author admin
 */
public class GiangVienCoHuu extends GiangVien {

    private double luongCoBan;
    private double heSo;

    public GiangVienCoHuu(String hoTen, Date ngaySinh, String hocHam, String hocVi, Date ngayBatDau, double luongCoBan, double heSo) {
        super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDau);
        this.luongCoBan = luongCoBan;
        this.heSo = heSo;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }
    
    @Override
    public double tinhTienLuong(double soGio) {
        return soGio * 90000 + this.luongCoBan * this.heSo;
    }

    @Override
    public String toString() {
        return String.format("%sLuong co ban: %.1f\nHe so: %.1f\n", super.toString(), this.luongCoBan, this.heSo);
    }
}
