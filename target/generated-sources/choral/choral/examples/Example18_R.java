package choral.examples;

import choral.channels.SymChannel_B;
import choral.lang.Unit;

public class Example18_R {
	private SymChannel_B < Integer > ch;

	public Example18_R( SymChannel_B < Integer > ch ) {
		this.ch = ch;
	}

	public void run( Unit cond ) {
		run();
	}
	
	public void run() {
		{
			new Lambda_B( Unit.id ).apply( ch );
		}
	}

}
