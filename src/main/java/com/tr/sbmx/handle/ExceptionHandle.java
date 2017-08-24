package com.tr.sbmx.handle;

import com.tr.sbmx.entity.Result;
import com.tr.sbmx.enums.ResultEnum;
import com.tr.sbmx.exception.MyException;
import com.tr.sbmx.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author taorun
 * 2017/8/7 下午4:17
 */

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof MyException) {
            MyException myException = (MyException) e;
            return ResultUtil.error(myException.getCode(), myException.getMessage());
        } else {
            logger.error("[系统异常]", e);
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), e.getMessage());
        }
    }

}
