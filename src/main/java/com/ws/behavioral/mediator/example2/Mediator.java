package com.ws.behavioral.mediator.example2;

/**
 * @Author: 王顺
 * @Date: 2023/5/19 16:25
 * @Version 1.0
 */
public interface Mediator {
    void handleEvent(Component component, String event);

    void setLoginButton(Button loginButton);

    void setRegButton(Button regButton);

    void setUsernameInput(Input usernameInput);

    void setSelection(Selection selection);

    void setPasswordInput(Input passwordInput);

    void setRepeatedPswdInput(Input repeatedPswdInput);

    void setHintText(Text hintText);
}

