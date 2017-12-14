
public class Java9switch {

	public static void main(String[] args) {
		// java9 switch


		int a =1;
		switch(a){
		case 0:
			System.out.println("aは0に等しい");
			break;

		case 1:
			System.out.println("aは1に等しい");
			break;
		}

		int b =5;
		switch(b){
		case 0:
			System.out.println("bは0に等しい");
			break;
		case 1:
			System.out.println("bは1に等しい");
			break;
		default:
			System.out.println("bは0でも1でもない");

		}


		String c="青";
		switch(c){
		case "赤":
			System.out.println("赤組です");
			break;

		case "白":
			System.out.println("白組です");
			break;

			default:
				System.out.println("エラーです");
		}


	}

}
