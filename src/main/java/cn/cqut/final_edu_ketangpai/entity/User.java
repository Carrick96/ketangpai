package cn.cqut.final_edu_ketangpai.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@TableName("user")
public class User implements Serializable {
	/**
	 *
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	/**
	 * 学号或职工号
	 */
	@TableId("user_id")
	private String userId;

	/**
	 * 密码
	 */
	@TableId("password")
	private String password;

	/**
	 * 登录账号，即邮箱
	 */
	@TableId("account")
	private String account;

	/**
	 * 用户名
	 */
	@TableField("username")
	private String username;

	/**
	 * 学校名称
	 */
	@TableField("school_name")
	private String schoolName;

	/**
	 * 逻辑删除字段
	 */
	@TableLogic
	@TableField("delete_status")
	private Boolean deleteStatus;

	/**
	 *
	 */
	@TableField("create_time")
	private LocalDateTime createTime;

	@TableField("role_id")
	 private Integer roleId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
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

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	private static final long serialVersionUID = 1L;
}

