package com.resnus.aws.demo.lambda.entity;

/**
 * Created by resnus on 5/29/2017.
 */
public class Request {
    private int id;
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
