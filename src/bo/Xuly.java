/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import ScoresStudentManagementClient.View.MainSv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import models.Taikhoan;

/**
 *
 * @author phongdh
 */
public class Xuly {

    private BufferedReader in;
    private PrintWriter out;

    public Xuly(Socket socket, BufferedReader in, PrintWriter out) throws IOException {
        this.in = in;
        this.out = out;
        //Socket socket = new Socket("127.0.0.1", 9898);
//        in = new BufferedReader(
//                new InputStreamReader(socket.getInputStream()));
//        out = new PrintWriter(socket.getOutputStream(), true);

    }

    public int login(String user, String pass) throws IOException, Throwable {
        out.println("login");
        out.println(user + ";" + pass);

        return Integer.parseInt(in.readLine());
    }

    public ArrayList GetAllTaikhoan() throws IOException {
        out.println("getallaccount");
        ArrayList<String> list = new ArrayList<String>();
        String[] ss = in.readLine().split("%%");
        for (String s : ss) {
            list.add(s);
        }
        return list;
    }

    public void AddTaikhoan(String tendangnhap, String tendaydu, String matkhau, String ngaysinh, int gioitinh, int lophoc, int quyen) {
        out.println("addaccount");
        out.println(tendangnhap + ";" + tendaydu + ";" + matkhau + ";" + ngaysinh + ";" + gioitinh + ";" + lophoc + ";" + quyen);
    }

    public void UpdateTaikhoan(int id, String tendangnhap, String tendaydu, String ngaysinh, int gioitinh, int lophoc, int quyen) {
        out.println("updateaccount");
        out.println(id + ";" + tendangnhap + ";" + tendaydu + ";" + ngaysinh + ";" + gioitinh + ";" + lophoc + ";" + quyen);
    }

    public void DeleteTaiKhoan(int id) {
        out.println("deleteaccount");
        out.println(id);
    }

//    Diem thi
    public ArrayList GetAllDiemthi(int AccountId) throws IOException {
        out.println("getdiemthi");
        out.println(AccountId);
        ArrayList<String> list = new ArrayList<String>();
        String[] ss = in.readLine().split("%%");
        for (String s : ss) {
            list.add(s);
        }
        return list;
    }

    public ArrayList GetAllLophoc() throws SQLException, IOException {
        out.println("getalllophoc");
        String[] ss = in.readLine().split("%%");
        ArrayList<String> list = new ArrayList<String>();
        for (String s : ss) {
            list.add(s);
        }
        return list;
    }
    public ArrayList GetAllMonhoc() throws SQLException, IOException {
        out.println("getallmonhoc");
        String[] ss = in.readLine().split("%%");
        ArrayList<String> list = new ArrayList<String>();
        for (String s : ss) {
            list.add(s);
        }
        return list;
    }

}
