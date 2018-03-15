package com.example.lightdance.jcvideoplayerdemo.app;

/**
 * 使用时：AppError.PASSWORD_NOT_MATCH_USERNAME.toString这样
 *
 * @author LightDance
 * @date 2018/2/3.
 */

public enum AppError {
    //与用户相关的错误列表
    PASSWORD_NOT_MATCH_USERNAME(1, "用户名与密码不匹配"),
    USER_INFO_NOT_FOUND(2, "无法找到用户信息"),

    //其他N多可能出现的错误
    NETWORK_LINK_ERROR(3, "你没联网吧"),

    //资源or数据无法获取
    SRC_NOT_FOUND(4, "无法获取指定数据");

    private int errorCode;
    private String description;

    private AppError(int errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.errorCode + "_" + this.description;
    }
}
