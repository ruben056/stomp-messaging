package be.drs.stompmessaging.domain.model;

public class GreetingMsg {

    private String content;

    public GreetingMsg() {
    }

    public GreetingMsg(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
