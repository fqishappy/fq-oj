package com.fqishappy.aliveoj.model.dto.question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fqishappy
 * 题目配置
 * @date 2024/9/29 17:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JudgeConfig {

    private Long timeLimit;
    private Long memoryLimit;
    private Long stackLimit;
}
