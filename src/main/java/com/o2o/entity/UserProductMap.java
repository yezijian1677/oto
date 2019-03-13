package com.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProductMap {
	private Long userProductId;
	private Long userId;
	private Long productId;
	private Long shopId;
	private String userName;
	private String productName;
	private Date createTime;
	private Integer point;
	private PersonInfo user;
	private Product product;
	private Shop shop;
}
