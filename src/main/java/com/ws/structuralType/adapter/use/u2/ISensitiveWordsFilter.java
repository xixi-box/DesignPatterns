package com.ws.structuralType.adapter.use.u2;

/**
 * @Author: 王顺
 * @Date: 2023/5/10 15:15
 * @Version 1.0
 * @Description 使用适配器进行改造
 * 某个功能的实现依赖多个外部系统（或者说类）。通过适配器模式，将它们的接口适配为统
 * 一的接口定义，然后我们就可以使用多态的特性来复用代码逻辑。具体我还是举个例子来解
 * 释一下。
 * 假设我们的系统要对用户输入的文本内容做敏感词过滤，为了提高过滤的召回率，我们引入
 * 了多款第三方敏感词过滤系统，依次对用户输入的内容进行过滤，过滤掉尽可能多的敏感
 * 词。但是，每个系统提供的过滤接口都是不同的。这就意味着我们没法复用一套逻辑来调用
 * 各个系统。这个时候，我们就可以使用适配器模式，将所有系统的接口适配为统一的接口定
 * 义，这样我们可以复用调用敏感词过滤的代码。
 */
public interface ISensitiveWordsFilter {//统一接口定义

    String filter(String text);


}