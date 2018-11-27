package com.zhkj.demo.util.Excel;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;

/**
 * Created by zhaoyu
 */
public class AnchorService {
    public static List<Anchor> getAllByDb(){
        List<Anchor> list=new ArrayList<Anchor>();
        try {
            ExcelImport db=new ExcelImport();
            String sql="select * from anchor";
            ResultSet rs= db.Search(sql, null);
            while (rs.next()) {
                String name=rs.getString("anchorname");
                String url=rs.getString("url");
                String time=rs.getString("time");
                String imghost=rs.getString("imghost");
                Integer value=rs.getInt("value");

                list.add(new Anchor(name,value,url,time,imghost));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 查询指定目录中电子表格中所有的数据
     * @param file 文件完整路径
     * @return
     */
    public static List<Anchor> getAllByExcel(String file){
        List<Anchor> list=new ArrayList<Anchor>();
        try {
            Workbook rwb=Workbook.getWorkbook(new File(file));
            Sheet rs=rwb.getSheet(0);
            int clos=rs.getColumns();//得到所有的列
            int rows=rs.getRows();//得到所有的行

            System.out.println(clos+" rows:"+rows);
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < clos; j++) {
                    //第一个是列数，第二个是行数
                    String name=rs.getCell(j++, i).getContents();//默认最左边编号也算一列 所以这里得j++
                    Integer value= Integer.parseInt(rs.getCell(j++, i).getContents().trim());
                    String url=rs.getCell(j++, i).getContents();
                    String time=rs.getCell(j++, i).getContents();
                    String imghost=rs.getCell(j++, i).getContents();

                    list.add(new Anchor(name, value,url,time,imghost));
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;

    }

    /**
     * 通过Id判断是否存在
     * @param name
     * @return
     */
    public static boolean isExist(String name){
        try {
            ExcelImport db=new ExcelImport();
            ResultSet rs=db.Search("select * from activity_anchor where anchorname=?", new String[]{name+""});
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        /*List<Anchor> all=getAllByDb();
        for (Anchor Anchor : all) {
            System.out.println(Anchor.toString());
        }*/

        System.out.println(isExist("快递龙"));

    }
}
