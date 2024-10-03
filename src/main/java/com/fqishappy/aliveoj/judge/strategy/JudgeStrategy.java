package com.fqishappy.aliveoj.judge.strategy;

import com.fqishappy.aliveoj.model.dto.questionsubmit.JudgeInfo;

/**
 * 判题策略
 * @author fqishappy
 * @date 2024/10/3 18:45
 */
public interface JudgeStrategy {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
