import com.generation.service.CourseService;
import org.junit.Test;

import org.junit.jupiter.api.Assertions;


public class CourseServiceTest {



    private CourseService courseServiceTest = new CourseService();

    @Test
    public void getCourse()
    {
        Assertions.assertNotNull( courseServiceTest.getCourse( "INTRO-CS-1") );
    }





}
