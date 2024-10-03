package com.fqishappy.aliveoj.model.dto.questionsubmit;

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
public class JudgeInfo {
    //程序执行信息
    private String message;
    //执行时间
    private Long time;
    //消耗内存
    private Long memory;

}
