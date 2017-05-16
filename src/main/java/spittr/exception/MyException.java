package spittr.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by lim9527 on 4/25 0025.
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "找不到该资源文件！")
public class MyException extends RuntimeException {
}
