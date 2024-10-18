package com.dao;

import com.entity.TongjifenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongjifenxiVO;
import com.entity.view.TongjifenxiView;


/**
 * 统计分析
 * 
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface TongjifenxiDao extends BaseMapper<TongjifenxiEntity> {
	
	List<TongjifenxiVO> selectListVO(@Param("ew") Wrapper<TongjifenxiEntity> wrapper);
	
	TongjifenxiVO selectVO(@Param("ew") Wrapper<TongjifenxiEntity> wrapper);
	
	List<TongjifenxiView> selectListView(@Param("ew") Wrapper<TongjifenxiEntity> wrapper);

	List<TongjifenxiView> selectListView(Pagination page,@Param("ew") Wrapper<TongjifenxiEntity> wrapper);
	
	TongjifenxiView selectView(@Param("ew") Wrapper<TongjifenxiEntity> wrapper);
	
}
