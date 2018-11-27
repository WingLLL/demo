package com.zhkj.demo.mapper;

import com.zhkj.demo.model.vote;
import com.zhkj.demo.model.voteExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface voteMapper {
    @SelectProvider(type=voteSqlProvider.class, method="countByExample")
    long countByExample(voteExample example);

    @DeleteProvider(type=voteSqlProvider.class, method="deleteByExample")
    int deleteByExample(voteExample example);

    @Delete({
        "delete from vote",
        "where v_id = #{vId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer vId);

    @Select({
            "select",
            "v_id, v_name, v_num, v_pic",
            "from vote order by v_num desc"
    })
    @Results({
            @Result(column="v_id", property="vId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="v_name", property="vName", jdbcType=JdbcType.CHAR),
            @Result(column="v_num", property="vNum", jdbcType=JdbcType.INTEGER),
            @Result(column="v_pic", property="vPic", jdbcType=JdbcType.CHAR)
    })
    List<vote> queryAll();
    @Insert({
        "insert into vote (v_id, v_name, ",
        "v_num, v_pic)",
        "values (#{vId,jdbcType=INTEGER}, #{vName,jdbcType=CHAR}, ",
        "#{vNum,jdbcType=INTEGER}, #{vPic,jdbcType=VARCHAR})"
    })
    int insert(vote record);

    @InsertProvider(type=voteSqlProvider.class, method="insertSelective")
    int insertSelective(vote record);

    @SelectProvider(type=voteSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="v_id", property="vId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="v_name", property="vName", jdbcType=JdbcType.CHAR),
        @Result(column="v_num", property="vNum", jdbcType=JdbcType.INTEGER),
        @Result(column="v_pic", property="vPic", jdbcType=JdbcType.VARCHAR)
    })
    List<vote> selectByExample(voteExample example);

    @Select({
        "select",
        "v_id, v_name, v_num, v_pic",
        "from vote",
        "where v_id = #{vId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="v_id", property="vId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="v_name", property="vName", jdbcType=JdbcType.CHAR),
        @Result(column="v_num", property="vNum", jdbcType=JdbcType.INTEGER),
        @Result(column="v_pic", property="vPic", jdbcType=JdbcType.VARCHAR)
    })
    vote selectByPrimaryKey(Integer vId);

    @UpdateProvider(type=voteSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") vote record, @Param("example") voteExample example);

    @UpdateProvider(type=voteSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") vote record, @Param("example") voteExample example);

    @UpdateProvider(type=voteSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(vote record);

    @Update({
        "update vote",
        "set v_name = #{vName,jdbcType=CHAR},",
          "v_num = #{vNum,jdbcType=INTEGER},",
          "v_pic = #{vPic,jdbcType=VARCHAR}",
        "where v_id = #{vId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(vote record);
}