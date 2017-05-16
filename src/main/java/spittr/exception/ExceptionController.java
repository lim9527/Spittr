package spittr.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lim9527 on 4/25 0025.
 */

@Controller
@RequestMapping(value = "/ex")
public class ExceptionController {

    @RequestMapping(method = RequestMethod.GET)
    public String exception(int i){

        if (i==1){
            throw new MyException();
        }

        return "home";
    }
}
