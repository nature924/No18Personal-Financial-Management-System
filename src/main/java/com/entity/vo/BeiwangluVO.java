package com.entity.vo;

import com.entity.BeiwangluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 备忘录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public class BeiwangluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 提醒事宜
	 */
	
	private String tixingshiyi;
		
	/**
	 * 完成情况
	 */
	
	private String wanchengqingkuang;
		
	/**
	 * 提醒日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tixingriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：提醒事宜
	 */
	 
	public void setTixingshiyi(String tixingshiyi) {
		this.tixingshiyi = tixingshiyi;
	}
	
	/**
	 * 获取：提醒事宜
	 */
	public String getTixingshiyi() {
		return tixingshiyi;
	}
				
	
	/**
	 * 设置：完成情况
	 */
	 
	public void setWanchengqingkuang(String wanchengqingkuang) {
		this.wanchengqingkuang = wanchengqingkuang;
	}
	
	/**
	 * 获取：完成情况
	 */
	public String getWanchengqingkuang() {
		return wanchengqingkuang;
	}
				
	
	/**
	 * 设置：提醒日期
	 */
	 
	public void setTixingriqi(Date tixingriqi) {
		this.tixingriqi = tixingriqi;
	}
	
	/**
	 * 获取：提醒日期
	 */
	public Date getTixingriqi() {
		return tixingriqi;
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
