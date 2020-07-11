package cn.cqut.final_edu_ketangpai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("course_of_teacher")
public class CourseOfTeacher implements Serializable {
	private static final long serialVersionUID = 8714950475005874563L;
	/**
	 *
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	/**
	 *
	 */
	@TableField("course_id")
	private String courseId;

	/**
	 *
	 */
	@TableField("teacher_id")
	private String teacherId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
}
