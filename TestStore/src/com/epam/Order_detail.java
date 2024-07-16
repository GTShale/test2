package com.epam.data;

import lombok.Data;

@Data
public class Order_detail {
	private long id;
	private int quantity;
	private int price;
	
	public long getOrderId(Order order) {
		return order.getId();
	}
	
	public long getGoodsId(Goods goods) {
		return goods.getId();
	}
	
}
