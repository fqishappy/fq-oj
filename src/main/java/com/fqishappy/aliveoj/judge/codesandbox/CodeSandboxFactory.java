package com.fqishappy.aliveoj.judge.codesandbox;

import com.fqishappy.aliveoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.fqishappy.aliveoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.fqishappy.aliveoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 创建代码沙箱示例
 * @author fqishappy
 * @date 2024/10/2 17:59
 */
public class CodeSandboxFactory {
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}
