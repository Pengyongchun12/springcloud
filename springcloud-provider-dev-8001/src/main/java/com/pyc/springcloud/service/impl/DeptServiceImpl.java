package com.pyc.springcloud.service.impl;

import com.pyc.springcloud.mapper.DeptMapper;
import com.pyc.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements com.pyc.springcloud.service.DeptService {

    @Autowired
    DeptMapper deptMapper;
    @Override
    public Boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept queryDeptById(Long id) {
        return deptMapper.queryDeptById(id);
    }

    @Override
    public List<Dept> queryDeptList() {
        return deptMapper.queryDeptList();
    }
}
