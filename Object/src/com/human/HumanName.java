package com.human;

public class HumanName {
	public String sei;
	private String mei;

	public HumanName(){

		sei="shibuya";
		mei="makoto";

	}
	public String getName(){

		return sei+mei;
	}

	public HumanName(String sei, String mei){
		this.sei=sei;
		this.mei=mei;
	}

	public String getMei(){
		return mei;
	}


}
