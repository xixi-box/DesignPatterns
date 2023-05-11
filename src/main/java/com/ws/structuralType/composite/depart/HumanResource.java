package com.ws.structuralType.composite.depart;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 王顺
 * @Date: 2023/5/11 15:25
 * @Version 1.0
 */
public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}

