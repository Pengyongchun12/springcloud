package com.pyc.springcloud;

import com.pyc.springcloud.pojo.Dept;
import com.pyc.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    @PostMapping("dept/insert")
    public Boolean insert(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("dept/query/{id}")
    public Dept query(@PathVariable("id") Long id){
        return deptService.queryDeptById(id);
    }

    @GetMapping("dept/list")
    public List<Dept> list(){
        return deptService.queryDeptList();
    }

}
