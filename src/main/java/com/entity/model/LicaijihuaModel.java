package com.entity.model;

import com.entity.LicaijihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 理财计划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public class LicaijihuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 财务分析
	 */
	
	private String caiwufenxi;
		
	/**
	 * 规划方案
	 */
	
	private String guihuafangan;
		
	/**
	 * 理财目标
	 */
	
	private String licaimubiao;
		
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
	 * 设置：财务分析
	 */
	 
	public void setCaiwufenxi(String caiwufenxi) {
		this.caiwufenxi = caiwufenxi;
	}
	
	/**
	 * 获取：财务分析
	 */
	public String getCaiwufenxi() {
		return caiwufenxi;
	}
				
	
	/**
	 * 设置：规划方案
	 */
	 
	public void setGuihuafangan(String guihuafangan) {
		this.guihuafangan = guihuafangan;
	}
	
	/**
	 * 获取：规划方案
	 */
	public String getGuihuafangan() {
		return guihuafangan;
	}
				
	
	/**
	 * 设置：理财目标
	 */
	 
	public void setLicaimubiao(String licaimubiao) {
		this.licaimubiao = licaimubiao;
	}
	
	/**
	 * 获取：理财目标
	 */
	public String getLicaimubiao() {
		return licaimubiao;
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
