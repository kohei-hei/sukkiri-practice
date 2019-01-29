
public class SukkiriPractice3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//①
		System.out.println("【数当てゲーム】");

		//②
		int ans = new java.util.Random().nextInt(10);

		//③
		for(int i = 0; i < 5; i++){
		//④～⑦
			System.out.println("0～9の数字を入力してください。");

			int num = new java.util.Scanner(System.in).nextInt();

			if(num == ans){
				System.out.println("アタリ！");
				break;
			}
			else{
				System.out.println("違います。");
			}

		}

		System.out.println("ゲームを終了します。");

	}

}
