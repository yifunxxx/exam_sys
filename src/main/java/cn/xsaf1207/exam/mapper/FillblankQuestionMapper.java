package cn.xsaf1207.exam.mapper;

import cn.xsaf1207.exam.domain.FillblankQuestion;

public interface FillblankQuestionMapper {
    int deleteByPrimaryKey(Integer fbqId);

    int insert(FillblankQuestion record);

    int insertSelective(FillblankQuestion record);

    FillblankQuestion selectByPrimaryKey(Integer fbqId);

    int updateByPrimaryKeySelective(FillblankQuestion record);

    int updateByPrimaryKey(FillblankQuestion record);
}