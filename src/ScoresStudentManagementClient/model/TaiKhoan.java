/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoresStudentManagementClient.model;

/**
 *
 * @author TungLam
 */
public class TaiKhoan {
    private int id;
    private String taikhoan;
    private String tendaydu;
    private String matkhau;
    private int quyen;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String taiKhoan, String tendaydu, String matKhau, int quyen) {
        this.id = id;
        this.taikhoan = taiKhoan;
        this.tendaydu = tendaydu;
        this.matkhau = matKhau;
        this.quyen = quyen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getTendaydu() {
        return tendaydu;
    }

    public void setTendaydu(String tendaydu) {
        this.tendaydu = tendaydu;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    
    
}
