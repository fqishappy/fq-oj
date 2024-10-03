package com.fqishappy.aliveoj.judge.codesandbox.impl;

import com.fqishappy.aliveoj.judge.codesandbox.CodeSandbox;
import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @author fqishappy
 * @date 2024/10/2 16:38
 */
public class RemoteCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程沙箱");
        return null;
    }
}
