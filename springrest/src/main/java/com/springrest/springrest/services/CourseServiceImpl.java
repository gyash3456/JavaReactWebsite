package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
//	List<Course> list;
	public CourseServiceImpl() {
//		list =new ArrayList<>();
//		list.add(new Course(145,"Java Core Course","this course contains basics of java"));
//		list.add(new Course(146,"Java Core Course","this course contains basics of java"));
		
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
		return courseDao.getReferenceById(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course) {
		
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c = null;
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getId()==courseId) {
//				c=list.remove(i);
//			}
//		}
//		return c;
		Course entity=courseDao.getReferenceById(courseId);
		courseDao.delete(entity);
	}

}
