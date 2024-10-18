package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhangdanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhangdanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhangdanleixingView;


/**
 * 账单类型
 *
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface ZhangdanleixingService extends IService<ZhangdanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhangdanleixingVO> selectListVO(Wrapper<ZhangdanleixingEntity> wrapper);
   	
   	ZhangdanleixingVO selectVO(@Param("ew") Wrapper<ZhangdanleixingEntity> wrapper);
   	
   	List<ZhangdanleixingView> selectListView(Wrapper<ZhangdanleixingEntity> wrapper);
   	
   	ZhangdanleixingView selectView(@Param("ew") Wrapper<ZhangdanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhangdanleixingEntity> wrapper);
   	
}

