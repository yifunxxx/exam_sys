package cn.xsaf1207.exam.mapper;

import cn.xsaf1207.exam.domain.JudgeQuestion;

public interface JudgeQuestionMapper {
    int deleteByPrimaryKey(Integer jqId);

    int insert(JudgeQuestion record);

    int insertSelective(JudgeQuestion record);

    JudgeQuestion selectByPrimaryKey(Integer jqId);

    int updateByPrimaryKeySelective(JudgeQuestion record);

    int updateByPrimaryKey(JudgeQuestion record);
}