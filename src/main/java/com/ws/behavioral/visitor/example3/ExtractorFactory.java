package com.ws.behavioral.visitor.example3;

import java.util.HashMap;
import java.util.Map;

//...PPTExtractor/WordExtractor跟PdfExtractor代码结构类似，此处省略...
public class ExtractorFactory {
    private static final Map<ResourceFileType, Extractor> extractors = new HashMap<>();

    static {
        extractors.put(ResourceFileType.PDF, new PdfExtractor());
        extractors.put(ResourceFileType.PPT, new PPTExtractor());
        extractors.put(ResourceFileType.WORD, new WordExtractor());
    }

    public static Extractor getExtractor(ResourceFileType type) {
        return extractors.get(type);
    }
}
