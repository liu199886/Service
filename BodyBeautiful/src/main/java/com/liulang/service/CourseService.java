package com.liulang.service;

import com.liulang.model.Course;
import com.liulang.model.CourseSubitem;

import java.util.List;

public interface CourseService {
    List<Course> getCourseAll();

    /**
     * 通过courseid查询子课程记录
     * @param courseid
     * @return
     */
    List<CourseSubitem> getCourseSubitemByCourseid(Integer courseid);
}
