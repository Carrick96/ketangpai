package cn.cqut.final_edu_ketangpai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;


public class CourseOfStudent implements Serializable {

	private static final long serialVersionUID = 8603261109095458655L;
	/**
	 *
	 */
	@TableId(value = "id",type = IdType.AUTO)
	private Integer id;

	/**
	 * 学生具体上的课
	 */
	@TableField("course_id")
	private String courseId;

	/**
	 * 具体的学生
	 */
	@TableField("student_id")
	private String studentId;


	/**
	 * 是否置顶，0为不置顶，1为置顶
	 */
	@TableField("top_status")
	private Boolean topStatus;

	/**
	 * 归档状态，0为不归档，1为归档
	 */
	@TableField("archive_status")
	private Boolean archiveStatus;

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

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Boolean getTopStatus() {
		return topStatus;
	}

	public void setTopStatus(Boolean topStatus) {
		this.topStatus = topStatus;
	}

	public Boolean getArchiveStatus() {
		return archiveStatus;
	}

	public void setArchiveStatus(Boolean archiveStatus) {
		this.archiveStatus = archiveStatus;
	}
}

