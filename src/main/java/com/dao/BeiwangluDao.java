package com.dao;

import com.entity.BeiwangluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BeiwangluVO;
import com.entity.view.BeiwangluView;


/**
 * 备忘录
 * 
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface BeiwangluDao extends BaseMapper<BeiwangluEntity> {
	
	List<BeiwangluVO> selectListVO(@Param("ew") Wrapper<BeiwangluEntity> wrapper);
	
	BeiwangluVO selectVO(@Param("ew") Wrapper<BeiwangluEntity> wrapper);
	
	List<BeiwangluView> selectListView(@Param("ew") Wrapper<BeiwangluEntity> wrapper);

	List<BeiwangluView> selectListView(Pagination page,@Param("ew") Wrapper<BeiwangluEntity> wrapper);
	
	BeiwangluView selectView(@Param("ew") Wrapper<BeiwangluEntity> wrapper);
	
}
