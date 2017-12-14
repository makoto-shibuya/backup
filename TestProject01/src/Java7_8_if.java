
public class Java7_8_if {

	public static void main(String[] args) {
		// if文

		int a =10;
		if(a<20){
			System.out.println("A");
		}

		int b =20;
		if(b <=30){
			System.out.println("B");

		}


		String c="山田";
		if(c.equals("山田")){
		System.out.println(c+"さん");
		}


		int d =5;
		if(d<10 && d<a){
			System.out.println("A");
		}

		int e=5;
		if(e>=5 || b<0){
			System.out.println("B");
		}

		int f=7;
		if(f>8){
			System.out.println("A");
		}else if(f<10){
			System.out.println("B");
		}

		int g=3;
		if(g>5){
			System.out.println("A");
		}else{
			System.out.println("Z");
		}

		int h =20;
		if(h<8){
			System.out.println("A");
		}else if(h==8){
			System.out.println("B");
		}else{
			System.out.println("C");
		}

		int i= 18;
		if(i>=20){
			System.out.println("成人");
		}else{
			System.out.println("未成年");
		}

		int age=35;
		if(age<20){
			System.out.println("未成年");
		}else if(age>=20 && age<=80){
			System.out.println("成人");
		}else{
			System.out.print("高齢者");
		}

		int j=5;
		if(j%2==0){
			System.out.println("偶数");
		}else{System.out.println("奇数");

		}



		//if文(判定）応用


		int a1= 20;
		if(a1>10){
			if(a1<30){
				System.out.println("A");
			}
		}

		int b1=50;
		if(b1>10){
			if(b1<30){
				System.out.println("A");
			}
		}

		int c1 =10;
		if(c1>0){
			if(c1==2){
			System.out.println("A");
			}else if(c1==3){
				System.out.println("B");
			}else{System.out.println("C");
			}

		}


		int d1 =2;
		if(d1>0){
			if(d1==2){
			System.out.println("A");
		}else if(d1==3){
			System.out.println("B");
		}else{System.out.println("C");
		}
	}

		int number = 88;

		if(number<=100){
			if(number<20){
				System.out.println("未成年");
			}else if(number == 77){
				System.out.println("喜寿");
			}else if(number == 88){
				System.out.println("米寿");
			}else{System.out.println("成人");

		}
		}




	}

}
