package com.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WechatAuth {
	private Long wechatAuthId;
	private Long userId;
	private String openId;
	private Date createTime;
	private PersonInfo personInfo;
}
