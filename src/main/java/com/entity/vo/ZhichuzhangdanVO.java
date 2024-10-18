package com.entity.vo;

import com.entity.ZhichuzhangdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 支出账单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public class ZhichuzhangdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 账单类型
	 */
	
	private String zhangdanleixing;
		
	/**
	 * 支出金额
	 */
	
	private Integer zhichujine;
		
	/**
	 * 支出方式
	 */
	
	private String zhichufangshi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：账单类型
	 */
	 
	public void setZhangdanleixing(String zhangdanleixing) {
		this.zhangdanleixing = zhangdanleixing;
	}
	
	/**
	 * 获取：账单类型
	 */
	public String getZhangdanleixing() {
		return zhangdanleixing;
	}
				
	
	/**
	 * 设置：支出金额
	 */
	 
	public void setZhichujine(Integer zhichujine) {
		this.zhichujine = zhichujine;
	}
	
	/**
	 * 获取：支出金额
	 */
	public Integer getZhichujine() {
		return zhichujine;
	}
				
	
	/**
	 * 设置：支出方式
	 */
	 
	public void setZhichufangshi(String zhichufangshi) {
		this.zhichufangshi = zhichufangshi;
	}
	
	/**
	 * 获取：支出方式
	 */
	public String getZhichufangshi() {
		return zhichufangshi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
