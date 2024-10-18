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


import com.dao.ZhichuzhangdanDao;
import com.entity.ZhichuzhangdanEntity;
import com.service.ZhichuzhangdanService;
import com.entity.vo.ZhichuzhangdanVO;
import com.entity.view.ZhichuzhangdanView;

@Service("zhichuzhangdanService")
public class ZhichuzhangdanServiceImpl extends ServiceImpl<ZhichuzhangdanDao, ZhichuzhangdanEntity> implements ZhichuzhangdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhichuzhangdanEntity> page = this.selectPage(
                new Query<ZhichuzhangdanEntity>(params).getPage(),
                new EntityWrapper<ZhichuzhangdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhichuzhangdanEntity> wrapper) {
		  Page<ZhichuzhangdanView> page =new Query<ZhichuzhangdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhichuzhangdanVO> selectListVO(Wrapper<ZhichuzhangdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhichuzhangdanVO selectVO(Wrapper<ZhichuzhangdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhichuzhangdanView> selectListView(Wrapper<ZhichuzhangdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhichuzhangdanView selectView(Wrapper<ZhichuzhangdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
