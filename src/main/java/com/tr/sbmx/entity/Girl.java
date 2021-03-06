package com.tr.sbmx.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author taorun
 * @create 2017-08-03 下午4:37
 *
 */

@Entity // 设置与数据库对应，可自动建表
public class Girl {

    @Id                 // 设为Id
    @GeneratedValue     // 设为自增
    private Integer id;

    private String name;

    @Min(value = 18, message = "未成年")
    private Integer age;

//    @NotNull(message = "金额不能为空")
    private Double money;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

}
