
public class SukkiriPractice4_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//①
		int[] numbers = { 3,4,9 };

		//②
		System.out.println("1桁の数字を入力してください。");

		//③
		int input = new java.util.Scanner(System.in).nextInt();

		//④
		for(int n : numbers){

			if(input == n){
				System.out.println("アタリ！");
			}
			else{
				System.out.println("チガウヨ！");
			}
		}

	}

}
