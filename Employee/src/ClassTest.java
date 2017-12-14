/**
 *
 */

/**
 * @author internousdev
 *
 */
public class ClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee yamamoto = new Employee("山本太郎",2,20);
		Employee matsuda = new Employee("松田次郎",4,25);
		Employee yasuda = new Employee("安田三郎",28);
		Employee nanashi= new Employee();

		//変数yamamotoの従業員名を変更
		yamamoto.setName("山本小太郎");
		yamamoto.setYear(-1);



		yamamoto.display();
		matsuda.display();
		yasuda.display();
		nanashi.display();


	}

}
