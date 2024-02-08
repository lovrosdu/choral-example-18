package choral.examples;

import choral.channels.SymChannel_A;
import choral.lang.Unit;

public class Com_A {
	private SymChannel_A < Integer > ch;

	public Com_A( SymChannel_A < Integer > ch ) {
		this.ch = ch;
	}

	public Unit apply( Integer x ) {
		return ch.< Integer >com( x );
	}

}
