package com.renrenxian.manage.persistence;

import com.renrenxian.manage.model.SdanMessage;

public interface SdanMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdan_message
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdan_message
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    int insert(SdanMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdan_message
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    int insertSelective(SdanMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdan_message
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    SdanMessage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdan_message
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    int updateByPrimaryKeySelective(SdanMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdan_message
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    int updateByPrimaryKey(SdanMessage record);
}