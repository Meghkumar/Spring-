package com.springcore.ref;

public class B {

	private int y;

	

	@Override
	public String toString() {
		return "" + y + "";
	}

	public B(int y) {
		super();
		this.y = y;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
