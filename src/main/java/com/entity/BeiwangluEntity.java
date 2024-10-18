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
 * 备忘录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
@TableName("beiwanglu")
public class BeiwangluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BeiwangluEntity() {
		
	}
	
	public BeiwangluEntity(T t) {
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
	 * 事件名称
	 */
					
	private String shijianmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：事件名称
	 */
	public void setShijianmingcheng(String shijianmingcheng) {
		this.shijianmingcheng = shijianmingcheng;
	}
	/**
	 * 获取：事件名称
	 */
	public String getShijianmingcheng() {
		return shijianmingcheng;
	}
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
