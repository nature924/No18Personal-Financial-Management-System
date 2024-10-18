package com.entity.view;

import com.entity.TongjifenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 统计分析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
@TableName("tongjifenxi")
public class TongjifenxiView  extends TongjifenxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongjifenxiView(){
	}
 
 	public TongjifenxiView(TongjifenxiEntity tongjifenxiEntity){
 	try {
			BeanUtils.copyProperties(this, tongjifenxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
