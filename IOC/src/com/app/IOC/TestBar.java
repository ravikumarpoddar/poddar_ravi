package com.app.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBar {

	public static void main(String[] args) {
		
		
		String xml="beans.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
		BarBean bar=ac.getBean(BarBean.class);
		System.out.println(bar);
		System.out.println(bar.supply());
		DrinkBean drink=bar.getDrink();
		System.out.println(drink.getType());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		BarBean bar=new BarBean();
		//System.out.println(bar.supply());
		
		DrinkBean d=new DrinkBean();
		
		
		//relate bar with the drink
		//dependency injection
		bar.setDrink(d);
		
		*/
		
		
	}
}
