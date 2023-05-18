package com.ws.behavioral.visitor.example2;

/**
 * @Author: 王顺
 * @Date: 2023/5/18 15:20
 * @Version 1.0
 */
public class Extractor implements Visitor {
    @Override
    public void visit(PPTFile pptFile) {
        //...
        System.out.println("Extract PPT.");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }

    @Override
    public void visit(WordFile wordFile) {
        //...
        System.out.println("Extract WORD.");
    }
}

