package MainTestPackage;

import Model.FatLoss;
import View.PracticalView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Markus on 10/11/15.
 */
public class FatLossTestingClass {



    @Test
    public void testCheckingForClass() throws Exception {

        FatLoss main = new FatLoss();
        assertNotNull(main);
    }

    @Test
    public void testCheckingIfWeightIsValid(){

        try {
            FatLoss main = new FatLoss();
        main.setWeight(-5);
        fail();
        }
        catch(IllegalArgumentException e){

        }
    }

    @Test
    public void testCheckingIfHeightIsValid() {


        try {
            FatLoss main = new FatLoss();
            main.setHeight(-5);
            fail();
        } catch (IllegalArgumentException e){

        }
    }

    @Test
    public void testCheckIfAgeIsValid() {

        try {
            FatLoss main = new FatLoss();
            main.setAge(-2);
            fail();
        }
        catch(IllegalArgumentException e){

        }
    }


    @Test
    public void testCountCalories(){
        int vikt = 70;
        int height = 180;
        int age = 20;
        FatLoss main = new FatLoss();


        assertEquals(1730.0, main.countCalories(vikt, height, age), 0.5);

    }

    @Test
    public void testCountCountCalories2(){

        try{
            FatLoss main = new FatLoss();
            main.countCalories(0, 0, 0);
            fail();

        }
        catch(IllegalArgumentException e){}
    }

    @Test
    public void testProteinCounterCheck()// a test method for counting protein intake
    {
        int vikt = 50;
        FatLoss main = new FatLoss();

        assertEquals(500, main.countProtein(vikt));
    }

    @Test
    public void testCarbCounter()
    {
        double kcal = 2000;

        FatLoss main = new FatLoss();

        assertEquals(250.0, main.countCarbs(kcal), 1);
    }

    @Test
    public void testFatCounter()
    {
        double kcal = 2001;

        FatLoss main = new FatLoss();

        assertEquals(44, main.countFats(kcal), 1);
    }

   /*
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @Test
    public void testPracticalViewConsole(){
        PracticalView view = new PracticalView();
        view.PrintResults();
        assertEquals("welcome to the macro counting app", outContent.toString());
    }
*/



}
