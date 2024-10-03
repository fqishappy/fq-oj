package com.fqishappy.aliveoj.judge.codesandbox;

import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 *
 * @author fqishappy
 * @date 2024/10/2 16:16
 */
public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
