package com.zhkj.demo.mapper;

import com.zhkj.demo.model.uip;
import com.zhkj.demo.model.uipExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface uipMapper {
    @SelectProvider(type=uipSqlProvider.class, method="countByExample")
    long countByExample(uipExample example);

    @DeleteProvider(type=uipSqlProvider.class, method="deleteByExample")
    int deleteByExample(uipExample example);

    @Delete({
        "delete from uip",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into uip (id, ipaddress)",
        "values (#{id,jdbcType=INTEGER}, #{ipaddress,jdbcType=CHAR})"
    })
    int insert(uip record);

    @Select({
            "select",
            "ipaddress",
            "from uip"
    })
    @Results({
            @Result(column="ipaddress", property="ipaddress", jdbcType=JdbcType.CHAR)
    })
    List<String> queryAll();

    @Insert({
            "insert into uip (ipaddress)",
            "values (#{ipaddress,jdbcType=CHAR})"
    })
    int insertuip(String ipaddress);
    @InsertProvider(type=uipSqlProvider.class, method="insertSelective")
    int insertSelective(uip record);

    @SelectProvider(type=uipSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ipaddress", property="ipaddress", jdbcType=JdbcType.CHAR)
    })
    List<uip> selectByExample(uipExample example);

    @Select({
        "select",
        "id, ipaddress",
        "from uip",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ipaddress", property="ipaddress", jdbcType=JdbcType.CHAR)
    })
    uip selectByPrimaryKey(Integer id);

    @UpdateProvider(type=uipSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") uip record, @Param("example") uipExample example);

    @UpdateProvider(type=uipSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") uip record, @Param("example") uipExample example);

    @UpdateProvider(type=uipSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(uip record);

    @Update({
        "update uip",
        "set ipaddress = #{ipaddress,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(uip record);
}