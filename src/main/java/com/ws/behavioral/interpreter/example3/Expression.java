package com.ws.behavioral.interpreter.example3;

import java.util.Map;

public interface Expression {
    boolean interpret(Map<String, Long> stats);
}
