package com.zhbit.dao.lostandfind;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;

import com.zhbit.domain.lostandfind.Lost;



public class LAFDao {

	@Resource
	private SessionFactory sessionFactory;
	
	
	
	//���ʧ����Ϣ
	public Lost insertLost(Lost lost) {
	
		sessionFactory.getCurrentSession().persist(lost);
		return lost;
	}
	
	
	
}
