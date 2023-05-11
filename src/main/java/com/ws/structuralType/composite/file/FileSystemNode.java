package com.ws.structuralType.composite.file;

/**
 * @Author: 王顺
 * @Date: 2023/5/11 15:10
 * @Version 1.0
 */
public abstract class FileSystemNode {
    protected String path;

    public FileSystemNode(String path) {
        this.path = path;
    }

    public abstract int countNumOfFiles();

    public abstract long countSizeOfFiles();

    public String getPath() {
        return path;
    }
}

