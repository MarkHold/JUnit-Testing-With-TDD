package MainTestPackage;

import View.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * Created by Markus on 17/11/15.
 */
public class MockingTestingClass {


    @Before
    public void setUp(){


    }
    @Test
    public void testPracticalViewConsole(){
        Printer printer = mock(Printer.class);
        PracticalView view = new PracticalView(printer);

        view.PrintResults();

        verify(printer, times(1)).println("welcome to the macro counting app");
    }


}
