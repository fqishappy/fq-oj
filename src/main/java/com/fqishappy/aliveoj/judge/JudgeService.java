package com.fqishappy.aliveoj.judge;

import com.fqishappy.aliveoj.model.entity.QuestionSubmit;


/**
 * 判题服务
 * @author fqishappy
 * @date 2024/10/3 17:50
 */
public interface JudgeService {

    QuestionSubmit doJudge(long questionSubmitId);
}
