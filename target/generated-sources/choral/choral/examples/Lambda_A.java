package choral.examples;

import choral.lang.Unit;
import choral.channels.SymChannel_A;

public class Lambda_A {
	private Integer integer;

	public Lambda_A( Integer integer ) {
		this.integer = integer;
	}

	public Unit apply( SymChannel_A < Integer > ch ) {
		return ch.< Integer >com( integer );
	}

}
