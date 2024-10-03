package com.fqishappy.aliveoj.judge.codesandbox.impl;

import com.fqishappy.aliveoj.judge.codesandbox.CodeSandbox;
import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.fqishappy.aliveoj.model.dto.questionsubmit.JudgeInfo;
import com.fqishappy.aliveoj.model.enums.JudgeInfoMessageEnum;
import com.fqishappy.aliveoj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱（仅用于跑通流程）
 * @author fqishappy
 * @date 2024/10/2 16:38
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        List<String> outputList = executeCodeResponse.getOutputList();
       
        executeCodeResponse.setOutputList(outputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());

        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setTime(100L);
        judgeInfo.setMemory(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);

        return executeCodeResponse;
    }
}
