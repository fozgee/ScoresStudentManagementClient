/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author phongdh
 */
public class Taikhoan {
    private int id;
    private String tendangnhap;
    private String tendaydu;
    private String matkhau;
    private String ngaysinh;
    private boolean gioitinh;
    private int lophoc;
    private int quyen;

    public Taikhoan(int id, String tendangnhap, String tendaydu, String ngaysinh, boolean gioitinh, int lophoc, int quyen) {
        this.id = id;
        this.tendangnhap = tendangnhap;
        this.tendaydu = tendaydu;
        
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.lophoc = lophoc;
        this.quyen = quyen;
    }

    public Taikhoan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTendaydu() {
        return tendaydu;
    }

    public void setTendaydu(String tendaydu) {
        this.tendaydu = tendaydu;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getLophoc() {
        return lophoc;
    }

    public void setLophoc(int lophoc) {
        this.lophoc = lophoc;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }
    
}
