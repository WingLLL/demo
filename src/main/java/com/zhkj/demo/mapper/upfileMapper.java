package com.zhkj.demo.mapper;

import com.zhkj.demo.model.upfile;
import com.zhkj.demo.model.upfileExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface upfileMapper {
    @SelectProvider(type=upfileSqlProvider.class, method="countByExample")
    long countByExample(upfileExample example);

    @DeleteProvider(type=upfileSqlProvider.class, method="deleteByExample")
    int deleteByExample(upfileExample example);

    @Insert({
        "insert into upfile (f_id, f_time)",
        "values (#{fId,jdbcType=INTEGER}, #{fTime,jdbcType=CHAR})"
    })
    int insert(upfile record);

    @InsertProvider(type=upfileSqlProvider.class, method="insertSelective")
    int insertSelective(upfile record);

    @SelectProvider(type=upfileSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="f_id", property="fId", jdbcType=JdbcType.INTEGER),
        @Result(column="f_time", property="fTime", jdbcType=JdbcType.CHAR)
    })
    List<upfile> selectByExample(upfileExample example);

    @UpdateProvider(type=upfileSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") upfile record, @Param("example") upfileExample example);

    @UpdateProvider(type=upfileSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") upfile record, @Param("example") upfileExample example);
}