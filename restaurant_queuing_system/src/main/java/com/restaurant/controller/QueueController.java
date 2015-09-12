package com.restaurant.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.JsonArray;
import com.restaurant.dao.HistoryMapper;
import com.restaurant.dao.QueueMapper;
import com.restaurant.model.History;
import com.restaurant.model.Queue;
import com.restaurant.service.HistoryService;
import com.restaurant.service.QueueService;

@Controller
@RequestMapping(value="/queue/")
public class QueueController {
	@Autowired
	private QueueService queueService;
	@Autowired
	private HistoryService historyService ;
	private Queue queue;
	private List<Queue> queueList;
	private History history;
	private List<History> historyList;
	private int pageCount = 10;//每一页数量
	private int index;
	private int last;
	private String result = null;
	/**
	 * 添加排号记录
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="addQueue")
	public String enjoyQueue(int userId){
		return null;
	}
	
	/**
	 * 查询排号记录
	 * @param userId
	 * @param page
	 * @return
	 */
	@RequestMapping(value="findQueueById")
	public String queryQueueById(int userId,int page){
		queueList = new ArrayList<Queue>();
		int type = 0;
		if (page==0) {
			index = 0;
			last = pageCount;
		}else{
			index = page*pageCount;
			last = index+pageCount-1;
		}
		result = queueService.queryQueue(index, last,type);
//		queueList.
		return result;
	}
	
	/**
	 * 查询排号列表
	 * @param page
	 * @return
	 */
	@RequestMapping(value="findQueue")
	public String queryQueue(int page){
		return null;
	}
	
	public String resulToJson(List<Queue> list){
		return null;
		
	}
}
