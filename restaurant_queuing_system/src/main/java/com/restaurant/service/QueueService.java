package com.restaurant.service;

import com.restaurant.model.Queue;

/**
 * 排号
 * @author jat
 *
 */
public interface QueueService {
	/**
	 * 添加排号
	 * @param queue
	 * @return
	 */
	public int addQueue(Queue queue);
	/**
	 * 根据id删除排号
	 * @param id
	 * @return
	 */
	public int deleteQueue(int id);
}
