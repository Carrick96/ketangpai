package cn.cqut.final_edu_ketangpai.service;

import cn.cqut.final_edu_ketangpai.dto.CourseExecution;
import cn.cqut.final_edu_ketangpai.dto.CourseOfStudentExecution;
import cn.cqut.final_edu_ketangpai.entity.CourseOfStudent;
import cn.cqut.final_edu_ketangpai.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @CLASSNAME:CourseOfStudentService
 * @description:
 * @author: Nonameguy
 * @create: 2020-05-09 16:15
 */
public interface CourseOfStudentService extends IService<CourseOfStudent> {
	//学生根据加课码加入课程
	CourseExecution studentJoinCourse(String studentId,String courseId);

	CourseExecution selectCountOfStudent(String courseId, HttpServletRequest request);

	CourseOfStudentExecution getStudentNum(String courseId);

	List<User> getStudentName(String courseId);
}
