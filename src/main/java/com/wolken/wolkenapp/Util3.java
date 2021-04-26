package com.wolken.wolkenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.HouseBean;
import com.wolken.wolkenapp.bean.KitchenBean;

public class Util3{
	
	public static void main(String[] args) {
		//constructor intialization spring 
	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("context.spring.xml");
	HouseBean bean = applicationContext.getBean(HouseBean.class);
	bean.sleep();
	System.out.println(bean);
	System.out.println(bean.getHouse_name()+" "+ bean.getHouse_no()+" "+bean.getHouse_type()+" "+bean.getNo_of_doors());
	KitchenBean bean2 = applicationContext.getBean(KitchenBean.class);
	bean2.kitchen();
	System.out.println(bean2);
	System.out.println(bean2.getDimension()+" "+bean2.getNoOfvessels());
	
	
	}

}
