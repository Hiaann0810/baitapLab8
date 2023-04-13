/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8;

/**
 *
 * @author vietthanh
 */
public class SanPham1 {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham1(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham1(String tenSP, double donGia) {
        this(tenSP, donGia, 0);
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

    private double getThueNhapKhau() {
        return this.donGia * 10 / 100;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + getTenSP());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Sản phẩm A", 1000000, 10);
        SanPham sp2 = new SanPham("Sản phẩm B", 2000000);

        sp1.xuat();
        System.out.println();
        sp2.xuat();
    }
}