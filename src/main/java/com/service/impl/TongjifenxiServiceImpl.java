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


import com.dao.TongjifenxiDao;
import com.entity.TongjifenxiEntity;
import com.service.TongjifenxiService;
import com.entity.vo.TongjifenxiVO;
import com.entity.view.TongjifenxiView;

@Service("tongjifenxiService")
public class TongjifenxiServiceImpl extends ServiceImpl<TongjifenxiDao, TongjifenxiEntity> implements TongjifenxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongjifenxiEntity> page = this.selectPage(
                new Query<TongjifenxiEntity>(params).getPage(),
                new EntityWrapper<TongjifenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongjifenxiEntity> wrapper) {
		  Page<TongjifenxiView> page =new Query<TongjifenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongjifenxiVO> selectListVO(Wrapper<TongjifenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongjifenxiVO selectVO(Wrapper<TongjifenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongjifenxiView> selectListView(Wrapper<TongjifenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongjifenxiView selectView(Wrapper<TongjifenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
