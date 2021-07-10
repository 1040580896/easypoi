package com.tang.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author xiaokaixin
 * @Date 2021/7/8 11:25
 * @Version 1.0
 */
@ExcelTarget("card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card implements Serializable {

    @Excel(name = "身份证号码",width = 20.0,orderNum = "6")
    private String no;
    @Excel(name = "籍贯",width = 40.0,orderNum = "7")
    private String address;
}
