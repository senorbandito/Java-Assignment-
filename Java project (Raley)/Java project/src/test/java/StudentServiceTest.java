import com.generation.service.StudentService;
import org.junit.Test;

import org.junit.jupiter.api.Assertions;


public class StudentServiceTest {



    private StudentService studentServiceTest = new StudentService();

    @Test
    public void findStudentTest()
    {
        Assertions.assertNull(  studentServiceTest.findStudent( "1") );
    }


    @Test
    public void isSubscribedTest()
    {
        Assertions.assertFalse(  studentServiceTest.isSubscribed( "1") );
    }



}
