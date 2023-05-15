package com.ws.behavioral.chainOfResponsibility.use1;

import javax.swing.text.AbstractDocument;

public class SexyWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Content content) {
        boolean legal = true;
//...
        return legal;
    }
}
