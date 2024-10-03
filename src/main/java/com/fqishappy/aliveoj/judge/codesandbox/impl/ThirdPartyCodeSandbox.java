package com.fqishappy.aliveoj.judge.codesandbox.impl;

import com.fqishappy.aliveoj.judge.codesandbox.CodeSandbox;
import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @author fqishappy
 * @date 2024/10/2 16:39
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方沙箱");
        return null;
    }
}
