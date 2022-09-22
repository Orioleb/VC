package vowelconsonant;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class VowelTest {
	
	public VowelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void VowelTest1(){
    VowelConsonant v = new VowelConsonant();
    String res = "vocal";
    String result = v.check("a");
    assertEquals(res,result);
    }
    
    @Test
    public void VowelTest2(){
    VowelConsonant v = new VowelConsonant();
    String res = "consonant";
    String result = v.check("f");
    assertEquals(res,result);
    }
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
