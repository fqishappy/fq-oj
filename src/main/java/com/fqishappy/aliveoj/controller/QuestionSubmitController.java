package com.fqishappy.aliveoj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fqishappy.aliveoj.annotation.AuthCheck;
import com.fqishappy.aliveoj.common.BaseResponse;
import com.fqishappy.aliveoj.common.ErrorCode;
import com.fqishappy.aliveoj.common.ResultUtils;
import com.fqishappy.aliveoj.constant.UserConstant;
import com.fqishappy.aliveoj.exception.BusinessException;
import com.fqishappy.aliveoj.model.dto.question.QuestionQueryRequest;
import com.fqishappy.aliveoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.fqishappy.aliveoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.fqishappy.aliveoj.model.entity.Question;
import com.fqishappy.aliveoj.model.entity.QuestionSubmit;
import com.fqishappy.aliveoj.model.entity.User;
import com.fqishappy.aliveoj.model.vo.QuestionSubmitVO;
import com.fqishappy.aliveoj.service.QuestionSubmitService;
import com.fqishappy.aliveoj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 问题提交接口
 *
 * @author fqishappy
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@RestController
@RequestMapping("/question_submit")
@Slf4j
public class QuestionSubmitController {

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Resource
    private UserService userService;

    /**
     * 点赞 / 取消点赞
     *
     * @param questionSubmitAddRequest
     * @param request
     * @return 提交记录ID
     */
    @PostMapping("/")
    public BaseResponse<Long> doQuestionSubmit(@RequestBody QuestionSubmitAddRequest questionSubmitAddRequest, HttpServletRequest request) {
        if (questionSubmitAddRequest == null || questionSubmitAddRequest.getQuestionId() <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 登录才能点赞
        final User loginUser = userService.getLoginUser(request);
        long questionSubmitId = questionSubmitService.doQuestionSubmit(questionSubmitAddRequest, loginUser);
        return ResultUtils.success(questionSubmitId);
    }

    /**
     * 分页获取题目提交列表（除了管理员外，普通用户只能看到非答案、提交代码等公开信息）
     *
     * @param questionSubmitQueryRequest
     * @param request
     * @return
     */
    @PostMapping("/list/page")
    public BaseResponse<Page<QuestionSubmitVO>> listQuestionSubmitByPage(@RequestBody QuestionSubmitQueryRequest questionSubmitQueryRequest, HttpServletRequest request) {
        long current = questionSubmitQueryRequest.getCurrent();
        long size = questionSubmitQueryRequest.getPageSize();
        //从数据库中查询原始的题目提交分页信息
        Page<QuestionSubmit> questionSubmitPage = questionSubmitService.page(new Page<>(current, size),
                questionSubmitService.getQueryWrapper(questionSubmitQueryRequest));
        final User loginUser = userService.getLoginUser(request);
        //返回脱敏信息
        return ResultUtils.success(questionSubmitService.getQuestionSubmitVOPage(questionSubmitPage, loginUser));
    }
}
