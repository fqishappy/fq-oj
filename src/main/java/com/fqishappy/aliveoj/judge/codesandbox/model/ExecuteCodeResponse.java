package com.fqishappy.aliveoj.judge.codesandbox.model;

import com.fqishappy.aliveoj.model.dto.questionsubmit.JudgeInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author fqishappy
 * @date 2024/10/2 16:17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExecuteCodeResponse {
    private List<String> outputList;
    //接口信息
    private String message;
    private String status;
    private JudgeInfo judgeInfo;
}
