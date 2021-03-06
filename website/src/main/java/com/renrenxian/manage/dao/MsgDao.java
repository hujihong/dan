package com.renrenxian.manage.dao;

import org.springframework.stereotype.Repository;

import com.renrenxian.manage.model.Msg;
import com.renrenxian.manage.mybatis.BaseMybatisDao;

@Repository("msgDao")
public class MsgDao extends BaseMybatisDao<Msg, Integer>{

	@Override
	public String getMybatisMapperNamesapce() {
		return "com.renrenxian.manage.persistence.MsgMapper";
	}

	
}
