package choral.examples;

import choral.channels.SymChannel;

public class Example18@(S, R) {
    private SymChannel@(S, R)<Integer> ch;

    public Example18(SymChannel@(S, R)<Integer> ch) {
        this.ch = ch;
    }

    public void run(boolean@S cond) {
        if (cond) {
            int@S x = 123@S;
            new Lambda@(S, R)(x).apply(new Com@(S, R)(ch));
        }
        else {
            int@S x = 456@S;
            new Lambda@(S, R)(x).apply(new Com@(S, R)(ch));
        }
    }
}
