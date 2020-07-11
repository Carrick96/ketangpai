package cn.cqut.final_edu_ketangpai.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@TableName("homework")
public class Homework implements Serializable {
	/**
	 * 默认主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	/**
	 * 作业名称
	 */
	@TableField("title")
	private String title;

	/**
	 * 作业详情
	 */
	@TableField("detail")
	private String detail;
	/**
	 * 最高分
	 */
	@TableField("top_score")
	private String topScore;
	/**
	 * 截止日期
	 */
	@TableField("deadline")
	private Date deadLine;

	/**
	 *
	 */
	@TableField("create_time")
	private LocalDateTime createTime;

	/**
	 * 延迟提交标识
	 */
	@TableField("is_delay")
	private Boolean isDelay;

	/**
	 * 课程所属作业
	 */
	@TableField("course_id")
	private String courseId;

	/**
	 * 修改日期
	 */
	@TableField("modify_date")
	private LocalDateTime modifyDate;

	@TableField(" homework_id")
	private String homeworkId;
	/**
	 *
	 */
	@TableField("delete_status")
	@TableLogic
	private Boolean deleteStatus;

	@TableField("remind_message")
	private String remindMessage;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getTopScore() {
		return topScore;
	}

	public void setTopScore(String topScore) {
		this.topScore = topScore;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public Boolean getDelay() {
		return isDelay;
	}

	public void setDelay(Boolean delay) {
		isDelay = delay;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public LocalDateTime getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(LocalDateTime modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getHomeworkId() {
		return homeworkId;
	}

	public void setHomeworkId(String homeworkId) {
		this.homeworkId = homeworkId;
	}

	public Boolean getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getRemindMessage() {
		return remindMessage;
	}

	public void setRemindMessage(String remindMessage) {
		this.remindMessage = remindMessage;
	}
}

