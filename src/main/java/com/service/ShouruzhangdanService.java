package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouruzhangdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouruzhangdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouruzhangdanView;


/**
 * 收入账单
 *
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface ShouruzhangdanService extends IService<ShouruzhangdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouruzhangdanVO> selectListVO(Wrapper<ShouruzhangdanEntity> wrapper);
   	
   	ShouruzhangdanVO selectVO(@Param("ew") Wrapper<ShouruzhangdanEntity> wrapper);
   	
   	List<ShouruzhangdanView> selectListView(Wrapper<ShouruzhangdanEntity> wrapper);
   	
   	ShouruzhangdanView selectView(@Param("ew") Wrapper<ShouruzhangdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouruzhangdanEntity> wrapper);
   	
}

