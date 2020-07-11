package cn.cqut.final_edu_ketangpai.controller.course.student;

import cn.cqut.final_edu_ketangpai.dto.CourseExecution;
import cn.cqut.final_edu_ketangpai.entity.CourseOfStudent;
import cn.cqut.final_edu_ketangpai.entity.User;
import cn.cqut.final_edu_ketangpai.enums.CourseStateEnum;
import cn.cqut.final_edu_ketangpai.enums.StatusEnum;
import cn.cqut.final_edu_ketangpai.service.CourseOfStudentService;
import cn.cqut.final_edu_ketangpai.service.CourseService;
import cn.cqut.final_edu_ketangpai.service.UserService;
import cn.cqut.final_edu_ketangpai.util.HttpServletRequestUtil;
import cn.cqut.final_edu_ketangpai.util.UserTool;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @CLASSNAME:StudentCourseOperationController
 * @description:
 * @author: Nonameguy
 * @create: 2020-05-15 02:20
 */
@RestController
@RequestMapping("/studentcourse")
public class StudentCourseOperationController {
	@Autowired
	private CourseService courseService;
	@Autowired
	private CourseOfStudentService courseOfStudentService;
	@Autowired
	private UserService userService;

	@GetMapping("getcos")
	private Map<String, Object> getCos(HttpServletRequest request) {
		Map<String, Object> modelMap = new HashMap<>();
		User currentUser= UserTool.getCurrentUser(request);
		List<CourseOfStudent> courseOfStudentList = courseOfStudentService.list(new QueryWrapper<CourseOfStudent>()
				.eq("student_id", currentUser.getUserId()));
		System.out.println("cos是" + courseOfStudentList);
		modelMap.put("cosList", courseOfStudentList);
		modelMap.put("success", true);
		return modelMap;
	}
	@GetMapping("unarchivecourse")
	private Map<String, Object> unArchiveCourse(HttpServletRequest request) {
		Map<String, Object> modelMap = new HashMap<>();
		String courseId = HttpServletRequestUtil.getString(request, "courseId");
		User currentUser = UserTool.getCurrentUser(request);
		try {
			assert courseId != null;
			assert currentUser.getUserId() != null;
			CourseOfStudent courseOfStudent = courseOfStudentService.getOne(new QueryWrapper<CourseOfStudent>()
					.lambda()
					.eq(CourseOfStudent::getCourseId, courseId)
					.eq(CourseOfStudent::getStudentId, currentUser.getUserId()));
			courseOfStudent.setArchiveStatus(false);
			boolean update = courseOfStudentService.update(courseOfStudent, new QueryWrapper<CourseOfStudent>()
					.lambda()
					.eq(CourseOfStudent::getCourseId, courseId)
					.eq(CourseOfStudent::getStudentId, currentUser.getUserId()));
			if (!update) {
				modelMap.put("success", false);
				modelMap.put("errMsg", CourseStateEnum.NULL_COURSEID.getStateInfo());
			}
			List<Integer> idList = new ArrayList<>();
			idList.add(currentUser.getId());
			courseOfStudentService.listByIds(idList);
			System.out.println(idList);
			modelMap.put("success", true);
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.getMessage());
		}
		return modelMap;
	}

	@GetMapping("archivecourse")
	private Map<String, Object> archiveCourse(HttpServletRequest request) {
		Map<String, Object> modelMap = new HashMap<>();
		String courseId = HttpServletRequestUtil.getString(request, "courseId");
		User currentUser = UserTool.getCurrentUser(request);
		try {
			assert courseId != null;
			assert currentUser.getUserId() != null;
			CourseOfStudent courseOfStudent = courseOfStudentService.getOne(new QueryWrapper<CourseOfStudent>()
					.lambda()
					.eq(CourseOfStudent::getCourseId, courseId)
					.eq(CourseOfStudent::getStudentId, currentUser.getUserId()));
			courseOfStudent.setArchiveStatus(true);
			boolean update = courseOfStudentService.update(courseOfStudent, new QueryWrapper<CourseOfStudent>()
					.lambda()
					.eq(CourseOfStudent::getCourseId, courseId)
					.eq(CourseOfStudent::getStudentId, currentUser.getUserId()));
			if (!update) {
				modelMap.put("success", false);
				modelMap.put("errMsg", CourseStateEnum.NULL_COURSEID.getStateInfo());
			}
			List<CourseOfStudent> courseOfStudentList = courseOfStudentService.list(new QueryWrapper<CourseOfStudent>()
					.eq("student_id", currentUser.getUserId()));
			System.out.println("cos是" + courseOfStudentList);
			modelMap.put("success", true);
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.getMessage());
		}
		return modelMap;
	}

	@GetMapping("untopcourse")
	private Map<String, Object> unTopCourse(HttpServletRequest request) {
		Map<String, Object> modelMap = new HashMap<>();
		String courseId = HttpServletRequestUtil.getString(request, "courseId");
		User currentUser = UserTool.getCurrentUser(request);
		try {
			assert courseId != null;
			assert currentUser.getUserId() != null;
			CourseOfStudent courseOfStudent = courseOfStudentService.getOne(new QueryWrapper<CourseOfStudent>()
					.lambda()
					.eq(CourseOfStudent::getCourseId, courseId)
					.eq(CourseOfStudent::getStudentId, currentUser.getUserId()));
			courseOfStudent.setTopStatus(false);
			boolean update = courseOfStudentService.update(courseOfStudent, new QueryWrapper<CourseOfStudent>()
					.lambda()
					.eq(CourseOfStudent::getCourseId, courseId)
					.eq(CourseOfStudent::getStudentId, currentUser.getUserId()));
			if (!update) {
				modelMap.put("success", false);
				modelMap.put("errMsg", CourseStateEnum.NULL_COURSEID.getStateInfo());
			}
			modelMap.put("success", true);
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.getMessage());
		}
		return modelMap;
	}

	@GetMapping("topcourse")
	private Map<String, Object> topCourse(HttpServletRequest request) {
		Map<String, Object> modelMap = new HashMap<>();
		String courseId = HttpServletRequestUtil.getString(request, "courseId");
		User currentUser = UserTool.getCurrentUser(request);
		try {
			assert courseId != null;
			assert currentUser.getUserId() != null;
			CourseOfStudent courseOfStudent = courseOfStudentService.getOne(new QueryWrapper<CourseOfStudent>()
					.lambda()
					.eq(CourseOfStudent::getCourseId, courseId)
					.eq(CourseOfStudent::getStudentId, currentUser.getUserId()));
			courseOfStudent.setTopStatus(true);
			boolean update = courseOfStudentService.update(courseOfStudent, new QueryWrapper<CourseOfStudent>()
					.lambda()
					.eq(CourseOfStudent::getCourseId, courseId)
					.eq(CourseOfStudent::getStudentId, currentUser.getUserId()));
			if (!update) {
				modelMap.put("success", false);
				modelMap.put("errMsg", CourseStateEnum.NULL_COURSEID.getStateInfo());
			}
			modelMap.put("success", true);
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.getMessage());
		}
		return modelMap;
	}

	@PostMapping("joincourse")
	private Map<String, Object> joinCourse(HttpServletRequest request) {
		Map<String, Object> modelMap = new HashMap<>();
		String courseId = HttpServletRequestUtil.getString(request, "extrCode");
		User currentUser = UserTool.getCurrentUser(request);
		if (currentUser == null) {
			modelMap.put("success", false);
			modelMap.put("errMsg", StatusEnum.ERROR_20011.getStateInfo());
			return modelMap;
		}
		try {
			CourseExecution courseExecution = courseOfStudentService.studentJoinCourse(courseId, currentUser.getUserId());
			if (courseExecution.getState() != CourseStateEnum.SUCCESS.getState()) {
				modelMap.put("success", false);
				modelMap.put("errMsg", CourseStateEnum.NULL_COURSEID.getStateInfo());
				return modelMap;
			}
			modelMap.put("success", true);
			return modelMap;
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", StatusEnum.SERVICE_ERROR.getStateInfo());
			return modelMap;
		}
	}

	@GetMapping("getcourselist")
	private Map<String, Object> getCourseList(HttpServletRequest request) {
		Map<String, Object> modelMap = new HashMap<>();
		try {
			User currentUser = UserTool.getCurrentUser(request);
			if (currentUser == null) {
				modelMap.put("errMsg", StatusEnum.ERROR_20011.getStateInfo());
				return modelMap;
			}
			CourseExecution courseExecution = courseService.getStudentCourseList(currentUser.getUserId(),request);
			request.getSession().setAttribute("courseList",courseExecution.getCourseList());
			modelMap.put("courseList", courseExecution.getCourseList());
			modelMap.put("success", true);
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", StatusEnum.SERVICE_ERROR.getStateInfo());
		}
		return modelMap;
	}
}
