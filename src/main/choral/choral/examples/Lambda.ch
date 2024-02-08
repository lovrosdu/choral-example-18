package choral.examples;

public class Lambda@(A, B) {
    private Integer@A integer;

    public Lambda(Integer@A integer) {
        this.integer = integer;
    }

    public Integer@B apply(Com@(A, B) com) {
        return com.apply(integer);
    }
}
