/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Hinh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QLHinh {
    private List<Hinh> dsHinh = new ArrayList<>();

    public List<Hinh> getDsHinh() {
        return dsHinh;
    }

    public void setDsHinh(List<Hinh> dsHinh) {
        this.dsHinh = dsHinh;
    }
    
    public void themHinh(Hinh hinh) {
        this.dsHinh.add(hinh);
    }
    
    public void themHinh(Hinh... dsHinh) {
        this.dsHinh.addAll(Arrays.asList(dsHinh));
    }
    
    public void xoaHinh(Hinh hinh) {
        this.dsHinh.remove(hinh);
    }
    
    public void xoaHinh(Hinh... dsHinh) {
        this.dsHinh.removeAll(Arrays.asList(dsHinh));
    }
    
    public void hienThiDS() {
        this.dsHinh.forEach(hinh -> System.out.println(hinh));
    }
    
    public List<Hinh> traCuu(String type) throws ClassNotFoundException {
        Class c = Class.forName(type);
        return this.dsHinh.stream().filter(hinh -> c.isInstance(hinh)).collect(Collectors.toList());
    }
    
    public void sapXepDT() {
        this.dsHinh.sort((h1, h2) -> h1.tinhDienTich() > h2.tinhDienTich() ? 1 : -1);
    }
    
    public void sapXepCV() {
        this.dsHinh.sort((h1, h2) -> h1.tinhChuVi() < h2.tinhChuVi() ? 1 : -1);
    }
}
