package com.tang.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author xiaokaixin
 * @Date 2021/7/9 14:53
 * @Version 1.0
 */
@Data
@ExcelTarget("users")
public class User implements Serializable {

    @Excel(name = "编号")
    private String id;
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "生日",format = "yyyy年MM月dd日",width = 15.0)
    private Date bir;
    @Excel(name = "爱好", width = 15.0)
    private String habbys;
    @Excel(name = "头像信息",type = 2,width = 20.0,savePath = "/Users/xiaokaixin/IdeaProjects/easypoi/easypoi_springboot/src/main/resources/static/imges")
    public String photo;
    @Excel(name = "身份证号",width = 20.0)
    private String no;
    @Excel(name = "家庭住址",width = 15.0)
    private String address;
}
