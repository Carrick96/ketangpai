package cn.cqut.final_edu_ketangpai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;

import java.io.Serializable;
import java.time.LocalDateTime;


public class HomeworkOfStudent implements Serializable {
    /**
     * 默认Id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 作业ID
     */
    @TableField("homework_id")
    private String homeworkId;

    /**
     * 学生ID
     */
    @TableId("student_id")
    private String studentId;

    @TableField("student_name")
    private String studentName;
    /**
     *
     */
    @TableField("course_id")
    private String courseId;
    /**
     *
     */
    @TableField("max_score")
    private String maxScore;
    /**
     * 作业文件链接
     */
    @TableField("file_link")
    private String fileLink;

    /**
     * 是否审阅
     */
    @TableField("is_read")
    private Boolean isRead;

    /**
     * 是否提交
     */
    @TableField("is_submit")
    private Boolean isSubmit;

    /**
     * 分数
     */
    @TableField("socre")
    private Integer socre;

    /**
     *
     */
    @TableField("delete_status")
    @TableLogic
    private Boolean deleteStatus;

    /**
     *
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     *
     */
    @TableField("modify_time")
    private LocalDateTime modifyTime;
    @TableField("homework_title")
    private String homeworkTitle;

    @TableField("homework_message")
    private String homeworkMessage;

    /**
     * 0为不置顶，1为置顶
     */
    @TableField("top_status")
    private Boolean topStatus;
    /**
     * 0为不归档，1为归档
     */
    @TableField("archive_status")
    private Boolean archiveStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(String homeworkId) {
        this.homeworkId = homeworkId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(String maxScore) {
        this.maxScore = maxScore;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }

    public Boolean getSubmit() {
        return isSubmit;
    }

    public void setSubmit(Boolean submit) {
        isSubmit = submit;
    }

    public Integer getSocre() {
        return socre;
    }

    public void setSocre(Integer socre) {
        this.socre = socre;
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getHomeworkTitle() {
        return homeworkTitle;
    }

    public void setHomeworkTitle(String homeworkTitle) {
        this.homeworkTitle = homeworkTitle;
    }

    public String getHomeworkMessage() {
        return homeworkMessage;
    }

    public void setHomeworkMessage(String homeworkMessage) {
        this.homeworkMessage = homeworkMessage;
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

