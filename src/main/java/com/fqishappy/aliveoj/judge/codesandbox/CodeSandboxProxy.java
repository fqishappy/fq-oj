package com.fqishappy.aliveoj.judge.codesandbox;

import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author fqishappy
 * @date 2024/10/3 17:17
 */
@Slf4j
@AllArgsConstructor
public class CodeSandboxProxy implements CodeSandbox {

    private final CodeSandbox codeSandbox;

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("代码沙箱请求信息：" + executeCodeRequest.toString());
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        log.info("代码沙箱请求信息：" + executeCodeResponse.toString());
        return executeCodeResponse;
    }
}
