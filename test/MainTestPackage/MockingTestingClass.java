package MainTestPackage;

import View.*;

import org.junit.Before;
import org.junit.Test;

import static View.Main.getAgeFromUser;
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

    @Test
    public void getIntForAge() throws Exception {
        PracticalView age = mock(PracticalView.class);
        when(age.ask(anyString())).thenReturn(70);

        assertEquals(getAgeFromUser(age), 70);
    }

    @Test
    public void askForAge() throws Exception {
        PracticalView age = mock(PracticalView.class);
        when(age.ask("We are almost done! Now please enter your age")).thenReturn(-5);
        when(age.ask("that is an invalid number, please try again!")).thenReturn(70);

        getAgeFromUser(age);

        verify(age).ask("that is an invalid number, please try again!");
    }

    @Test
    public void getIntforApp() throws Exception{
        PracticalView app = mock(PracticalView.class);
        when(app.ask(anyString())).thenReturn(70);

        assertEquals(getAgeFromUser(app), 70);
    }

    @Test
    public void askForApp() throws Exception {
        PracticalView app = mock(PracticalView.class);
        when(app.ask("Now its time to choose. If you want the macros for Fatloss, please enter the number 1," +
                "if you want the macros for muscle gain, please enter the number 2")).thenReturn(-5);
        when(app.ask("that is an invalid number, please try again!")).thenReturn(1);

        getAgeFromUser(app);

        verify(app).ask("that is an invalid number, please try again!");
    }

}
