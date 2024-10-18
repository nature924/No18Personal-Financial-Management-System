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


import com.dao.ZhangdanleixingDao;
import com.entity.ZhangdanleixingEntity;
import com.service.ZhangdanleixingService;
import com.entity.vo.ZhangdanleixingVO;
import com.entity.view.ZhangdanleixingView;

@Service("zhangdanleixingService")
public class ZhangdanleixingServiceImpl extends ServiceImpl<ZhangdanleixingDao, ZhangdanleixingEntity> implements ZhangdanleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhangdanleixingEntity> page = this.selectPage(
                new Query<ZhangdanleixingEntity>(params).getPage(),
                new EntityWrapper<ZhangdanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhangdanleixingEntity> wrapper) {
		  Page<ZhangdanleixingView> page =new Query<ZhangdanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhangdanleixingVO> selectListVO(Wrapper<ZhangdanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhangdanleixingVO selectVO(Wrapper<ZhangdanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhangdanleixingView> selectListView(Wrapper<ZhangdanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhangdanleixingView selectView(Wrapper<ZhangdanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
