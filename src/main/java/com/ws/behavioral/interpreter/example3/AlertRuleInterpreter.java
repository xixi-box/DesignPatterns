package com.ws.behavioral.interpreter.example3;

import java.util.Map;

/**
 * @Author: 王顺
 * @Date: 2023/5/19 15:48
 * @Version 1.0
 */
public class AlertRuleInterpreter {
    private Expression expression;

    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> stats) {
        return expression.interpret(stats);
    }
}

