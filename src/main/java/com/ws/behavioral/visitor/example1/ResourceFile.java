package com.ws.behavioral.visitor.example1;

/**
 * @Author: 王顺
 * @Date: 2023/5/18 14:35
 * @Version 1.0
 */
public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }
    abstract public void accept(Extractor extractor);
    abstract public void accept(Compressor compressor);

}

