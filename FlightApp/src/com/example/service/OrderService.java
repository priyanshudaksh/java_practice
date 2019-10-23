package com.example.service;

import java.util.List;

import com.example.pojo.Orders;

public interface OrderService {
	public int storeOrder(Orders order);

	public List<Orders> findbyId(int id);
}
