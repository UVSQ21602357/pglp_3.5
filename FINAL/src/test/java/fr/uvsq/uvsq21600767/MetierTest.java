package fr.uvsq.uvsq21600767;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MetierTest extends TestCase{

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MetierTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MetierTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
