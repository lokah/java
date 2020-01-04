package come.test03;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test03();

	}

	private static void test03() {
		int i = 1;
		int count = 0;
		int sum = 0 ;

		while (i <= 100) {

			count = i / 5;
			
			if(i%5==0) {
				
				sum += i ;
				
			}
			i++ ;
		}
		System.out.println("5의 배수의 갯수는 : " + count + ", 총합은 " + sum);

	}

}
