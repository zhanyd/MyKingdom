package io.imking.biz.mapping;

import io.imking.biz.domain.CustInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CustInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_info
     *
     * @mbg.generated Fri Jan 19 10:30:57 CST 2018
     */
    @Delete({
        "delete from tc_cust_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_info
     *
     * @mbg.generated Fri Jan 19 10:30:57 CST 2018
     */
    @Insert({
        "insert into tc_cust_info (id, cust_name, ",
        "wechat, qq, cc_time, ",
        "email, phone, create_time)",
        "values (#{id,jdbcType=BIGINT}, #{custName,jdbcType=VARCHAR}, ",
        "#{wechat,jdbcType=VARCHAR}, #{qq,jdbcType=VARCHAR}, #{ccTime,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(CustInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_info
     *
     * @mbg.generated Fri Jan 19 10:30:57 CST 2018
     */
    @InsertProvider(type=CustInfoSqlProvider.class, method="insertSelective")
    int insertSelective(CustInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_info
     *
     * @mbg.generated Fri Jan 19 10:30:57 CST 2018
     */
    @Select({
        "select",
        "id, cust_name, wechat, qq, cc_time, email, phone, create_time",
        "from tc_cust_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="cust_name", property="custName", jdbcType=JdbcType.VARCHAR),
        @Result(column="wechat", property="wechat", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="cc_time", property="ccTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CustInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_info
     *
     * @mbg.generated Fri Jan 19 10:30:57 CST 2018
     */
    @UpdateProvider(type=CustInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CustInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tc_cust_info
     *
     * @mbg.generated Fri Jan 19 10:30:57 CST 2018
     */
    @Update({
        "update tc_cust_info",
        "set cust_name = #{custName,jdbcType=VARCHAR},",
          "wechat = #{wechat,jdbcType=VARCHAR},",
          "qq = #{qq,jdbcType=VARCHAR},",
          "cc_time = #{ccTime,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(CustInfo record);
}