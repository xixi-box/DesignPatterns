package com.ws.structuralType.bridge;

import java.util.List;

/**
 * @Author: 王顺
 * @Date: 2023/5/8 15:54
 * @Version 1.0
 */
public interface MsgSender {
    void send(String message);
}

class TelephoneMsgSender implements MsgSender {
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
    //...
    }
}

class EmailMsgSender implements MsgSender {
    @Override
    public void send(String message) {

    }
// 与TelephoneMsgSender代码结构类似，所以省略...
}

class WechatMsgSender implements MsgSender {
    @Override
    public void send(String message) {

    }
// 与TelephoneMsgSender代码结构类似，所以省略...
}