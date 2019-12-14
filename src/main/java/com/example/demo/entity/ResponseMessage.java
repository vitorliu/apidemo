package com.example.demo.entity;

/**
 * 响应消息实体类
 *
 * @author Administrator
 */
public class ResponseMessage {

    // 描述
    private String msg;

    // 状态code
    private String code;

    // 数据
    private Object data;

    // session 返回码
    private String sessionCode;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getSessionCode() {
        return sessionCode;
    }

    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    @Override
    public String toString() {
        return "ResponseMessage [msg=" + msg + ", code=" + code + ", data=" + data + ", sessionCode=" + sessionCode
                + "]";
    }

    public ResponseMessage() {
    }

    public ResponseMessage(String code, String msg, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public ResponseMessage(String code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public ResponseMessage(String code, String msg, Object data, String sessionCode) {
        this.msg = msg;
        this.code = code;
        this.data = data;
        this.sessionCode = sessionCode;
    }
}
