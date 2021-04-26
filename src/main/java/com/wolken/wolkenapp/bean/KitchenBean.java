package com.wolken.wolkenapp.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class KitchenBean {
	
	private int noOfvessels;
	private String dimension;
	
	
	public void kitchen() {
		System.out.println("kitchen details");
	}


	public KitchenBean(int noOfvessels, String dimension) {
		//super();
		this.noOfvessels = noOfvessels;
		this.dimension = dimension;
	}
	
	
}
