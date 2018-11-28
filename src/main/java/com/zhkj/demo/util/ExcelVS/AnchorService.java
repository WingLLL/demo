package com.zhkj.demo.util.ExcelVS;

import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyu
 */
public class AnchorService {
    public static List<AnchorVS> getAllByDb(){
        List<AnchorVS> list=new ArrayList<AnchorVS>();

        try {
            ExcelImport db=new ExcelImport();
            String sql="select * from activity_anchor_vs";
            ResultSet rs= db.Search(sql, null);
            while (rs.next()) {
                String name=rs.getString("name");
                String name_vs=rs.getString("name_vs");
                String url=rs.getString("url");
                String url_vs=rs.getString("url_vs");
                String time=rs.getString("time");
                String imghost=rs.getString("imghost");
                String imghost_vs=rs.getString("imghost_vs");
                Integer value=rs.getInt("value");
                Integer value_vs=rs.getInt("value_vs");
                String vs=rs.getString("vs");
                list.add(new AnchorVS(name,name_vs,url,url_vs,value,value_vs,imghost,imghost_vs,time,vs));
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
    public static List<AnchorVS> getAllByExcel(String file){
        List<AnchorVS> list=new ArrayList<AnchorVS>();
        try {
            Workbook rwb=Workbook.getWorkbook(new File(file));
            Sheet rs=rwb.getSheet(0);
            int clos=rs.getColumns();//得到所有的列
            int rows=rs.getRows();//得到所有的行

            System.out.println(clos+" rows:"+rows);
            for (int i = 1; i < rows; i++) {
                for (int j = 0; j < clos; j++) {
                    //第一个是列数，第二个是行数
                    String time = rs.getCell(j++,i).getContents();
                    String name=rs.getCell(j++, i).getContents();//默认最左边编号也算一列 所以这里得j++
                    Integer value= Integer.parseInt(rs.getCell(j++, i).getContents());
                    String imghost=rs.getCell(j++, i).getContents();
                    String url=rs.getCell(j++, i).getContents();
                    String vs = rs.getCell(j++,i).getContents();
                    String imghost_vs=rs.getCell(j++, i).getContents();
                    String url_vs=rs.getCell(j++, i).getContents();
                    Integer value_vs= Integer.parseInt(rs.getCell(j++, i).getContents().trim());
                    String name_vs=rs.getCell(j++, i).getContents();
                    list.add(new AnchorVS(name,name_vs,url,url_vs,value,value_vs,imghost,imghost_vs,time,vs));
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
            ResultSet rs=db.Search("select * from activity_anchor_vs where name=?", new String[]{name+""});
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
