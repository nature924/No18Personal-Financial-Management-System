package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LicaijihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LicaijihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LicaijihuaView;


/**
 * 理财计划
 *
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
public interface LicaijihuaService extends IService<LicaijihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LicaijihuaVO> selectListVO(Wrapper<LicaijihuaEntity> wrapper);
   	
   	LicaijihuaVO selectVO(@Param("ew") Wrapper<LicaijihuaEntity> wrapper);
   	
   	List<LicaijihuaView> selectListView(Wrapper<LicaijihuaEntity> wrapper);
   	
   	LicaijihuaView selectView(@Param("ew") Wrapper<LicaijihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LicaijihuaEntity> wrapper);
   	
}

