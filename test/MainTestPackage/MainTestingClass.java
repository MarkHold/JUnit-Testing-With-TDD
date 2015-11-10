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


}
