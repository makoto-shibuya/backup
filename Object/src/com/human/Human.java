package com.human;

public class Human {
	public static String sei;
	public static String mei;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello World");
		sei="shibuya";
		mei="makoto";
		System.out.println(sei + mei);

		HumanName humanName = new HumanName();
		System.out.println(humanName.getName());
		String sei1=humanName.sei;
		String mei1=humanName.getMei();
		System.out.println(sei1+mei1);

		HumanName humanName2= new HumanName("田中","太郎");
		System.out.println(humanName2.getName());



	}

}
