package com.youzhong.utils;

public class ResponseStatus {

       private int status;
       private String msg;

       public static ResponseStatus ok(){
           return new ResponseStatus(200,"响应成功");
       }
       public static ResponseStatus error(){
           return new ResponseStatus(500,"响应失败");
       }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResponseStatus(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ResponseStatus() {
    }
}
