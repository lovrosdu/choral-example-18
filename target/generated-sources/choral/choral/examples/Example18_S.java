package choral.examples;

import choral.channels.SymChannel_A;

public class Example18_S {
	private SymChannel_A < Integer > ch;

	public Example18_S( SymChannel_A < Integer > ch ) {
		this.ch = ch;
	}

	public void run( boolean cond ) {
		if( cond ){
			int x = 123;
			new Lambda_A( x ).apply( ch );
		} else { 
			int x = 456;
			new Lambda_A( x ).apply( ch );
		}
	}

}
