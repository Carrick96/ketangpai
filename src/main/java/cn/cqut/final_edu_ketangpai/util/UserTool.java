package cn.cqut.final_edu_ketangpai.util;


import cn.cqut.final_edu_ketangpai.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @CLASSNAME:UserTool
 * @description:
 * @author: Nonameguy
 * @create: 2020-05-10 01:16
 */
public class UserTool {


	//获取当前用户的用户信息
	public static User getCurrentUser(HttpServletRequest request){
		return (User) request.getSession().getAttribute("SESSION_USER_INFO");
	}

	public static void userLogout(HttpServletRequest request) {
		request.getSession().setAttribute("SESSION_USER_INFO", null);
	}
}
