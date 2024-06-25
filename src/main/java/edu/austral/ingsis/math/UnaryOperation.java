package edu.austral.ingsis.math;

public abstract class UnaryOperation implements Function {
    private final Function operand;

    public UnaryOperation(Function operand) {
        this.operand = operand;
    }

    protected Function getOperand() {
        return operand;
    }
}
