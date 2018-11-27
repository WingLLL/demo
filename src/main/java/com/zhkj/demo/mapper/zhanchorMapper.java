package com.zhkj.demo.mapper;

import com.zhkj.demo.model.zhanchor;
import com.zhkj.demo.model.zhanchorExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface zhanchorMapper {
    @SelectProvider(type=zhanchorSqlProvider.class, method="countByExample")
    long countByExample(zhanchorExample example);

    @DeleteProvider(type=zhanchorSqlProvider.class, method="deleteByExample")
    int deleteByExample(zhanchorExample example);

    @Select({
            "select",
            "zid, zname, zroomid, funsnum, zpic, zintro",
            "from zhanchor"
    })
    @Results({
            @Result(column="zid", property="zid", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="zname", property="zname", jdbcType=JdbcType.VARCHAR),
            @Result(column="zroomid", property="zroomid", jdbcType=JdbcType.INTEGER),
            @Result(column="funsnum", property="funsnum", jdbcType=JdbcType.INTEGER),
            @Result(column="zpic", property="zpic", jdbcType=JdbcType.VARCHAR),
            @Result(column="zintro", property="zintro", jdbcType=JdbcType.VARCHAR)
    })
    List<zhanchor> queryAll();

    @Delete({
        "delete from zhanchor",
        "where zid = #{zid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer zid);

    @Insert({
        "insert into zhanchor (zid, zname, ",
        "zroomid, funsnum, ",
        "zpic, zintro)",
        "values (#{zid,jdbcType=INTEGER}, #{zname,jdbcType=VARCHAR}, ",
        "#{zroomid,jdbcType=INTEGER}, #{funsnum,jdbcType=INTEGER}, ",
        "#{zpic,jdbcType=VARCHAR}, #{zintro,jdbcType=VARCHAR})"
    })
    int insert(zhanchor record);

    @InsertProvider(type=zhanchorSqlProvider.class, method="insertSelective")
    int insertSelective(zhanchor record);

    @SelectProvider(type=zhanchorSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="zid", property="zid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="zname", property="zname", jdbcType=JdbcType.VARCHAR),
        @Result(column="zroomid", property="zroomid", jdbcType=JdbcType.INTEGER),
        @Result(column="funsnum", property="funsnum", jdbcType=JdbcType.INTEGER),
        @Result(column="zpic", property="zpic", jdbcType=JdbcType.VARCHAR),
        @Result(column="zintro", property="zintro", jdbcType=JdbcType.VARCHAR)
    })
    List<zhanchor> selectByExample(zhanchorExample example);

    @Select({
        "select",
        "zid, zname, zroomid, funsnum, zpic, zintro",
        "from zhanchor",
        "where zid = #{zid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="zid", property="zid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="zname", property="zname", jdbcType=JdbcType.VARCHAR),
        @Result(column="zroomid", property="zroomid", jdbcType=JdbcType.INTEGER),
        @Result(column="funsnum", property="funsnum", jdbcType=JdbcType.INTEGER),
        @Result(column="zpic", property="zpic", jdbcType=JdbcType.VARCHAR),
        @Result(column="zintro", property="zintro", jdbcType=JdbcType.VARCHAR)
    })
    zhanchor selectByPrimaryKey(Integer zid);

    @UpdateProvider(type=zhanchorSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") zhanchor record, @Param("example") zhanchorExample example);

    @UpdateProvider(type=zhanchorSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") zhanchor record, @Param("example") zhanchorExample example);

    @UpdateProvider(type=zhanchorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(zhanchor record);

    @Update({
        "update zhanchor",
        "set zname = #{zname,jdbcType=VARCHAR},",
          "zroomid = #{zroomid,jdbcType=INTEGER},",
          "funsnum = #{funsnum,jdbcType=INTEGER},",
          "zpic = #{zpic,jdbcType=VARCHAR},",
          "zintro = #{zintro,jdbcType=VARCHAR}",
        "where zid = #{zid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(zhanchor record);
}