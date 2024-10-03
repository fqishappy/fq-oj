package com.fqishappy.aliveoj.judge.strategy;

import com.fqishappy.aliveoj.model.dto.question.JudgeCase;
import com.fqishappy.aliveoj.model.dto.questionsubmit.JudgeInfo;
import com.fqishappy.aliveoj.model.entity.Question;
import com.fqishappy.aliveoj.model.entity.QuestionSubmit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author fqishappy
 * @date 2024/10/3 18:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JudgeContext {
    private JudgeInfo judgeInfo;
    private List<String> inputList;
    private List<String> outputList;
    private List<JudgeCase> judgeCaseList;
    private Question question;
    private QuestionSubmit questionSubmit;
}
