package com.fqishappy.aliveoj.model.entity;

import java.util.Date;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 题目提交(QuestionSubmit)表实体类
 *
 * @author fqishappy
 * @since 2024-09-29 16:45:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("question_submit")
public class QuestionSubmit implements Serializable {
    // id
    @TableId(type = IdType.AUTO)
    private Long id;
    // 编程语言
    private String language;
    // 用户代码
    private String code;
    // 判题信息（json 对象）
    private String judgeInfo;
    // 判题状态（0 - 待判题、1 - 判题中、2 - 成功、3 - 失败）
    private Integer status;
    // 题目 id
    private Long questionId;
    // 创建用户 id
    private Long userId;
    // 创建时间
    private Date createTime;
    // 更新时间
    private Date updateTime;
    // 是否删除
    private Integer isDelete;

    private static final long serialVersionUID = 1L;
}
