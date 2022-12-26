/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import static bth.CauHinh.SCANNER;
import entity.GiangVien;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author admin
 */
public class QLGiangVien {

    private List<GiangVien> dsGiangVien = new ArrayList<>();

    public List<GiangVien> getDsGiangVien() {
        return dsGiangVien;
    }

    public void setDsGiangVien(List<GiangVien> dsGiangVien) {
        this.dsGiangVien = dsGiangVien;
    }

    public void themGV(GiangVien gv) {
        this.dsGiangVien.add(gv);
    }

    public void themGV(GiangVien... dsGV) {
        this.dsGiangVien.addAll(Arrays.asList(dsGV));
    }

    public void xoaGV(GiangVien gv) {
        this.dsGiangVien.remove(gv);
    }

    public void xoaGV(GiangVien... dsGV) {
        this.dsGiangVien.removeAll(Arrays.asList(dsGV));
    }

    public List<GiangVien> traCuu(String kw) {
        return this.dsGiangVien.stream().filter(gv -> gv.getHoTen().equals(kw) || gv.getHocHam().equals(kw) || gv.getHocVi().equals(kw)).collect(Collectors.toList());
    }
    
    public List<GiangVien> traCuu() {
        double tb = this.dsGiangVien.stream().flatMapToDouble(gv -> DoubleStream.of(gv.getLuong())).average().getAsDouble();
        return this.dsGiangVien.stream().filter(gv -> gv.getLuong() >= tb).collect(Collectors.toList());
    }
    
    public void tinhLuong() {
        this.dsGiangVien.forEach(gv -> {
            System.out.printf("\n== NHAP LUONG CHO GV %s ==\n", gv.getHoTen().toUpperCase());
            System.out.printf("Nhap so gio lam viec: ");
            gv.setLuong(gv.tinhTienLuong(SCANNER.nextDouble()));
        });
    }
}
