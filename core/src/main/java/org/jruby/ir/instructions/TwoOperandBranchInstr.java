package org.jruby.ir.instructions;

import org.jruby.ir.Operation;
import org.jruby.ir.operands.Label;
import org.jruby.ir.operands.Operand;

public abstract class TwoOperandBranchInstr extends BranchInstr {
    public TwoOperandBranchInstr(Operation op, Operand arg1, Operand arg2, Label jumpTarget) {
        super(op, new Operand[] {jumpTarget, arg1, arg2});
    }

    public Operand getArg1() {
        return operands[1];
    }

    public Operand getArg2() {
        return operands[2];
    }
}
