package com.restaurant.service.impl;

import java.sql.Date;

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
		if (queue!=null) {
			queue.setCreateTime(new Date(System.currentTimeMillis()));
			queueMapper.insert(queue);
		}
		
		return 0;
	}

	@Override
	public int deleteQueue(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
