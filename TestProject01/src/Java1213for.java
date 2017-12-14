
public class Java1213for {

	public static void main(String[] args) {
		// 12for文　基礎


		for(int i=0; i<3; i++){
			System.out.println(i);
		}


		for(int a=1; a<10; a++){
			System.out.println(a);
		}

		for(int b=3; b<=10; b++){
			System.out.println(b);
		}

		for(int c=1; c<10; c+=2){
			System.out.println(c);
		}

		for(int d=10; d>1; d-=2){
			System.out.println(d);
		}

		for(int e=1; e<=5; e++){
			System.out.println("★");
		}

		System.out.println("\n");

		//13 for文の応用

		for(int f=1; f<=10; f++){
			if(f%2 == 0){
				System.out.println(f+"\n");
			}
		}

		for (int g=0; g<3; g++){
			for(int h=1; h<4; h++){
				System.out.println(h);
				}
			System.out.println("\n");
		}

		int j=10;
				String k =j>=0 ?"プラス":"マイナス";

				System.out.println(k);

		for(int l=0; l<=5; l++){
			String m= l%2==0? "☆" :"★";
			System.out.println(m);
		}

	}

}
