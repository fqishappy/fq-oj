package com.fqishappy.aliveoj.model.dto.questionsubmit;

import com.fqishappy.aliveoj.common.PageRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @author fqishappy
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class QuestionSubmitQueryRequest extends PageRequest implements Serializable {

    // 编程语言
    private String language;
    // 用户代码
    private Integer status;
    // 题目 id
    private Long questionId;
    // 用户 id
    private Long userId;


    private static final long serialVersionUID = 1L;
}