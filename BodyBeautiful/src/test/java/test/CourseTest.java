package test;

import com.liulang.dao.CommodityOrderMapper;
import com.liulang.dao.CourseMapper;
import com.liulang.dao.CourseSubitemMapper;
import com.liulang.dao.UserMapper;
import com.liulang.model.Course;
import com.liulang.model.CourseSubitem;
import com.liulang.model.User;
import com.liulang.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
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

    @Resource(name="userMapper")
    private UserMapper userMapper;



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
        System.out.println("sss: "+commodityOrderMapper.selectByOpenid("111").getByTime());
    }

    @Test
    public void selectUserByOpenid(){
        Integer a = userMapper.selectByOpenid("111");
        System.out.println("aaa : "+a);
    }

    @Test
    public void addUser(){
        User user= new User();
        user.setNickname("法外狂徒张三");
        user.setOpenid("adakdkad");
        user.setRegistertTime(new Date());
        userMapper.insert(user);
    }


}
