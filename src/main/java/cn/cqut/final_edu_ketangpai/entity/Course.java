package cn.cqut.final_edu_ketangpai.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.time.LocalDateTime;



@TableName("course")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Course implements Serializable {
	/**
	 * 默认主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	/**
	 * 课程编号
	 */
	@TableField("course_id")
	private String courseId;

	/**
	 * 课程名称
	 */
	@TableField("course_name")
	private String courseName;

	/**
	 *
	 */
	@TableField("class_name")
	private String className;

	/**
	 * 授课教师ID
	 */
	@TableField("teacher_id")
	private String teacherId;

	/**
	 * 授课教师姓名
	 */
	@TableField("teacher_name")
	private String teacherName;

	/**
	 *
	 */
	@TableField("year")
	private String year;

	/**
	 * 授课学期
	 */
	@TableField("term")
	private String term;

	/**
	 *
	 */
	@TableField("create_date")
	private LocalDateTime createDate;

	@TableField("modify_date")
	private LocalDateTime modifyDate;

	/**
	 *
	 */
	@TableLogic
	@TableField("delete_status")
	private Boolean deleteStatus;

	/**
	 * 是否置顶，0为不置顶，1为置顶
	 */
	@TableField("top_status")
	private Boolean topStatus;

	/**
	 * 归档状态，0为不归档，1为归档
	 */

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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(LocalDateTime modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Boolean getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
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

	private static final long serialVersionUID = 1L;
}

