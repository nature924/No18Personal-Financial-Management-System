package com.dao;

import com.entity.LicaijihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LicaijihuaVO;
import com.entity.view.LicaijihuaView;


/**
 * 理财计划
 * 
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface LicaijihuaDao extends BaseMapper<LicaijihuaEntity> {
	
	List<LicaijihuaVO> selectListVO(@Param("ew") Wrapper<LicaijihuaEntity> wrapper);
	
	LicaijihuaVO selectVO(@Param("ew") Wrapper<LicaijihuaEntity> wrapper);
	
	List<LicaijihuaView> selectListView(@Param("ew") Wrapper<LicaijihuaEntity> wrapper);

	List<LicaijihuaView> selectListView(Pagination page,@Param("ew") Wrapper<LicaijihuaEntity> wrapper);
	
	LicaijihuaView selectView(@Param("ew") Wrapper<LicaijihuaEntity> wrapper);
	
}
