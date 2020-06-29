package test;

import com.liulang.dao.CommodityOrderMapper;
import com.liulang.dao.CourseMapper;
import com.liulang.dao.CourseSubitemMapper;
import com.liulang.model.Course;
import com.liulang.model.CourseSubitem;
import com.liulang.service.CourseService;
import com.liulang.service.impl.UserService;
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

    @Resource(name="commodityOrderMapper")
    private CommodityOrderMapper commodityOrderMapper;

    @Resource(name="userServiceImpl")
    private UserService us;

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

    @Test
    public void selectOrder(){
        System.out.println("sss: "+commodityOrderMapper.selectByOpenid("123123"));
    }

    @Test
    public void userService(){

        System.out.println("sss: "+us.getByTime("123123"));
    }
}
