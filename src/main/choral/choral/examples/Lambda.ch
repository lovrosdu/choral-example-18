package choral.examples;

import choral.channels.SymChannel;

public class Lambda@(A, B) {
    private Integer@A integer;

    public Lambda(Integer@A integer) {
        this.integer = integer;
    }

    public Integer@B apply(SymChannel@(A, B)<Integer> ch) {
        return ch.<Integer>com(integer);
    }
}
