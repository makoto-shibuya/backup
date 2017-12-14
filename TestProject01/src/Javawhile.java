
public class Javawhile {

	public static void main(String[] args) {
		// TODO 14while

		int i=1;
		while(i<=5){
			System.out.println(i);
			i++;
		}

		int a=0;
		while(a<10){
			System.out.println(a);
			a++;
		}

		int b=5;
		while(b<10){
			System.out.println(b);
			b++;
		}

		int c=1;
		while(c<=10){
			System.out.println(c);
			c+=2;
		}

		int d=1;
		while(d<=5){
			System.out.println("★");
			d++;
		}

		//whileの応用

	int e=1;
	do{System.out.println(e);
	e--;
	}while(e>1);

	int f=0;
	do{
		System.out.println(f);
		f++;
	}while(f<10);

	int g=5;
	do{
		System.out.println(g);
		g++;
	}while(g<10);

	int h=10;
	do{
		System.out.println(h);
		h-=3;
	}while(h>=1);

	}

}
