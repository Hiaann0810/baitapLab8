/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8;
import java.util.Scanner;


public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    private SanPham() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    public double tinhThueNhapKhau(){
        return this.donGia * 10/100;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên sản nhẩm :");
        tenSP = sc.nextLine();
        System.out.println("Mời nhập đơn giá :");
        donGia = sc.nextInt();
        System.out.println("Mời nhập giảm giá :");
        giamGia = sc.nextInt();
        System.out.println("Mời nhập thuế nhập khẩu :");
        sc.nextInt();
    }
    public void xuat(){
        System.out.println("Tên sản phẩm :" + getTenSP());
        System.out.println("Đơn giá :"+ getDonGia());
        System.out.println("Giảm giá :"+ getGiamGia());
        System.out.println("Thuế nhập khẩu :"+tinhThueNhapKhau());
    }
    public static void main(String[] args) {
        SanPham sp = new SanPham();
       sp.nhap();
       sp.xuat();
    }
    
}
