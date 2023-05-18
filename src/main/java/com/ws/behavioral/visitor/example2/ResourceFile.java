package com.ws.behavioral.visitor.example2;

/**
 * @Author: 王顺
 * @Date: 2023/5/18 15:18
 * @Version 1.0
 */
public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract public void accept(Visitor vistor);
}