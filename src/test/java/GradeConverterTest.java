import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GradeConverterTest {

    private final  GradeConverter gradeConverter = new GradeConverter("");
    @Test
    public void testConvertGrades() {
        // Test case 1
        String input1 = "Kozak Maksym 80";
        String expectedOutput1 = "Kozak Maksym - GOOD";
        String actualOutput1 = gradeConverter.convertGrades(input1);
        assertEquals(expectedOutput1, actualOutput1);
        System.out.println("Input: " + input1);
        System.out.println("Expected output: " + expectedOutput1);
        System.out.println("Actual output: " + actualOutput1);
        System.out.println();

        // Test case 2
        String input2 = "Jane Smith 55";
        String expectedOutput2 = "Jane Smith - SATISFACTORY";
        String actualOutput2 = gradeConverter.convertGrades(input2);
        assertEquals(expectedOutput2, actualOutput2);
        System.out.println("Input: " + input2);
        System.out.println("Expected output: " + expectedOutput2);
        System.out.println("Actual output: " + actualOutput2);
        System.out.println();

        // Add more test cases as needed
    }
}





