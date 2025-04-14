package com.mrstride;

import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Actor2 implements MyBehavior{
  
    @Override
    public void act() {
        System.out.println("I can't act!");
    }

    public boolean earnAnOscar(Logger logger) {
        logger.info("I earned an Oscar!");
        return true;
    }

}
