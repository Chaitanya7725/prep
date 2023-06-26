package com.example.us.higlobe.Summingevennumbers.Response;

public class Response {

    private int sum;
    private String message;

    public Response() {
    }

    public Response(int sum, String message) {
        this.sum = sum;
        this.message = message;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
