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


import com.dao.BeiwangluDao;
import com.entity.BeiwangluEntity;
import com.service.BeiwangluService;
import com.entity.vo.BeiwangluVO;
import com.entity.view.BeiwangluView;

@Service("beiwangluService")
public class BeiwangluServiceImpl extends ServiceImpl<BeiwangluDao, BeiwangluEntity> implements BeiwangluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BeiwangluEntity> page = this.selectPage(
                new Query<BeiwangluEntity>(params).getPage(),
                new EntityWrapper<BeiwangluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BeiwangluEntity> wrapper) {
		  Page<BeiwangluView> page =new Query<BeiwangluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BeiwangluVO> selectListVO(Wrapper<BeiwangluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BeiwangluVO selectVO(Wrapper<BeiwangluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BeiwangluView> selectListView(Wrapper<BeiwangluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BeiwangluView selectView(Wrapper<BeiwangluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
