package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShouruzhangdanEntity;
import com.entity.view.ShouruzhangdanView;

import com.service.ShouruzhangdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 收入账单
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-25 16:19:48
 */
@RestController
@RequestMapping("/shouruzhangdan")
public class ShouruzhangdanController {
    @Autowired
    private ShouruzhangdanService shouruzhangdanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShouruzhangdanEntity shouruzhangdan,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dengjiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dengjiriqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shouruzhangdan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShouruzhangdanEntity> ew = new EntityWrapper<ShouruzhangdanEntity>();
		if(dengjiriqistart!=null) ew.ge("dengjiriqi", dengjiriqistart);
        	if(dengjiriqiend!=null) ew.le("dengjiriqi", dengjiriqiend);
		PageUtils page = shouruzhangdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shouruzhangdan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShouruzhangdanEntity shouruzhangdan, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dengjiriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dengjiriqiend,
		HttpServletRequest request){
        EntityWrapper<ShouruzhangdanEntity> ew = new EntityWrapper<ShouruzhangdanEntity>();
                if(dengjiriqistart!=null) ew.ge("dengjiriqi", dengjiriqistart);
                if(dengjiriqiend!=null) ew.le("dengjiriqi", dengjiriqiend);
		PageUtils page = shouruzhangdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shouruzhangdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShouruzhangdanEntity shouruzhangdan){
       	EntityWrapper<ShouruzhangdanEntity> ew = new EntityWrapper<ShouruzhangdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shouruzhangdan, "shouruzhangdan")); 
        return R.ok().put("data", shouruzhangdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShouruzhangdanEntity shouruzhangdan){
        EntityWrapper< ShouruzhangdanEntity> ew = new EntityWrapper< ShouruzhangdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shouruzhangdan, "shouruzhangdan")); 
		ShouruzhangdanView shouruzhangdanView =  shouruzhangdanService.selectView(ew);
		return R.ok("查询收入账单成功").put("data", shouruzhangdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShouruzhangdanEntity shouruzhangdan = shouruzhangdanService.selectById(id);
        return R.ok().put("data", shouruzhangdan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShouruzhangdanEntity shouruzhangdan = shouruzhangdanService.selectById(id);
        return R.ok().put("data", shouruzhangdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShouruzhangdanEntity shouruzhangdan, HttpServletRequest request){
    	shouruzhangdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shouruzhangdan);
        shouruzhangdanService.insert(shouruzhangdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShouruzhangdanEntity shouruzhangdan, HttpServletRequest request){
    	shouruzhangdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shouruzhangdan);
        shouruzhangdanService.insert(shouruzhangdan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShouruzhangdanEntity shouruzhangdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shouruzhangdan);
        shouruzhangdanService.updateById(shouruzhangdan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shouruzhangdanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShouruzhangdanEntity> wrapper = new EntityWrapper<ShouruzhangdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shouruzhangdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
