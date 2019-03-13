package com.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Area {
	private Long areaId;
	private String areaName;
	private String areaDesc;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;

}
