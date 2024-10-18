package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhichuzhangdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhichuzhangdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhichuzhangdanView;


/**
 * 支出账单
 *
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface ZhichuzhangdanService extends IService<ZhichuzhangdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhichuzhangdanVO> selectListVO(Wrapper<ZhichuzhangdanEntity> wrapper);
   	
   	ZhichuzhangdanVO selectVO(@Param("ew") Wrapper<ZhichuzhangdanEntity> wrapper);
   	
   	List<ZhichuzhangdanView> selectListView(Wrapper<ZhichuzhangdanEntity> wrapper);
   	
   	ZhichuzhangdanView selectView(@Param("ew") Wrapper<ZhichuzhangdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhichuzhangdanEntity> wrapper);
   	
}

