package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BeiwangluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BeiwangluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BeiwangluView;


/**
 * 备忘录
 *
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface BeiwangluService extends IService<BeiwangluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BeiwangluVO> selectListVO(Wrapper<BeiwangluEntity> wrapper);
   	
   	BeiwangluVO selectVO(@Param("ew") Wrapper<BeiwangluEntity> wrapper);
   	
   	List<BeiwangluView> selectListView(Wrapper<BeiwangluEntity> wrapper);
   	
   	BeiwangluView selectView(@Param("ew") Wrapper<BeiwangluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BeiwangluEntity> wrapper);
   	
}

