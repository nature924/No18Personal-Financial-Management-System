package com.dao;

import com.entity.ZhichuzhangdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhichuzhangdanVO;
import com.entity.view.ZhichuzhangdanView;


/**
 * 支出账单
 * 
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface ZhichuzhangdanDao extends BaseMapper<ZhichuzhangdanEntity> {
	
	List<ZhichuzhangdanVO> selectListVO(@Param("ew") Wrapper<ZhichuzhangdanEntity> wrapper);
	
	ZhichuzhangdanVO selectVO(@Param("ew") Wrapper<ZhichuzhangdanEntity> wrapper);
	
	List<ZhichuzhangdanView> selectListView(@Param("ew") Wrapper<ZhichuzhangdanEntity> wrapper);

	List<ZhichuzhangdanView> selectListView(Pagination page,@Param("ew") Wrapper<ZhichuzhangdanEntity> wrapper);
	
	ZhichuzhangdanView selectView(@Param("ew") Wrapper<ZhichuzhangdanEntity> wrapper);
	
}
