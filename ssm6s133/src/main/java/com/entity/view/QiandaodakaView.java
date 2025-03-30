package com.entity.view;

import com.entity.QiandaodakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 签到打卡
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-27 01:12:05
 */
@TableName("qiandaodaka")
public class QiandaodakaView  extends QiandaodakaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiandaodakaView(){
	}
 
 	public QiandaodakaView(QiandaodakaEntity qiandaodakaEntity){
 	try {
			BeanUtils.copyProperties(this, qiandaodakaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
