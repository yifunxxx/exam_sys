package cn.xsaf1207.sys.mapper;

import cn.xsaf1207.sys.domain.Subject;

public interface SubjectMapper {
    int deleteByPrimaryKey(Integer subId);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer subId);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}