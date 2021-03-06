package com.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopAuthMap {

	private Long shopAuthId;
	private Long employeeId;
	private Long shopId;
	private String name;
	private String title;
	private Integer titleFlag;
	private Integer enableStatus;
	private Date createTime;
	private Date lastEditTime;
	private PersonInfo employee;
	private Shop shop;

	@Override
	public String toString() {
		return "[shopId=" + shopId + ", employeeId=" + employeeId
				+ ", employeeName=" + name + "]";
	}
}
