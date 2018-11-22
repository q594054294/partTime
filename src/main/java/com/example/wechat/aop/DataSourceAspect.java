package com.example.wechat.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final String POINT_CUT = "execution(* com.example.wechat.service..*(..))";

    @Pointcut(POINT_CUT)
    public void pointcut(){

    }

    @Before(value = POINT_CUT)
    public void before(JoinPoint point){
        Signature signature = point.getSignature();
        logger.info("Class：{},Method：{},Params：{}",signature.getDeclaringTypeName(),signature.getName(),point.getArgs());
    }

    @AfterReturning(value = POINT_CUT,returning = "key")
    public void AfterReturning(JoinPoint point,Object key){
        if(key!=null) {
            logger.info("return：{}", key.toString());
        }else{
            logger.info("return：{}");
        }
    }
}
