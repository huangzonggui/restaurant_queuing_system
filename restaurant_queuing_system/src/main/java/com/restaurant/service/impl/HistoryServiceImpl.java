package com.restaurant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.restaurant.dao.HistoryMapper;
import com.restaurant.model.History;
import com.restaurant.service.HistoryService;

/**
 * 历史记录
 * @author jat
 *
 */
public class HistoryServiceImpl implements HistoryService {
	
	@Autowired
	private HistoryMapper historyMapper;

	@Override
	public int addOrderInHistory(History history) {
		// TODO Auto-generated method stub
		int result = 0;
		if (history!=null) {
			result = historyMapper.insert(history);
		}
		return result;
	}

	@Override
	public String queryHistory(int user_id, int index, int last) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String queryHistory(int index, int last) {
		// TODO Auto-generated method stub
		return null;
	}

}
