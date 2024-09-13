package com.entity.vo;

import com.entity.JiaoliuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 交流信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-10 17:20:00
 */
public class JiaoliuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 交流内容
	 */
	
	private String jiaoliuneirong;
		
	/**
	 * 交流日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiaoliuriqi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：交流内容
	 */
	 
	public void setJiaoliuneirong(String jiaoliuneirong) {
		this.jiaoliuneirong = jiaoliuneirong;
	}
	
	/**
	 * 获取：交流内容
	 */
	public String getJiaoliuneirong() {
		return jiaoliuneirong;
	}
				
	
	/**
	 * 设置：交流日期
	 */
	 
	public void setJiaoliuriqi(Date jiaoliuriqi) {
		this.jiaoliuriqi = jiaoliuriqi;
	}
	
	/**
	 * 获取：交流日期
	 */
	public Date getJiaoliuriqi() {
		return jiaoliuriqi;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
