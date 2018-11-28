package com.zhkj.demo.util.ExcelVS;

import java.sql.*;

/**
 * Created by zhaoyu
 */
public class ExcelImport {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://127.0.0.1:3306/zhkj?useUnicode=true&characterEncoding=UTF8&autoReconnect=true&amp;autoReconnectForPools=true\"";


    Connection con = null;
    ResultSet res = null;

    public void DataBase() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "root");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.err.println("装载 JDBC/ODBC 驱动程序失败。" );
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.err.println("无法连接数据库" );
            e.printStackTrace();
        }
    }

    // 查询
    public ResultSet  Search(String sql, String str[]) {
        DataBase();
        try {
            PreparedStatement pst =con.prepareStatement(sql);
            if (str != null) {
                for (int i = 0; i < str.length; i++) {
                    pst.setString(i + 1, str[i]);
                }
            }
            res = pst.executeQuery();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return res;
    }

    // 增删修改
    public int AddU(String sql, String str[]) {
        int a = 0;
        DataBase();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            if (str != null) {
                for (int i = 0; i < str.length; i++) {
                    pst.setString(i + 1, str[i]);
                }
            }
            a = pst.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return a;
    }

}
