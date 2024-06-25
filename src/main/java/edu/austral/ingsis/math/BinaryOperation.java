package edu.austral.ingsis.math;

import java.util.Map;

public abstract class BinaryOperation implements Function{

    protected Function left, right;
    public BinaryOperation(Function left, Function right) {
        this.left = left;
        this.right = right;
    }

}
