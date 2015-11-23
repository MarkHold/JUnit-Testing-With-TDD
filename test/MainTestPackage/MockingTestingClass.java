package MainTestPackage;

import View.*;

import org.junit.Before;
import org.junit.Test;

import static View.Main.getBoundIntegerFromUser;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Markus on 17/11/15.
 */
public class MockingTestingClass {

    @Test
    public void getsIntegerWhenWithinBoundsOfOneToTen() throws Exception {
        PracticalView asker = mock(PracticalView.class);
        when(asker.ask(anyString())).thenReturn(70);

        assertEquals(getBoundIntegerFromUser(asker), 70);
    }

   @Test
    public void asksForNewIntegerWhenOutsideBoundsOfOneToTen() throws Exception {
        PracticalView asker = mock(PracticalView.class);
        when(asker.ask("Hello and welcome, please Enter your weight!")).thenReturn(-5);
        when(asker.ask("that is an invalid number, please try agian!")).thenReturn(70);

        getBoundIntegerFromUser(asker);

        verify(asker).ask("that is an invalid number, please try agian!");
    }

}
