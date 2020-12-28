package cn.xsaf1207.sys.service.impl;

import cn.xsaf1207.sys.domain.EsClass;
import cn.xsaf1207.sys.mapper.EsClassMapper;
import cn.xsaf1207.sys.service.EsClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EsClassServiceImpl implements EsClassService {
    @Autowired
    private EsClassMapper esClassMapper;
    @Override
    public List<EsClass> queryAllClass() {
        return esClassMapper.selectAllClass();
    }
}
