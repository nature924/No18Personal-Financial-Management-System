package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LicaijihuaDao;
import com.entity.LicaijihuaEntity;
import com.service.LicaijihuaService;
import com.entity.vo.LicaijihuaVO;
import com.entity.view.LicaijihuaView;

@Service("licaijihuaService")
public class LicaijihuaServiceImpl extends ServiceImpl<LicaijihuaDao, LicaijihuaEntity> implements LicaijihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LicaijihuaEntity> page = this.selectPage(
                new Query<LicaijihuaEntity>(params).getPage(),
                new EntityWrapper<LicaijihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LicaijihuaEntity> wrapper) {
		  Page<LicaijihuaView> page =new Query<LicaijihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LicaijihuaVO> selectListVO(Wrapper<LicaijihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LicaijihuaVO selectVO(Wrapper<LicaijihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LicaijihuaView> selectListView(Wrapper<LicaijihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LicaijihuaView selectView(Wrapper<LicaijihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
