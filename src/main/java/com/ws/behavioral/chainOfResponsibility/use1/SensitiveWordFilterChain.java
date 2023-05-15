package com.ws.behavioral.chainOfResponsibility.use1;

import java.util.ArrayList;
import java.util.List;

// PoliticalWordFilter、AdsWordFilter类代码结构与SexyWordFilter类似
public class SensitiveWordFilterChain {
    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter) {
        this.filters.add(filter);
    }

    // return true if content doesn't contain sensitive words.
    public boolean filter(Content content) {
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
