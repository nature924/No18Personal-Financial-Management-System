package com.entity.vo;

import com.entity.TongjifenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 统计分析
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public class TongjifenxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
