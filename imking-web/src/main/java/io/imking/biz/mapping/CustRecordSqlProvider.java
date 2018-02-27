package io.imking.biz.mapping;

import io.imking.biz.domain.CustRecord;
import org.apache.ibatis.jdbc.SQL;

public class CustRecordSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_record
     *
     * @mbg.generated Wed Jan 17 21:46:14 CST 2018
     */
    public String insertSelective(CustRecord record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tc_cust_record");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getCustId() != null) {
            sql.VALUES("cust_id", "#{custId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getRemarks() != null) {
            sql.VALUES("remarks", "#{remarks,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_record
     *
     * @mbg.generated Wed Jan 17 21:46:14 CST 2018
     */
    public String updateByPrimaryKeySelective(CustRecord record) {
        SQL sql = new SQL();
        sql.UPDATE("tc_cust_record");
        
        if (record.getCustId() != null) {
            sql.SET("cust_id = #{custId,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getRemarks() != null) {
            sql.SET("remarks = #{remarks,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}