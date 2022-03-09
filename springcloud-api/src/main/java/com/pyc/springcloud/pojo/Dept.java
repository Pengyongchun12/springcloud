package com.pyc.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Integer deptno;

    private String dname;

    private String data_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
