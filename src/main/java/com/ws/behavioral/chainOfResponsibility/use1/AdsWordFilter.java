package com.ws.behavioral.chainOfResponsibility.use1;

import javax.swing.text.AbstractDocument;

/**
 * @Author: 王顺
 * @Date: 2023/5/15 14:47
 * @Version 1.0
 */
public class AdsWordFilter implements SensitiveWordFilter{
    /**
     * @param content
     * @return
     */
    @Override
    public boolean doFilter(Content content) {
        return false;
    }
}
