import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    void beforeAllInint(){
        System.out.println("This needs to run before all");
    }

    @BeforeEach
    void init() {
        mathUtils=new MathUtils();
    }

    @AfterEach
    @EnabledOnOs(OS.LINUX)
    void cleanUp(){
        System.out.println("Cleaning Up ....");
    }

    @Test
    void testadd() {
        /*MathUtils mathUtils = new MathUtils();*/
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual,"The add method should add two numbers");
    }

    @Test
    void testDivide(){
        /*MathUtils mathUtils = new MathUtils();*/
        boolean serverUp = false;
        assumeTrue(serverUp);
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0),"Divide by Zero should throw");
    }

    @Test
    @DisplayName("Testing radius method")
    void testComputeCircleRadius(){
        /*MathUtils mathUtils = new MathUtils();*/
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return the circle area");
    }

    @Test
    @Disabled
    @DisplayName("Test Disable")
    void testDisabled(){
        fail("This test should be disabled");
    }

    @Nested
    @DisplayName("add Test package")
    class AddTest{
        @Test
        @DisplayName("when adding two positive numbers")
        void testAddPositive(){
            assertEquals(2,mathUtils.add(1,1), "should return the right sum");
        }

        @Test
        @DisplayName("when adding two positive numbers")
        void testAddNegative(){
            assertEquals(-1,mathUtils.add(-1,-1),"Should return the right sum");
        }
    }

    @Test
    @DisplayName("multiply method")
    void testMultiply(){
        assertEquals(2,mathUtils.multiply(2,1),"should return the right multiply");
        assertAll(
                () -> assertEquals(2,mathUtils.multiply(2,1)),
                () -> assertEquals(5, mathUtils.add(2,3)),
                () -> assertEquals(-3, mathUtils.add(-2,-1))

        );
    }






}