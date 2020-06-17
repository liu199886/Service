package com.liulang.controller;

import com.alibaba.fastjson.JSON;
import com.liulang.model.Course;
import com.liulang.model.CourseSubitem;
import com.liulang.service.CourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller()
@RequestMapping("/course")
public class CourseController {

    @Resource(name="courseServiceImpl")
    private CourseService courseService;

    @RequestMapping(value="/allCourse")
    @ResponseBody
    public  String courseAll(){
        List<Course> courses =  courseService.getCourseAll();
        return JSON.toJSONString(courses);
    }

    @RequestMapping(value="/courseSubitem")
    @ResponseBody
    public  String courseSubitem(@Param("data") Integer courseid){
        System.out.println("已被请求 ："+courseid);
        List<CourseSubitem> coursesSubitemList =  courseService.getCourseSubitemByCourseid(courseid);
        return JSON.toJSONString(coursesSubitemList);
    }

}
