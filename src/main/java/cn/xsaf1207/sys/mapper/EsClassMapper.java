package cn.xsaf1207.sys.mapper;

import cn.xsaf1207.sys.domain.EsClass;

import java.util.List;

public interface EsClassMapper {
    int deleteByPrimaryKey(Integer csId);

    int insert(EsClass record);

    int insertSelective(EsClass record);

    EsClass selectByPrimaryKey(Integer csId);

    int updateByPrimaryKeySelective(EsClass record);

    int updateByPrimaryKey(EsClass record);

    Integer selectCsnameByCsid(String csName);

    List<EsClass> selectAllClass();
}