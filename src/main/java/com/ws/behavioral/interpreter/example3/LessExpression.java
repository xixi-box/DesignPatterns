package com.ws.behavioral.interpreter.example3;

import java.util.Map;

/**
 * @Author: 王顺
 * @Date: 2023/5/19 15:53
 * @Version 1.0
 */
public class LessExpression implements Expression {
    public LessExpression(String strExpr) {

    }

    /**
     * @param stats
     * @return
     */
    @Override
    public boolean interpret(Map<String, Long> stats) {
        return false;
    }
}
