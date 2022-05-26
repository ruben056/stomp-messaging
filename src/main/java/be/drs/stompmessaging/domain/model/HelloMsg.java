package be.drs.stompmessaging.domain.model;

public class HelloMsg {

    private String name;

    public HelloMsg() {

    }

    public HelloMsg(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
