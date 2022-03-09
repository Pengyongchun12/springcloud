package com.pyc.springcloud.service;

import com.pyc.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {
    Boolean addDept(Dept dept);
    Dept queryDeptById(Long id);
    List<Dept> queryDeptList();
}
