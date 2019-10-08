import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student jason;
    Student mark;

    @Before
    public void setUp(){
        jason = new Student(1L,"Jason");
    }


    @Test
    public void testCreateStudent () {
        assertNotNull(jason);
        Student mark = null;
        assertNull(mark);
    }

    @Test
    public void testFieldsIfSetOrGet() {
        assertEquals(1L,jason.getId());
        assertEquals("Jason", jason.getName());
        assertNotNull(jason.getGrades());
    }

    @Test
    public void testAddGrade(){
        jason.addGrade(100);
        assertSame(100,jason.getGrades().get(0));
    }

    @Test
    public void testIFGradeAvgISCorrect() {
        jason.addGrade(90);
        jason.addGrade(80);
        assertEquals(85,jason.getGradeAverage(), 0);
    }
}
