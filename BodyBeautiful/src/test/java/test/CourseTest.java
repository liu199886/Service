package test;

import com.liulang.dao.CourseMapper;
import com.liulang.dao.CourseSubitemMapper;
import com.liulang.model.Course;
import com.liulang.model.CourseSubitem;
import com.liulang.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CourseTest {

    @Resource(name="courseMapper")
    private CourseMapper courseMapper;

    @Resource(name="courseServiceImpl")
    private CourseService courseService;

    @Resource(name="courseSubitemMapper")
    private CourseSubitemMapper courseSubitemMapper;

    @Test
    public void selectAll(){
        List<Course> a =  courseService.getCourseAll();
        for(Course c : a){
            System.out.println("111 : "+c.getDescription());
        }
    }

    @Test
    public void selectCourseSubitem(){
        List<CourseSubitem> a =  courseSubitemMapper.selectByCourseid(1);
        for(CourseSubitem c : a){
            System.out.println("111 : "+c);
        }
    }
}
