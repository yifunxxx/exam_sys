package cn.xsaf1207.exam.mapper;

import cn.xsaf1207.exam.domain.SelectQuestion;

public interface SelectQuestionMapper {
    int deleteByPrimaryKey(Integer sqId);

    int insert(SelectQuestion record);

    int insertSelective(SelectQuestion record);

    SelectQuestion selectByPrimaryKey(Integer sqId);

    int updateByPrimaryKeySelective(SelectQuestion record);

    int updateByPrimaryKey(SelectQuestion record);
}