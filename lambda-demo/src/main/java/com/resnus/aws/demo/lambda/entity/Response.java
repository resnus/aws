package com.resnus.aws.demo.lambda.entity;

/**
 * Created by resnus on 5/29/2017.
 */
public class Response {
    private String value;

    public Response(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Response{" +
                "value='" + value + '\'' +
                '}';
    }
}
