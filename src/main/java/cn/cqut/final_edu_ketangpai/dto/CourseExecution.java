package cn.cqut.final_edu_ketangpai.dto;

import cn.cqut.final_edu_ketangpai.entity.Course;
import cn.cqut.final_edu_ketangpai.enums.CourseStateEnum;

import java.util.List;

/**
 * @CLASSNAME:CourseExecution
 * @description:
 * @author: Nonameguy
 * @create: 2020-05-09 22:33
 */

public class CourseExecution {
	//结果状态
	private int state;

	//状态标识
	private String stateInfo;

	//课程数量
	private int count;

	//操作的course(增删改课程的时候使用)
	private Course course;

	//course列表（查询时使用）
	private List<Course> courseList;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public CourseExecution(){

	}
	// 操作失败的时候使用的构造器
	public CourseExecution(CourseStateEnum stateEnum) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	// 操作成功的时候使用的构造器
	public CourseExecution(CourseStateEnum stateEnum, Course course) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.course = course;
	}

	// 操作成功的时候使用的构造器
	public CourseExecution(CourseStateEnum stateEnum, List<Course> courseList) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.courseList = courseList;
	}
}
