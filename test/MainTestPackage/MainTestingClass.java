package MainTestPackage;

import Implementation.Main;
import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by Markus on 10/11/15.
 */
public class MainTestingClass extends TestCase {


    @Test
    public void testCheckingForClass() throws Exception {

        Main main = new Main();
        assertNotNull(main);
    }

    @Test
    public void testCheckingIfWeightIsValid(){

        try {
            Main main = new Main();
        main.setWeight(-5);
        fail();
        }
        catch(IllegalArgumentException e){

        }
    }

    @Test
    public void testCheckingIfHeightIsValid() {

        try {
            Main main = new Main();
            main.setHeight(-5);
            fail();
        } catch (IllegalArgumentException e){

        }
    }

    @Test
    public void testCheckIfAgeIsValid() {

        try {
            Main main = new Main ();
            main.setAge(-2);
            fail();
        }
        catch(IllegalArgumentException e){

        }
    }

}
