package com.ws.behavioral.visitor.example1;

/**
 * @Author: 王顺
 * @Date: 2023/5/18 14:41
 * @Version 1.0
 */
public class Extractor {
    public void extract2txt(PPTFile pptFile) {
        //...
        System.out.println("Extract PPT.");
    }

    public void extract2txt(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }

    public void extract2txt(WordFile wordFile) {
        //...
        System.out.println("Extract WORD.");
    }
}