package com.dao;

import com.entity.ShouruzhangdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouruzhangdanVO;
import com.entity.view.ShouruzhangdanView;


/**
 * 收入账单
 * 
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface ShouruzhangdanDao extends BaseMapper<ShouruzhangdanEntity> {
	
	List<ShouruzhangdanVO> selectListVO(@Param("ew") Wrapper<ShouruzhangdanEntity> wrapper);
	
	ShouruzhangdanVO selectVO(@Param("ew") Wrapper<ShouruzhangdanEntity> wrapper);
	
	List<ShouruzhangdanView> selectListView(@Param("ew") Wrapper<ShouruzhangdanEntity> wrapper);

	List<ShouruzhangdanView> selectListView(Pagination page,@Param("ew") Wrapper<ShouruzhangdanEntity> wrapper);
	
	ShouruzhangdanView selectView(@Param("ew") Wrapper<ShouruzhangdanEntity> wrapper);
	
}
