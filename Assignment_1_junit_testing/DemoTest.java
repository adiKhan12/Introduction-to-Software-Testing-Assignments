/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DemoTest {

    @Test
    public void test_is_triangle(){
        assertTrue(Demo.isTriangle(3, 4, 5));
    }
    // write further tests
    @Test
    public void test_is_triangle_2(){
        assertTrue(Demo.isTriangle(5, 12, 13));
    }
    @Test
    public void test_is_triangle_3(){
        assertTrue(Demo.isTriangle(5, 13, 12));
    }
    @Test
    public void test_is_triangle_4(){
        assertTrue(Demo.isTriangle(12, 5, 13));
    }
    @Test
    public void test_is_triangle_5(){
        assertTrue(Demo.isTriangle(12, 13, 5));
    }
    @Test
    public void test_is_triangle_6(){
        assertTrue(Demo.isTriangle(13, 5, 12));
    }
    @Test
    public void test_is_triangle_7(){
        assertTrue(Demo.isTriangle(13, 12, 5));
    }
    @Test
    public void test_is_triangle_8(){
        assertFalse(Demo.isTriangle(5, 7, 13));
    }
    @Test
    public void test_is_triangle_9(){
        assertFalse(Demo.isTriangle(5, 13, 7));
    }
    // Test which is not a triangle
    @Test
    public void test_is_triangle_10(){
        assertFalse(Demo.isTriangle(5, 7, 12));
    }
    @Test
    public void test_is_triangle_11(){
        assertFalse(Demo.isTriangle(5, 12, 7));
    }
    @Test
    public void test_is_triangle_12(){
        assertFalse(Demo.isTriangle(7, 5, 12));
    }
    @Test
    public void test_is_triangle_13(){
        assertFalse(Demo.isTriangle(7, 12, 5));
    }
    @Test
    public void test_is_triangle_zero_sides() {
        assertFalse(Demo.isTriangle(0, 4, 5));
    }

    @Test
    public void test_is_triangle_negative_sides() {
        assertFalse(Demo.isTriangle(-3, 4, 5));
    }



    @Test
    public void test_main_valid_triangle() {
        String input = "5\n12\n13\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        Demo.main(new String[]{});
        String seprator = System.lineSeparator();
        String expected = "Enter side 1: " + seprator +
                          "Enter side 2: " + seprator +
                          "Enter side 3: " + seprator +
                          "This is a triangle." + seprator;
        assertEquals(expected, out.toString());
    }
        
    @Test
    public void test_main_invalid_triangle() {
        String input = "1\n2\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        Demo.main(new String[]{});
        String seprator = System.lineSeparator();
        String expected = "Enter side 1: " + seprator +
                          "Enter side 2: " + seprator +
                          "Enter side 3: " + seprator +
                          "This is not a triangle." + seprator;
        assertEquals(expected, out.toString());
    }
    
    @Test
    public void test_main_negative_sides() {
        String input = "-3\n4\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        Demo.main(new String[]{});
        String seprator = System.lineSeparator();
        String expected = "Enter side 1: " + seprator +
                          "Enter side 2: " + seprator +
                          "Enter side 3: " + seprator +
                          "This is not a triangle." + seprator;
        assertEquals(expected, out.toString());
    }
    @Test
    public void test_main_zero_sides() {
        String input = "0\n0\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        Demo.main(new String[]{});
        String seprator = System.lineSeparator();
        String expected = "Enter side 1: " + seprator +
                          "Enter side 2: " + seprator +
                          "Enter side 3: " + seprator +
                          "This is not a triangle." + seprator;
        assertEquals(expected, out.toString());
    }


}
