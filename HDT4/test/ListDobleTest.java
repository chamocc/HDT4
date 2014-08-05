/**
 * @author Daniel Gerendas 13158
 * @author Edgar Chamo 13083
 * @since 1/08/2014
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ed. Chamo
 */
public class ListDobleTest {
    
    public ListDobleTest() {
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

    /**
     * Test of addFirst method, of class ListDoble.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        ListDoble instance = new ListDoble();
        instance.addFirst(value);
        boolean val=false;
        if(instance.size()==1)
            val=true;
        assertTrue(val);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of size method, of class ListDoble.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListDoble instance = new ListDoble();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFirst method, of class ListDoble.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        ListDoble instance = new ListDoble();
        Object expResult = null;
        Object result = null;
        
        instance.addFirst(result);
        boolean val=false;
        if(instance.getFirst()==result && instance.size()==1){
            val=true;
        }
        assertTrue(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeFirst method, of class ListDoble.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        ListDoble instance = new ListDoble();
         Object expResult = null;
        //Object result = instance.removeFirst();
        
        boolean val1=false;
        boolean val2=false;
        
        Object item=3;
        instance.addFirst(item);
        Object result=instance.removeFirst();
        if(result==item && instance.size()==0){
            val2=true;
        }
        assertTrue(val2);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
