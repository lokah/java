package com.test01;



	

		class Calculator{
		    int left, right;
		    public void setOprands(int left, int right){
		        this.left = left;
		        this.right = right;
		    }
		    public void divide(){
		        try {
		            System.out.print("계산결과는 ");
		            System.out.print(this.left/this.right);
		            System.out.print(" 입니다.");
		        } catch(ArithmeticException e){
		            //System.out.println("\n\ne.getMessage()\n"+e.getMessage());
		            //System.out.println("\n\ne.toString()\n"+e.toString());
		        	this.right = 10;
		            System.out.println(this.left/this.right);
		            
		        }
		    }
		} 
		
		public class Test01 {
		    public static void main(String[] args) {
		        Calculator c1 = new Calculator();
		        c1.setOprands(10, 0);
		        c1.divide();
		        Calculator c2 = new Calculator();
		        c2.setOprands(1,2);
		        c2.divide();
		    }
	
		
		
	}


