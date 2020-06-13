package com.zhaike.service.impl;

import com.zhaike.entity.Course;
import com.zhaike.entity.CourseExample;
import com.zhaike.mapping.CourseMapper;
import com.zhaike.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> alCourses() {
        return courseMapper.selectAllCourses();
    }
}
