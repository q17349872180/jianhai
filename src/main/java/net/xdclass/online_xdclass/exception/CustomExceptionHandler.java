package net.xdclass.online_xdclass.exception;



import net.xdclass.online_xdclass.utils.JsonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


//@ControllerAdvice
public class CustomExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);

    //@ExceptionHandler(value = Exception.class)
    //@ResponseBody
    public JsonData handle(Exception e){

        if (e instanceof XDException){

            logger.error("{ 系统异常 }",e);
            XDException xdException = (XDException) e;

            return JsonData.buildError( xdException.getCode(), xdException.getMessage());
        }else {

            return JsonData.buildError("全局异常配置错误");
        }
    }

}
