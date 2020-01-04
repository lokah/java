package come.test03;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test01();
	}

	public static void test01() {

		int i = 200;
		int res = i/2 ;
		
		while (res < 101) {// i>0으로 해도 된다.
			System.out.println(res);
			res--;
			if (res == 0) {
				break;
			}
		}
	}
}
