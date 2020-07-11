package cn.cqut.final_edu_ketangpai.controller.homework;

import cn.cqut.final_edu_ketangpai.entity.Homework;
import cn.cqut.final_edu_ketangpai.service.HomeworkService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/homework")
public class HomeworkOperationController {
    @Autowired
    private HomeworkService homeworkService;

    @GetMapping("/gethomeworklist")
    private Map<String, Object> getHomeworkList(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<>();
        List<Homework> homeworkList = homeworkService.list(new QueryWrapper<Homework>()
        .orderByDesc("id"));
        modelMap.put("homeworkList", homeworkList);
        modelMap.put("success", true);
        return modelMap;
    }
}
