package com.renrenxian.manage.persistence;

import com.renrenxian.manage.model.Yzm;

public interface YzmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yzm
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yzm
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    int insert(Yzm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yzm
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    int insertSelective(Yzm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yzm
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    Yzm selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yzm
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    int updateByPrimaryKeySelective(Yzm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yzm
     *
     * @mbggenerated Thu Oct 30 00:39:34 CST 2014
     */
    int updateByPrimaryKey(Yzm record);
}