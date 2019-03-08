package com.sl.land.exception;

/**
 * @author shulu
 */
public class NullUserNameException extends Throwable {
    private String userName;
    public NullUserNameException(String userName) {
        super("Null UserName Exception");
        this.userName=userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
