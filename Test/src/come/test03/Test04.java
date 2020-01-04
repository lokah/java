package come.test03;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean res = opr06() ;
		
		System.out.println(res) ;
	}

	public static boolean opr06() {
		int a = 2;
		int b = 3;
		int i = (a > b) ? a + b : a - b;
		System.out.println(i);
		
		boolean res ;
		res = (a < b) ? false : true;
		//System.out.println(res);
		
		String s = (a > b) ? "a가 b보다 크다." : ((a < b) ? "a가 b보다 작다." : "a와 b가 같다.");
		System.out.println(s);
		return res;
	
}
}
