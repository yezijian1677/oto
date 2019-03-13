package com.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalAuth {
	private Long localAuthId;
	private String userName;
	private String password;
	private Long userId;
	private Date createTime;
	private Date lastEditTime;
	private PersonInfo personInfo;

}
