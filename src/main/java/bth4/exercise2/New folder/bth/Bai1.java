/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth;

import service.QLHinh;
import entity.Hinh;
import entity.HinhChuNhat;
import entity.HinhVuong;

/**
 *
 * @author admin
 */
public class Bai1 {
    
       public static void main(String[] args) throws ClassNotFoundException {
           QLHinh ql = new QLHinh();
           
           Hinh h1 = new HinhChuNhat("HCN1", 50, 40);
           Hinh h2 = new HinhChuNhat("HCN2", 60, 30);
           Hinh h3 = new HinhChuNhat("HCN3", 20, 70);
           Hinh h4 = new HinhVuong("HV1", 55);
           Hinh h5 = new HinhVuong("HV2", 37);
           Hinh h6 = new HinhVuong("HV3", 49);
           ql.themHinh(h1, h2, h3, h4, h5, h6);
           
           System.out.println("\n== DANH SACH BAN DAU ==");
           ql.hienThiDS();
           
           System.out.println("\n== DANH SACH SAP XEP TANG DAN THEO DIEN TICH ==");
           ql.sapXepDT();
           ql.hienThiDS();
           
           System.out.println("\n== DANH SACH SAP XEP GIAM DAN THEO CHU VI==");
           ql.sapXepCV();
           ql.hienThiDS();
           
           System.out.println("\n== DANH SACH CAC HV ==");
           ql.traCuu("entity.HinhVuong").forEach(hinh -> System.out.println(hinh));
    }
}
