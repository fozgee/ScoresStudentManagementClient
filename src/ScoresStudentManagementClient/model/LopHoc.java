/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ScoresStudentManagementClient.model;

/**
 *
 * @author Quang
 */
public class LopHoc {
    private int id;
    private String tenLop;

    public LopHoc() {
    }

    public LopHoc(int id, String tenLop) {
        this.id = id;
        this.tenLop = tenLop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
     
    
}
