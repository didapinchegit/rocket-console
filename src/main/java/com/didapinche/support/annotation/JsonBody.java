package com.didapinche.support.annotation;

import java.lang.annotation.*;

/**
 * Created by tangjie
 * 2016/11/21
 * styletang.me@gmail.com
 * when success return JsonResult(data)
 * @see com.didapinche.support.JsonBodyReturnValueProcessor
 * when error return JsonResult(errCode,errMsg)
 * @see com.didapinche.support.JsonBodyExceptionResolver
 *
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JsonBody {

}
