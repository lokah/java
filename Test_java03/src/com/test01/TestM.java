package com.test01;

public class TestM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Buyer b = new Buyer();
		Chair c = new Chair();
		
		
		b.buy(c);
		b.buy(new Desk());
		
	}
}
		class Funiture {
			
			 int price;
			public Funiture(int price) {
				
				this.price = price;
			}
		}
			
			class Chair extends Funiture {
				
				public Chair() {
					
					super(100);
				}
				
				@Override
				public String toString() {
					return "chair";
				}
				
			}
			
			class Desk extends Funiture {
				
				public Desk () {
					
					super(200);
				}
				
				@Override
				public String toString() {
					
					
					return "Desk";
				}
				
			}
			
			class Buyer {
				
				
				private int money = 500;
				
				public void buy(Funiture f) {
					
					if(money<f.price ) {
						
						System.out.println("잔액부족");
						return;
					}
					money -=f.price;
					System.out.println(f + " 구매성공! 잔액 : " + money + " 만원");
				}
			}
	
