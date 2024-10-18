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
 * 统计分析
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
@TableName("tongjifenxi")
public class TongjifenxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TongjifenxiEntity() {
		
	}
	
	public TongjifenxiEntity(T t) {
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
	 * 年月份
	 */
					
	private String nianyuefen;
	
	/**
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
	/**
	 * 总收入金额
	 */
					
	private Integer zongshourujine;
	
	/**
	 * 收入明细
	 */
					
	private String shourumingxi;
	
	/**
	 * 总支出金额
	 */
					
	private Integer zongzhichujine;
	
	/**
	 * 支出明细
	 */
					
	private String zhichumingxi;
	
	/**
	 * 结余
	 */
					
	private Integer jieyu;
	
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
	 * 设置：年月份
	 */
	public void setNianyuefen(String nianyuefen) {
		this.nianyuefen = nianyuefen;
	}
	/**
	 * 获取：年月份
	 */
	public String getNianyuefen() {
		return nianyuefen;
	}
	/**
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
	/**
	 * 设置：总收入金额
	 */
	public void setZongshourujine(Integer zongshourujine) {
		this.zongshourujine = zongshourujine;
	}
	/**
	 * 获取：总收入金额
	 */
	public Integer getZongshourujine() {
		return zongshourujine;
	}
	/**
	 * 设置：收入明细
	 */
	public void setShourumingxi(String shourumingxi) {
		this.shourumingxi = shourumingxi;
	}
	/**
	 * 获取：收入明细
	 */
	public String getShourumingxi() {
		return shourumingxi;
	}
	/**
	 * 设置：总支出金额
	 */
	public void setZongzhichujine(Integer zongzhichujine) {
		this.zongzhichujine = zongzhichujine;
	}
	/**
	 * 获取：总支出金额
	 */
	public Integer getZongzhichujine() {
		return zongzhichujine;
	}
	/**
	 * 设置：支出明细
	 */
	public void setZhichumingxi(String zhichumingxi) {
		this.zhichumingxi = zhichumingxi;
	}
	/**
	 * 获取：支出明细
	 */
	public String getZhichumingxi() {
		return zhichumingxi;
	}
	/**
	 * 设置：结余
	 */
	public void setJieyu(Integer jieyu) {
		this.jieyu = jieyu;
	}
	/**
	 * 获取：结余
	 */
	public Integer getJieyu() {
		return jieyu;
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
