package com.tang.entity;

import cn.afterturn.easypoi.excel.annotation.*;
import com.sun.tools.corba.se.idl.constExpr.Or;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author xiaokaixin
 * @Date 2021/7/8 08:43
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ExcelTarget("users")
public class User implements Serializable {

    @Excel(name = "编号",orderNum = "0")
   // @ExcelIgnore
    private String id;
    @Excel(name = "姓名",orderNum = "1")
    private String name;
    @Excel(name = "年龄",orderNum = "3",suffix = "岁",replace = {"20_20岁"})
    private Integer age;
    @Excel(name = "生日",width = 25.0,format = "yyyy-MM-dd HH:mm:ss",orderNum = "2")
    private Date bir;

    @Excel(name = "状态",replace = {"激活_1","锁定_0"},orderNum = "4")
    private String status;

    //@Excel(name = "爱好",width = 25.0,orderNum = "5")
    @ExcelIgnore
    private List<String> habbys;

    @Excel(name = "爱好",width = 25.0,orderNum = "5")
    private String habbyStr;//爱好字符串

    public String getHabbyStr(){
        StringBuilder sb = new StringBuilder();
        habbys.forEach(e->{
            sb.append(e).append("、");
        });
        return sb.toString();

    }

    @ExcelEntity    //标识一对一关系
    private Card card;

    @ExcelCollection(name = "订单信息",orderNum = "8")//标识一对多关系
    List<Order> orders;

    @Excel(name = "头像", width = 20, height = 20, type = 2)//type=2为图片类型
    private String photo;//头像信息


}
