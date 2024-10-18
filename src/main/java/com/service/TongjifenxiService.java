package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TongjifenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TongjifenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TongjifenxiView;


/**
 * 统计分析
 *
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface TongjifenxiService extends IService<TongjifenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongjifenxiVO> selectListVO(Wrapper<TongjifenxiEntity> wrapper);
   	
   	TongjifenxiVO selectVO(@Param("ew") Wrapper<TongjifenxiEntity> wrapper);
   	
   	List<TongjifenxiView> selectListView(Wrapper<TongjifenxiEntity> wrapper);
   	
   	TongjifenxiView selectView(@Param("ew") Wrapper<TongjifenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongjifenxiEntity> wrapper);
   	
}

