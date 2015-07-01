package pp.finalproject.model;

public class Operand {
    private final Type type;

    protected Operand(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        REG,
        NUM,
        STR,
        MEMADDR,
        TARGET,
        OPERATOR
    }
}