
public class Java10hairetsu {

	public static void main(String[] args) {
		// java10 配列

		String[] name =new String[3];
		 name[0]="田中";
		 name[1]="高橋";
		 name[2]="斉藤";

		 String[] name1={"田中","高橋","斉藤"};
		 System.out.println(name1[1]);

		 System.out.println(name[0]);

		 char[] c={'x','y','z'};
		 System.out.println(c[0]);

		 int [] i ={1,5,10};
		 System.out.println(i[0]);


		 String[] name2 ={"田中","高橋","斉藤"};

		 name2[0]="加藤";

		 System.out.println(name2[0]);

		 //多次元配列

		 String[][] country ={
				 {"日本","タイ"},
				 {"アメリカ","ブラジル"},
				 {"フランス","ロシア"}
		 };


		 System.out.println(country[0][0]);
		 System.out.println(country[0][1]);
		 System.out.println(country[1][0]);

		 String[][] country1 = new String[3][2];
		 country1[0][0]="日本";
		 country1[0][1]="タイ";
		 country1[1][0]="アメリカ";
		 country1[1][1]="ブラジル";
		 country1[2][0]="フランス";
		 country1[2][1]="ロシア";

		 System.out.println(country1[0][0]);


	}

}
