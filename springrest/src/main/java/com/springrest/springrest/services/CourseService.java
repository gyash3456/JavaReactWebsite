package com.springrest.springrest.services;
import com.springrest.springrest.entities.Course;
import java.util.List;


public interface CourseService {
	List<Course>getCourses();
	public Course getCourse(long courseID);
	public Course addCourse(Course course);
	public void deleteCourse(long courseId);
	public Course updateCourse(Course course);

}
