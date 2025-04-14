package com.mrstride;

import org.apache.logging.log4j.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;

public class Actor1Test {

    @Test
    public void testEarnAnOscar() {
        Actor1 actorMock = new Actor1();
        Logger loggerMock = mock(Logger.class);

        boolean result = actorMock.earnAnOscar(loggerMock);

        assertEquals(true, result);
        Mockito.verify(loggerMock).info("I earned an Oscar!");
    }
}
