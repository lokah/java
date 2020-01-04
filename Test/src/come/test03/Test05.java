package come.test03;

public class Test05 {

public static void main(String[] args) {

		final int appleprice = 1000 ;
		int myApple = 20 ;
		int myMoney = 0 ;
		Test05 ts = new Test05() ;
		int avg = ts.saleapple(3000);
		
}
	
	public int saleapple(int money) {
		
		int num = money/appleprice ;
		myApple -= num ;
		myMoney += money ;
		
		return num ;
	}
	
	public void showResult () {
		
		System.out.println("남은 사과 : " + myApple);
		System.out.println("판매 수익 : " + myMoney) ;
		
	}

}
