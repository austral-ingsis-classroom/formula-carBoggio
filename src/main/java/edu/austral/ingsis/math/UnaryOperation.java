package edu.austral.ingsis.math;

import java.util.List;

public abstract class UnaryOperation implements Function {
    protected final Function operand;

    public UnaryOperation(Function operand) {
        this.operand = operand;
    }

    protected Function getOperand() {
        return operand;
    }

    @Override
    public List<String> listVariables() {
        return operand.listVariables();
    }
}
