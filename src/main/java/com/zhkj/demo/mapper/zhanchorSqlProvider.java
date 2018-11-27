package com.zhkj.demo.mapper;

import com.zhkj.demo.model.zhanchor;
import com.zhkj.demo.model.zhanchorExample.Criteria;
import com.zhkj.demo.model.zhanchorExample.Criterion;
import com.zhkj.demo.model.zhanchorExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class zhanchorSqlProvider {

    public String countByExample(zhanchorExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("zhanchor");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(zhanchorExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("zhanchor");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(zhanchor record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("zhanchor");
        
        if (record.getZid() != null) {
            sql.VALUES("zid", "#{zid,jdbcType=INTEGER}");
        }
        
        if (record.getZname() != null) {
            sql.VALUES("zname", "#{zname,jdbcType=VARCHAR}");
        }
        
        if (record.getZroomid() != null) {
            sql.VALUES("zroomid", "#{zroomid,jdbcType=INTEGER}");
        }
        
        if (record.getFunsnum() != null) {
            sql.VALUES("funsnum", "#{funsnum,jdbcType=INTEGER}");
        }
        
        if (record.getZpic() != null) {
            sql.VALUES("zpic", "#{zpic,jdbcType=VARCHAR}");
        }
        
        if (record.getZintro() != null) {
            sql.VALUES("zintro", "#{zintro,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(zhanchorExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("zid");
        } else {
            sql.SELECT("zid");
        }
        sql.SELECT("zname");
        sql.SELECT("zroomid");
        sql.SELECT("funsnum");
        sql.SELECT("zpic");
        sql.SELECT("zintro");
        sql.FROM("zhanchor");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        zhanchor record = (zhanchor) parameter.get("record");
        zhanchorExample example = (zhanchorExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("zhanchor");
        
        if (record.getZid() != null) {
            sql.SET("zid = #{record.zid,jdbcType=INTEGER}");
        }
        
        if (record.getZname() != null) {
            sql.SET("zname = #{record.zname,jdbcType=VARCHAR}");
        }
        
        if (record.getZroomid() != null) {
            sql.SET("zroomid = #{record.zroomid,jdbcType=INTEGER}");
        }
        
        if (record.getFunsnum() != null) {
            sql.SET("funsnum = #{record.funsnum,jdbcType=INTEGER}");
        }
        
        if (record.getZpic() != null) {
            sql.SET("zpic = #{record.zpic,jdbcType=VARCHAR}");
        }
        
        if (record.getZintro() != null) {
            sql.SET("zintro = #{record.zintro,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("zhanchor");
        
        sql.SET("zid = #{record.zid,jdbcType=INTEGER}");
        sql.SET("zname = #{record.zname,jdbcType=VARCHAR}");
        sql.SET("zroomid = #{record.zroomid,jdbcType=INTEGER}");
        sql.SET("funsnum = #{record.funsnum,jdbcType=INTEGER}");
        sql.SET("zpic = #{record.zpic,jdbcType=VARCHAR}");
        sql.SET("zintro = #{record.zintro,jdbcType=VARCHAR}");
        
        zhanchorExample example = (zhanchorExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(zhanchor record) {
        SQL sql = new SQL();
        sql.UPDATE("zhanchor");
        
        if (record.getZname() != null) {
            sql.SET("zname = #{zname,jdbcType=VARCHAR}");
        }
        
        if (record.getZroomid() != null) {
            sql.SET("zroomid = #{zroomid,jdbcType=INTEGER}");
        }
        
        if (record.getFunsnum() != null) {
            sql.SET("funsnum = #{funsnum,jdbcType=INTEGER}");
        }
        
        if (record.getZpic() != null) {
            sql.SET("zpic = #{zpic,jdbcType=VARCHAR}");
        }
        
        if (record.getZintro() != null) {
            sql.SET("zintro = #{zintro,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("zid = #{zid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, zhanchorExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}