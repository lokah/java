package com.test03;

class Generic0 {

	public int grade;

	Generic0(int grade) {

		this.grade = grade;

	}

}


	class Generic1 {

		public int rank;

		Generic1(int rank) {

			this.rank = rank;
		}
	}

	class Generic2 {

		public Object info;
		
		Generic2(Object info){
		this.info = info;
		

	}
	}

	public class Generic00{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Generic1 s3 = new Generic1(2);
		Generic2 s2 = new Generic2(s3);
		
		Generic1 s1 = (Generic1)s2.info;
		System.out.println(s1.rank);
		System.out.println(s3.rank);
		
		
		
	}

}
