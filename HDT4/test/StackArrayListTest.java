/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Daniel Gerendas 13158
 * @author Edgar Chamo 13083
 * @since 1/08/2014
 */
public class StackArrayListTest {
    
    public StackArrayListTest() {
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
     * Test of push method, of class StackArrayList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = null;
        StackArrayList instance = new StackArrayList();
        instance.push(item);
        boolean val=false;
        if(instance.size()==1)
            val=true;
        assertTrue(val);
    }

    /**
     * Test of pop method, of class StackArrayList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackArrayList instance = new StackArrayList();
        Object expResult = null;
        //Object result = instance.pop();
        boolean val1=false;
        boolean val2=false;
        
        Object item=3;
        instance.push(item);
        Object result=instance.pop();
        if(result==item && instance.empty()==true){
            val2=true;
        }
        assertTrue(val2);
    }

    /**
     * Test of peek method, of class StackArrayList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackArrayList instance = new StackArrayList();
        Object item=null;
        instance.push(item);
        boolean val=false;
        if(instance.peek()==item && instance.size()==1){
            val=true;
        }
        assertTrue(val);
    }

    /**
     * Test of size method, of class StackArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackArrayList instance = new StackArrayList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
}
