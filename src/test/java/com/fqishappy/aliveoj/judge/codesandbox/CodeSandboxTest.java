package com.fqishappy.aliveoj.judge.codesandbox;

import com.fqishappy.aliveoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.fqishappy.aliveoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.fqishappy.aliveoj.model.enums.QuestionSubmitLanguageEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author fqishappy
 * @date 2024/10/2 17:20
 */
@SpringBootTest
class CodeSandboxTest {

    @Value("${codesandbox.type:example}")
    private String type;

    @Test
    void executeCode() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String type = scanner.next();
            CodeSandbox codeSandbox = new ExampleCodeSandbox();
            String code = "int main（ { }";
            String language = QuestionSubmitLanguageEnum.JAVA.getValue();
            List<String> inputList = Arrays.asList("1 2", "3 4");
            ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                    .code(code)
                    .language(language)
                    .inputList(inputList)
                    .build();
            ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        }
    }

        @Test
        void executeCodeByValue() {
            CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
            String code="int main() {}";
            String language = QuestionSubmitLanguageEnum.JAVA.getValue();
            List<String>inputList=Arrays.asList("1 2","3 4");
            ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                    .code(code)
                    .language(language)
                    .inputList(inputList)
                    .build();
            ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
            Assertions.assertNotNull(executeCodeResponse);
        }

        @Test
        void executeCodeByProxy() {
            CodeSandbox codeSandbox = new CodeSandboxProxy(CodeSandboxFactory.newInstance(type));
            String code="int main() {}";
            String language = QuestionSubmitLanguageEnum.JAVA.getValue();
            List<String>inputList=Arrays.asList("1 2","3 4");
            ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                    .code(code)
                    .language(language)
                    .inputList(inputList)
                    .build();
            ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
            Assertions.assertNotNull(executeCodeResponse);
        }

}
