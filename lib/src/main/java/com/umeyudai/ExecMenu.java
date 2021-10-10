package com.umeyudai;

enum Menu {
	MEAT("肉料理"),
	VEGETABLE("野菜料理"),
	FISH("魚料理");
	
	private String name;
	private Menu(String name) {
		this.name = name;
	}
	public String getName() {
		return	name;
	}
}

public class ExecMenu {
	public static void main(String[] args) {
		System.out.println(Menu.MEAT.getName());
		System.out.println(Menu.VEGETABLE.getName());
		System.out.println(Menu.FISH.getName());
	}
}