package com.dao;

import com.entity.ZhangdanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhangdanleixingVO;
import com.entity.view.ZhangdanleixingView;


/**
 * 账单类型
 * 
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface ZhangdanleixingDao extends BaseMapper<ZhangdanleixingEntity> {
	
	List<ZhangdanleixingVO> selectListVO(@Param("ew") Wrapper<ZhangdanleixingEntity> wrapper);
	
	ZhangdanleixingVO selectVO(@Param("ew") Wrapper<ZhangdanleixingEntity> wrapper);
	
	List<ZhangdanleixingView> selectListView(@Param("ew") Wrapper<ZhangdanleixingEntity> wrapper);

	List<ZhangdanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhangdanleixingEntity> wrapper);
	
	ZhangdanleixingView selectView(@Param("ew") Wrapper<ZhangdanleixingEntity> wrapper);
	
}
