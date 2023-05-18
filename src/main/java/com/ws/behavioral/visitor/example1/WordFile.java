package com.ws.behavioral.visitor.example1;

public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    /**
     * @param extractor
     */
    @Override
    public void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }

    /**
     * @param compressor
     */
    @Override
    public void accept(Compressor compressor) {
        compressor.compress(this);
    }
}
