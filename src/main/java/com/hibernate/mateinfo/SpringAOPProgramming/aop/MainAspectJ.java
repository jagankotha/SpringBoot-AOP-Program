package com.hibernate.mateinfo.SpringAOPProgramming.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MainAspectJ {
   @Pointcut("execution( public void com.hibernate.mateinfo.SpringAOPProgramming.businees.BusinessClass.show())")
    public void p(){}

    @Before ( "p()" )
    public void trBegin(){
        System.out.println ("Tr Begin....." );
    }
    @After ( "p()" )
    public void trEnd(){
        System.out.println ("Tr End...." );
    }

}
