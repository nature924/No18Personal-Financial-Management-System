package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 收入账单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
@TableName("shouruzhangdan")
public class ShouruzhangdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShouruzhangdanEntity() {
		
	}
	
	public ShouruzhangdanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账单名称
	 */
					
	private String zhangdanmingcheng;
	
	/**
	 * 账单类型
	 */
					
	private String zhangdanleixing;
	
	/**
	 * 收入金额
	 */
					
	private Integer shourujine;
	
	/**
	 * 收入方式
	 */
					
	private String shourufangshi;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账单名称
	 */
	public void setZhangdanmingcheng(String zhangdanmingcheng) {
		this.zhangdanmingcheng = zhangdanmingcheng;
	}
	/**
	 * 获取：账单名称
	 */
	public String getZhangdanmingcheng() {
		return zhangdanmingcheng;
	}
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
	 * 设置：收入金额
	 */
	public void setShourujine(Integer shourujine) {
		this.shourujine = shourujine;
	}
	/**
	 * 获取：收入金额
	 */
	public Integer getShourujine() {
		return shourujine;
	}
	/**
	 * 设置：收入方式
	 */
	public void setShourufangshi(String shourufangshi) {
		this.shourufangshi = shourufangshi;
	}
	/**
	 * 获取：收入方式
	 */
	public String getShourufangshi() {
		return shourufangshi;
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
