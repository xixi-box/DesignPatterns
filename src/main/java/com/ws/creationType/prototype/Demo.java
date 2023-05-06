package com.ws.creationType.prototype;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: 王顺
 * @Date: 2023/5/6 14:33
 * @Version 1.0
 * @Description 原型模式
 */
public class Demo {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        //拷贝已有对象的数据，更新少量差值
        HashMap<String, SearchWord> newKeywords = currentKeywords;
        //从数据库中取出更新时间>lastUpdateTime的数据，放入到newKeywords中,这部分数据就是需要修改的数据
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        //新的lastUpdateTime
        long maxNewUpdatedTime = lastUpdateTime;
        //逐一取出这些数据
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            //找到一个最近的更新时间
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            //如果这个数据是原来已经有的，就更新数据
            if (newKeywords.containsKey(searchWord.getKeyword())) {
                SearchWord oldSearchWord = newKeywords.get(searchWord.getKeyword());
                oldSearchWord.setCount(searchWord.getCount());
                oldSearchWord.setLastUpdateTime(searchWord.getLastUpdateTime());
                //原来没有就新增数据
            } else {
                newKeywords.put(searchWord.getKeyword(), searchWord);
            }
        }
        lastUpdateTime = maxNewUpdatedTime;
        currentKeywords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        // TODO: 从数据库中取出更新时间>lastUpdateTime的数据
        return null;
    }
}

