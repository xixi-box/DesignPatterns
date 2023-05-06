package com.ws.creationType.prototype;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: 王顺
 * @Date: 2023/5/6 15:12
 * @Version 1.0
 * 先采用浅拷贝的方式创建 newKeywords。对于需要更新的 SearchWord 对象，
 * 我们再使用深度拷贝的方式创建一份新的对象，替换 newKeywords 中的老对象。毕竟需
 * 要更新的数据是很少的。这种方式即利用了浅拷贝节省时间、空间的优点，又能保证
 * currentKeywords 中的中数据都是老版本的数据。
 */
public class DemoFinal {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
    // Shallow copy
        HashMap<String, SearchWord> newKeywords = currentKeywords;
    // 从数据库中取出更新时间>lastUpdateTime的数据，放入到newKeywords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdatedTime = lastUpdateTime;
        //
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            //找到最大的更新时间，为下次更新做准备
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            //如果存在直接删除旧对象替换成新对象
            if (newKeywords.containsKey(searchWord.getKeyword())) {
                newKeywords.remove(searchWord.getKeyword());
            }
            newKeywords.put(searchWord.getKeyword(), searchWord);
        }
        lastUpdateTime = maxNewUpdatedTime;
        currentKeywords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        // TODO: 从数据库中取出更新时间>lastUpdateTime的数据
        return null;
    }
}
