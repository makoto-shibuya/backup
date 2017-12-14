public class Employee {
//フィールド
	private static int number =0;
	private int code;
	private String name;
	private int year;
	private int age;

    //コンストラクタの定義
	public Employee(String name, int year, int age){
		this.name = name;
		this.year = year;
		this.age = age;
		code =++number;
	}

	public Employee(){
		this("未定",0,0);
	}

	public Employee(String name){
		this(name,0,0);
	}

	public Employee(String name, int age){
		this(name,0,age);
	}

     //表示するメソッド
	public void display(){
		System.out.println("従業員番号："+code);
		System.out.println("従業員名："+name);
		System.out.println("入社年数："+year);
		System.out.println("年齢："+age);
	}
//設定するメソッド
	public void setName(String name){
		this.name=name;
	}
	public void setYear(int year){
		if(year>0){
		this.year=year;
		}
	}

	public void setAge(int age){
		if(age>0){
		this.age=age;
		}
	}
 //取得するメソッド
	public String getName(){
		return name;
	}

	public int getYear(){
		return year;

	}

	public int getAge(){
		return age;
	}
}
