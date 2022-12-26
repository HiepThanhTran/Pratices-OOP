/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author admin
 */
public class HinhChuNhat extends Hinh {

    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(String ten, double chieuDai, double chieuRong) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    @Override
    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (this.chieuDai + this.chieuRong);
    }
}
