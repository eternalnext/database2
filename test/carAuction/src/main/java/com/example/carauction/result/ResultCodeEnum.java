package com.example.carauction.result;

import lombok.Getter;

/**
 * @version v1.0
 * @ClassName ResultCodeEnum
 * @Description TODO
 * @Author pjj
 * @Date 2021/12/15
 **/
@Getter
//枚举各接口响应时返回的内容，包括success（是否成功）、code（状态码）、message（提示信息）
public enum ResultCodeEnum {
    GET_CAR_NUMBER_SUCCESS(true,200,"获取成功"),
    GET_CAR_NUMBER_ERROR(false,300,"获取失败"),
    GET_CUSTOMER_NUMBER_SUCCESS(true,200,"获取成功"),
    GET_CUSTOMER_NUMBER_ERROR(false,300,"获取失败"),
    GET_CAR_INFO_SUCCESS(true,200,"获取成功"),
    GET_CAR_INFO_INDEX_TOO_LARGE(false,300,"汽车对应的下标过大"),
    GET_CAR_INFO_LIMIT_TOO_LONG(true,301,"limit超长"),
    GET_CUSTOMER_INFO_SUCCESS(true,200,"获取成功"),
    GET_CUSTOMER_INFO_INDEX_TOO_LARGE(false,300,"客户对应的下标过大"),
    GET_CUSTOMER_INFO_LIMIT_TOO_LONG(true,301,"limit超长"),
    GET_CAR_TYPE_INFO_SUCCESS(true,200,"获取成功"),
    GET_CAR_TYPE_INFO_INDEX_TOO_LARGE(false,300,"汽车对应的下标过大"),
    GET_CAR_TYPE_INFO_LIMIT_TOO_LONG(true,301,"limit超长"),
    GET_CAR_TYPE_INFO_ERROR(false,302,"获取失败"),
    GET_CAR_BID_NUMBER_SUCCESS(true,200,"获取成功"),
    GET_CAR_BID_NUMBER_ERROR(false,300,"获取失败"),
    GET_CAR_BID_INFO_SUCCESS(true,200,"获取成功"),
    GET_CAR_BID_INFO_INDEX_TOO_LARGE(false,300,"汽车对应的下标过大"),
    GET_CAR_BID_INFO_LIMIT_TOO_LONG(true,301,"limit超长"),
    GET_BID_CUSTOMER_NUMBER_SUCCESS(true,200,"获取成功"),
    GET_BID_CUSTOMER_NUMBER_ERROR(false,300,"获取失败"),
    GET_BID_INFO_SUCCESS(true,200,"获取成功"),
    GET_BID_INFO_INDEX_TOO_LARGE(false,300,"投标对应的下标过大"),
    GET_BID_INFO_LIMIT_TOO_LONG(true,301,"limit超长"),
    GET_BID_INFO_ERROR(false,302,"获取失败"),
    ADD_CAR_SUCCESS(true,200,"添加成功"),
    ADD_CAR_ERROR(false,300,"添加失败"),
    ADD_CUSTOMER_SUCCESS(true,200,"添加成功"),
    ADD_CUSTOMER_ERROR(false,300,"添加失败"),
    CHANGE_CUSTOMER_NAME_SUCCESS(true,200,"修改成功"),
    CHANGE_CUSTOMER_NAME_ERROR(false,300,"修改失败"),
    ADD_BID_SUCCESS(true,200,"添加成功"),
    ADD_BID_CUSTOMER_ISNULL(false,300,"用户不存在"),
    ADD_BID_CAR_ISNULL(false,301,"汽车不存在"),
    ADD_BID_CAR_OUTDATE(false,302,"拍卖已结束"),
    ADD_BID_CAR_TOO_SMALL(true,201,"投标小于最高投标"),
    ;
    private Boolean success;    //是否成功
    private Integer code;       //状态码
    private String message;     //提示信息
    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
    //获取状态码
    public Integer getCode() {
        return code;
    }
    //设置状态码
    public void setCode(Integer code) {
        this.code = code;
    }
    //获取提示信息
    public String getMessage() {
        return message;
    }
    //设置提示信息
    public void setMessage(String message) {
        this.message = message;
    }
    //获取成功判断
    public Boolean getSuccess() {
        return success;
    }
    //设置成功判断
    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
