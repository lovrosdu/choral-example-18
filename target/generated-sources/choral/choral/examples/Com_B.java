package choral.examples;

import choral.channels.SymChannel_B;
import choral.lang.Unit;

public class Com_B {
	private SymChannel_B < Integer > ch;

	public Com_B( SymChannel_B < Integer > ch ) {
		this.ch = ch;
	}

	public Integer apply( Unit x ) {
		return apply();
	}
	
	public Integer apply() {
		return ch.< Integer >com( Unit.id );
	}

}
