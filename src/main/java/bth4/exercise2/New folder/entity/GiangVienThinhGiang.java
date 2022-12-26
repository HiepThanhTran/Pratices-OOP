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
public class GiangVienThinhGiang extends GiangVien {

    private String noiCongTac;

    public GiangVienThinhGiang(String hoTen, Date ngaySinh, String hocHam, String hocVi, Date ngayBatDau, String noiCongTac) {
        super(hoTen, ngaySinh, hocHam, hocVi, ngayBatDau);
        this.noiCongTac = noiCongTac;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    @Override
    public double tinhTienLuong(double soGio) {
        return soGio * 90000;
    }

    @Override
    public String toString() {
        return String.format("%sNoi cong tac: %s\n", super.toString(), this.noiCongTac);
    }
}
