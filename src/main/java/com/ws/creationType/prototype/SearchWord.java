package com.ws.creationType.prototype;

public class SearchWord {
    private Long lastUpdateTime;
    private String keyword;
    private int count;

    public SearchWord(Long lastUpdateTime, String keyword, int count) {
        this.lastUpdateTime = lastUpdateTime;
        this.keyword = keyword;
        this.count = count;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getKeyword() {
        return keyword;
    }

    public int getCount() {
        return count;
    }
}
