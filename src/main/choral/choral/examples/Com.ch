package choral.examples;

import choral.channels.SymChannel;

public class Com@(A, B) {
    private SymChannel@(A, B)<Integer> ch;

    public Com(SymChannel@(A, B)<Integer> ch) {
        this.ch = ch;
    }

    public Integer@B apply(Integer@A x) {
        return ch.<Integer>com(x);
    }
}
