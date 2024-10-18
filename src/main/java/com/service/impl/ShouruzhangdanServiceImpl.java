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


import com.dao.ShouruzhangdanDao;
import com.entity.ShouruzhangdanEntity;
import com.service.ShouruzhangdanService;
import com.entity.vo.ShouruzhangdanVO;
import com.entity.view.ShouruzhangdanView;

@Service("shouruzhangdanService")
public class ShouruzhangdanServiceImpl extends ServiceImpl<ShouruzhangdanDao, ShouruzhangdanEntity> implements ShouruzhangdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouruzhangdanEntity> page = this.selectPage(
                new Query<ShouruzhangdanEntity>(params).getPage(),
                new EntityWrapper<ShouruzhangdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouruzhangdanEntity> wrapper) {
		  Page<ShouruzhangdanView> page =new Query<ShouruzhangdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouruzhangdanVO> selectListVO(Wrapper<ShouruzhangdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouruzhangdanVO selectVO(Wrapper<ShouruzhangdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouruzhangdanView> selectListView(Wrapper<ShouruzhangdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouruzhangdanView selectView(Wrapper<ShouruzhangdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
