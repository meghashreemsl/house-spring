package com.wolken.wolkenapp.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class HouseBean {

	private String house_name;
	private int house_no;
	private String house_type;
	private int no_of_doors;
	private KitchenBean kitechenbean;

	public void sleep() {
		System.out.println("sleeping sleeping sleeping.....");
	}

	public HouseBean(String house_name, int house_no, String house_type, int no_of_doors, KitchenBean kitechenbean) {
		// super();
		this.house_name = house_name;
		this.house_no = house_no;
		this.house_type = house_type;
		this.no_of_doors = no_of_doors;
		this.kitechenbean=kitechenbean;
	}

}
