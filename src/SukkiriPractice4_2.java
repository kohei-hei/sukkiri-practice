
public class SukkiriPractice4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//①

		int[] moneyList = { 121902, 8302, 55100 };

		//②
		for(int i = 0; i < moneyList.length; i++ ){
			System.out.println(moneyList[i]);
		}

		System.out.println("-↑for文-拡張for文↓-");


		//③
		for(int money : moneyList){
			System.out.println(money);
		}

	}

}
