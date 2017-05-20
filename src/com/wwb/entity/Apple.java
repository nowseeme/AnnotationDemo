package com.wwb.entity;

import com.wwb.annotation.FruitColor;
import com.wwb.annotation.FruitColor.Color;
import com.wwb.annotation.FruitName;
import com.wwb.annotation.FruitProvider;

public class Apple {
	@FruitName(value="apple")
	private String name;
	@FruitColor(fruitColor=Color.Red)
	private String color;
	@FruitProvider(id=1,name="�����츻ʿ����",address="����ʡ�������Ӱ�·89�ź츻ʿ����")
	private String privider;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrivider() {
		return privider;
	}
	public void setPrivider(String privider) {
		this.privider = privider;
	}
	public void displayName(){
        System.out.println("ˮ���������ǣ�"+name);
    }
}