package MainTestPackage;

import junit.framework.TestCase;

/**
 * Created by Markus on 10/11/15.
 */
public class MainTestingClass extends TestCase {

    public void CheckingForClassTest() throws Exception
    {
        Main main = new Main();
        assertNotNull(main);
    }
}
