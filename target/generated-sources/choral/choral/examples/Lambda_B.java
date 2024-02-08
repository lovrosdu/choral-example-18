package choral.examples;

import choral.lang.Unit;
import choral.channels.SymChannel_B;

public class Lambda_B {
	public Lambda_B( Unit integer ) {
		this();
	}
	
	public Lambda_B() {
		
	}

	public Integer apply( SymChannel_B < Integer > ch ) {
		return ch.< Integer >com( Unit.id );
	}

}
