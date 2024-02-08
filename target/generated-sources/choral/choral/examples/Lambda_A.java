package choral.examples;

import choral.lang.Unit;

public class Lambda_A {
	private Integer integer;

	public Lambda_A( Integer integer ) {
		this.integer = integer;
	}

	public Unit apply( Com_A com ) {
		return com.apply( integer );
	}

}
