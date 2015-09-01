package com.restaurant.service;

import java.util.List;

import com.restaurant.model.History;

/**
 * 排号结束后进入历史排号，统计业绩
 * @author jat
 *
 */
public interface HistoryService {
	/**
	 * 添加记录
	 * @param history
	 * @return
	 */
	public int addOrderInHistory(History history);
	/**
	 * 根据用户查询历史记录，分页查询
	 * @param user_id 用户id
	 * @param index 开始位置
	 * @param last 结束位置
	 * @return
	 */
	public String queryHistory(int user_id,int index,int last);
	/**
	 * 查询历史记录,分页查询
	 * @param index 开始位置
	 * @param last 结束位置
	 * @return
	 */
	public String queryHistory(int index,int last);
}
