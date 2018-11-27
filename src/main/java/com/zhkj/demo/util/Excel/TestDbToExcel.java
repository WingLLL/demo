package com.zhkj.demo.util.Excel;


import java.util.List;

/**
 * Created by zhaoyu
 */
public class TestDbToExcel {
    public static void main(String[] args) {
        //得到表格中所有的数据
        List<Anchor> listExcel= AnchorService.getAllByExcel("d://111.xls");
        /*//得到数据库表中所有的数据
        List<Anchor> listDb=AnchorService.getAllByDb();*/

        ExcelImport db=new ExcelImport();


        for (Anchor Anchor : listExcel) {
            String name=Anchor.getAnchorName();
            if (!AnchorService.isExist(name)) {
                //不存在就添加
                String sql="insert into activity_anchor (anchorname,value,url,time,imghost) values(?,?,?,?,?)";
                String[] str=new String[]{Anchor.getAnchorName(),Anchor.getValue().toString(),Anchor.geturl(),Anchor.getTime(),Anchor.getImgHost()+""};
                db.AddU(sql, str);
            }else {
                //存在就更新
                String sql="update activity_anchor set url=?,value=?,time=?,imghost=? where anchorname=?";
                String[] str=new String[]{Anchor.geturl(),Anchor.getValue().toString(),Anchor.getTime(),Anchor.getImgHost()+"",name+""};
                db.AddU(sql, str);
            }
        }
    }
}
