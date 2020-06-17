package com.liulang.service.impl;

import com.liulang.dao.CourseMapper;
import com.liulang.dao.CourseSubitemMapper;
import com.liulang.model.Course;
import com.liulang.model.CourseSubitem;
import com.liulang.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService {

    @Resource(name="courseMapper")
    private CourseMapper courseMapper;

    @Resource(name="courseSubitemMapper")
    private CourseSubitemMapper courseSubitemMapper;

    @Override
    public List<Course> getCourseAll() {
        return courseMapper.selectAll();
    }

    @Override
    public List<CourseSubitem> getCourseSubitemByCourseid(Integer courseid) {
        return courseSubitemMapper.selectByCourseid(courseid);
    }
}
