package cn.xsaf1207.exam.mapper;

import cn.xsaf1207.exam.domain.TestPaper;

public interface TestPaperMapper {
    int deleteByPrimaryKey(Integer tpId);

    int insert(TestPaper record);

    int insertSelective(TestPaper record);

    TestPaper selectByPrimaryKey(Integer tpId);

    int updateByPrimaryKeySelective(TestPaper record);

    int updateByPrimaryKey(TestPaper record);
}