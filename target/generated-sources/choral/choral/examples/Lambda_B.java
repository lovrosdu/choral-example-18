package choral.examples;

import choral.lang.Unit;

public class Lambda_B {
	public Lambda_B( Unit integer ) {
		this();
	}
	
	public Lambda_B() {
		
	}

	public Integer apply( Com_B com ) {
		return com.apply( Unit.id );
	}

}
