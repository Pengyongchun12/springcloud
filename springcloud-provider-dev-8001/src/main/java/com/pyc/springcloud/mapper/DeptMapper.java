package com.pyc.springcloud.mapper;

import com.pyc.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DeptMapper {

    Boolean addDept(Dept dept);
    Dept queryDeptById(@Param("id") Long id);
    List<Dept> queryDeptList();
}
