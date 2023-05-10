package com.ws.structuralType.adapter.use.u2;

/**
 * @Author: 王顺
 * @Date: 2023/5/10 15:16
 * @Version 1.0
 */
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private ASensitiveWordsFilter aFilter;

    public String filter(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }
    //...省略BSensitiveWordsFilterAdaptor、CSensitiveWordsFilterAdaptor...
}
