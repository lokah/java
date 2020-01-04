package com.area;

public abstract class AreaImpl implements Area {

	private String result;

	public AreaImpl() {

	}

	// 부모의 프린트를 호출할 수 있다.
	@Override
	public void print() {

		System.out.println(Area.PRINT + result);
		
	}

	public abstract void make();

	
	public String getResult() {
		
		return result ;
		
		
	}

	public void setResult(String result) {

		this.result = result;
	}

}
