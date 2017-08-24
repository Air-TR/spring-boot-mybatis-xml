package com.tr.sbmx.exception;

import com.tr.sbmx.enums.ResultEnum;

/**
 * @author taorun
 * 2017/8/16 下午2:47
 */

public class MyException extends RuntimeException {

    private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
