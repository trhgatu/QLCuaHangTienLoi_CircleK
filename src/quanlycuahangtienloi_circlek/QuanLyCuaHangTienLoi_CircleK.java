/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlycuahangtienloi_circlek;

import database_config.JDBCUtils;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class QuanLyCuaHangTienLoi_CircleK {

    public static void main(String[] args) {
       try{
            //b1: tao ket noi
            Connection connect = JDBCUtils.getConnection();
            //b2: tao statement 
            Statement stmt = connect.createStatement();
            //b3: Thuc thi cau lenh sql 
            String sql = "INSERT INTO danhmuc(TenDanhMuc) VALUES ('Hoang')";
        
            int check = stmt.executeUpdate(sql);
            //b4: Xu ly kq  
            System.out.println("So dong thay doi" + check);
            if(check > 0){
                System.out.println("Them du lieu thanh cong");
            }else{
                System.out.println("Them du lieu that bai");
            }      
            //b5: Dong ket noi
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
