package com.ws.behavioral.mediator.example2;

public class LandingPageDialog implements Mediator {
    private Button loginButton;
    private Button regButton;
    private Selection selection;
    private Input usernameInput;
    private Input passwordInput;
    private Input repeatedPswdInput;
    private Text hintText;

    @Override
    public void handleEvent(Component component, String event) {
        if (component.equals(loginButton)) {
            String username = usernameInput.text();
            String password = passwordInput.text();
//校验数据...
//做业务处理...
        } else if (component.equals(regButton)) {
//获取usernameInput、passwordInput、repeatedPswdInput数据...
//校验数据...
//做业务处理...
        } else if (component.equals(selection)) {
            String selectedItem = selection.select();
            if (selectedItem.equals("login")) {
                usernameInput.show();
                passwordInput.show();
                repeatedPswdInput.hide();
                hintText.hide();
//...省略其他代码
            } else if (selectedItem.equals("register")) {
//....
            }
        }
    }

    /**
     * @param loginButton
     */
    @Override
    public void setLoginButton(Button loginButton) {

    }

    /**
     * @param regButton
     */
    @Override
    public void setRegButton(Button regButton) {

    }

    /**
     * @param usernameInput
     */
    @Override
    public void setUsernameInput(Input usernameInput) {

    }

    /**
     * @param selection
     */
    @Override
    public void setSelection(Selection selection) {

    }

    /**
     * @param passwordInput
     */
    @Override
    public void setPasswordInput(Input passwordInput) {

    }

    /**
     * @param repeatedPswdInput
     */
    @Override
    public void setRepeatedPswdInput(Input repeatedPswdInput) {

    }

    /**
     * @param hintText
     */
    @Override
    public void setHintText(Text hintText) {

    }
}
