package MainTestPackage;

import View.*;

import org.junit.Before;
import org.junit.Test;

import static View.Main.getBoundIntegerFromUser;
import static View.Main.getHeightFromUser;
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
    public void askforWeight() throws Exception {
        PracticalView asker = mock(PracticalView.class);
        when(asker.ask("Hello and welcome, please Enter your weight!")).thenReturn(-5);
        when(asker.ask("that is an invalid number, please try agian!")).thenReturn(70);

        getBoundIntegerFromUser(asker);

        verify(asker).ask("that is an invalid number, please try agian!");
    }

    @Test
    public void getIntForHeight() throws Exception {
        PracticalView height = mock(PracticalView.class);
        when(height.ask(anyString())).thenReturn(70);

        assertEquals(getHeightFromUser(height), 70);
    }

    @Test
    public void askForHeight() throws Exception {
        PracticalView height = mock(PracticalView.class);
        when(height.ask("Now its time to enter your height!")).thenReturn(-5);
        when(height.ask("that is an invalid number, please try again!")).thenReturn(70);

        getHeightFromUser(height);

        verify(height).ask("that is an invalid number, please try again!");
    }

}
