package com.restaurant.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.restaurant.dao.QueueMapper;
import com.restaurant.model.Queue;
import com.restaurant.service.QueueService;
/**
 * 排号服务
 * @author jat
 *
 */
public class QueueServiceImpl implements QueueService {

	@Autowired
	private QueueMapper queueMapper;
	
	@Override
	public int addQueue(Queue queue) {
		// TODO Auto-generated method stub
		int result = 0;
		if (queue!=null) {
			queue.setCreateTime(new Date(System.currentTimeMillis()));
			result = queueMapper.insert(queue);
		}
		
		return result;
	}

	@Override
	public int deleteQueue(int id) {
		// TODO Auto-generated method stub
		int result = 0;
		if (id>0) {
			result = queueMapper.deleteByPrimaryKey(id);
		}
		return result;
	}

	@Override
	public String queryQueue(int index, int last,int category) {
		// TODO Auto-generated method stub
		return null;
	}

}
