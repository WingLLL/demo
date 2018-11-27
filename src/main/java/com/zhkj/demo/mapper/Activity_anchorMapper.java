package com.zhkj.demo.mapper;

import com.zhkj.demo.model.Activity_anchor;
import com.zhkj.demo.model.Activity_anchorExample;
import java.util.List;

import com.zhkj.demo.model.zhanchor;
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

public interface Activity_anchorMapper {
    @SelectProvider(type=Activity_anchorSqlProvider.class, method="countByExample")
    long countByExample(Activity_anchorExample example);

    @DeleteProvider(type=Activity_anchorSqlProvider.class, method="deleteByExample")
    int deleteByExample(Activity_anchorExample example);

    @Select({
            "select",
            "anchorname, value, url, time, imghost",
            "from activity_anchor order by value desc"
    })
    @Results({
            @Result(column="anchorname", property="anchorname", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
            @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
            @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
            @Result(column="imghost", property="imghost", jdbcType=JdbcType.VARCHAR)
    })
    List<Activity_anchor> queryAll();


    @Delete({
        "delete from activity_anchor",
        "where anchorname = #{anchorname,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String anchorname);

    @Insert({
        "insert into activity_anchor (anchorname, value, ",
        "url, time, imghost)",
        "values (#{anchorname,jdbcType=VARCHAR}, #{value,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{time,jdbcType=VARCHAR}, #{imghost,jdbcType=VARCHAR})"
    })
    int insert(Activity_anchor record);

    @InsertProvider(type=Activity_anchorSqlProvider.class, method="insertSelective")
    int insertSelective(Activity_anchor record);

    @SelectProvider(type=Activity_anchorSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="anchorname", property="anchorname", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="imghost", property="imghost", jdbcType=JdbcType.VARCHAR)
    })
    List<Activity_anchor> selectByExample(Activity_anchorExample example);

    @Select({
        "select",
        "anchorname, value, url, time, imghost",
        "from activity_anchor",
        "where anchorname = #{anchorname,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="anchorname", property="anchorname", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="imghost", property="imghost", jdbcType=JdbcType.VARCHAR)
    })
    Activity_anchor selectByPrimaryKey(String anchorname);

    @UpdateProvider(type=Activity_anchorSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Activity_anchor record, @Param("example") Activity_anchorExample example);

    @UpdateProvider(type=Activity_anchorSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Activity_anchor record, @Param("example") Activity_anchorExample example);

    @UpdateProvider(type=Activity_anchorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Activity_anchor record);

    @Update({
        "update activity_anchor",
        "set value = #{value,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "time = #{time,jdbcType=VARCHAR},",
          "imghost = #{imghost,jdbcType=VARCHAR}",
        "where anchorname = #{anchorname,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Activity_anchor record);
}