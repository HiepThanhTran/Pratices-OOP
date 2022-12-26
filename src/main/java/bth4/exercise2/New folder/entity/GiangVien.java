/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import static bth.CauHinh.simpleDateFormat;

import java.util.Date;

/**
 *
 * @author admin
 */
public abstract class GiangVien {

    private String hoTen;
    private Date ngaySinh;
    private String hocHam;
    private String hocVi;
    private Date ngayBatDau;
    private double luong;

    public GiangVien(String hoTen, Date ngaySinh, String hocHam, String hocVi, Date ngayBatDau) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBatDau = ngayBatDau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public abstract double tinhTienLuong(double soGio);

    public String toString() {
        return String.format("Ho ten: %s\n"
                + "Ngay sinh: %s\n"
                + "Hoc ham: %s\n"
                + "Hoc vi: %s\n"
                + "Ngay bat dau: %s\n",hoTen, simpleDateFormat.format(ngaySinh), hocHam, hocVi, simpleDateFormat.format(ngayBatDau));
    }
}
