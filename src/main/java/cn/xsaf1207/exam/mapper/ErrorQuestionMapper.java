package cn.xsaf1207.exam.mapper;

import cn.xsaf1207.exam.domain.ErrorQuestion;

public interface ErrorQuestionMapper {
    int deleteByPrimaryKey(Integer eqId);

    int insert(ErrorQuestion record);

    int insertSelective(ErrorQuestion record);

    ErrorQuestion selectByPrimaryKey(Integer eqId);

    int updateByPrimaryKeySelective(ErrorQuestion record);

    int updateByPrimaryKey(ErrorQuestion record);

    int deleteByUid(String uId);
}