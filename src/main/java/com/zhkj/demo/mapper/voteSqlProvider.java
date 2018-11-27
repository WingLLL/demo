package com.zhkj.demo.mapper;

import com.zhkj.demo.model.vote;
import com.zhkj.demo.model.voteExample;
import com.zhkj.demo.model.voteExample.Criteria;
import com.zhkj.demo.model.voteExample.Criterion;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;
import java.util.Map;

public class voteSqlProvider {

    public String countByExample(voteExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("vote");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(voteExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("vote");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(vote record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("vote");
        
        if (record.getvId() != null) {
            sql.VALUES("v_id", "#{vId,jdbcType=INTEGER}");
        }
        
        if (record.getvName() != null) {
            sql.VALUES("v_name", "#{vName,jdbcType=CHAR}");
        }
        
        if (record.getvNum() != null) {
            sql.VALUES("v_num", "#{vNum,jdbcType=INTEGER}");
        }
        
        if (record.getvPic() != null) {
            sql.VALUES("v_pic", "#{vPic,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(voteExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("v_id");
        } else {
            sql.SELECT("v_id");
        }
        sql.SELECT("v_name");
        sql.SELECT("v_num");
        sql.SELECT("v_pic");
        sql.FROM("vote");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        vote record = (vote) parameter.get("record");
        voteExample example = (voteExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("vote");
        
        if (record.getvId() != null) {
            sql.SET("v_id = #{record.vId,jdbcType=INTEGER}");
        }
        
        if (record.getvName() != null) {
            sql.SET("v_name = #{record.vName,jdbcType=CHAR}");
        }
        
        if (record.getvNum() != null) {
            sql.SET("v_num = #{record.vNum,jdbcType=INTEGER}");
        }
        
        if (record.getvPic() != null) {
            sql.SET("v_pic = #{record.vPic,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("vote");
        
        sql.SET("v_id = #{record.vId,jdbcType=INTEGER}");
        sql.SET("v_name = #{record.vName,jdbcType=CHAR}");
        sql.SET("v_num = #{record.vNum,jdbcType=INTEGER}");
        sql.SET("v_pic = #{record.vPic,jdbcType=VARCHAR}");
        
        voteExample example = (voteExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(vote record) {
        SQL sql = new SQL();
        sql.UPDATE("vote");
        
        if (record.getvName() != null) {
            sql.SET("v_name = #{vName,jdbcType=CHAR}");
        }
        
        if (record.getvNum() != null) {
            sql.SET("v_num = #{vNum,jdbcType=INTEGER}");
        }
        
        if (record.getvPic() != null) {
            sql.SET("v_pic = #{vPic,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("v_id = #{vId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, voteExample example, boolean includeExamplePhrase) {
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