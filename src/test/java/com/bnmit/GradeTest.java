import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    @Test
    void testGradeA() {
        assertEquals('A', Grade.gradeFunction(95));
        assertEquals('A', Grade.gradeFunction(90)); // boundary
    }

    @Test
    void testGradeB() {
        assertEquals('B', Grade.gradeFunction(85));
        assertEquals('B', Grade.gradeFunction(80)); // boundary
    }

    @Test
    void testGradeC() {
        assertEquals('C', Grade.gradeFunction(75));
        assertEquals('C', Grade.gradeFunction(70)); // boundary
    }

    @Test
    void testGradeD() {
        assertEquals('D', Grade.gradeFunction(65));
        assertEquals('D', Grade.gradeFunction(60)); // boundary
    }

    @Test
    void testGradeF() {
        assertEquals('F', Grade.gradeFunction(50));
        assertEquals('F', Grade.gradeFunction(0));  // edge case
    }
}