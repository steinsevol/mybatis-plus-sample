package com.baomidou.mybatisplus.samples.quickstart.entity;



import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;



@TableName(value = "user")
public class User {
    @TableId(value = "id")
    private Long id;
    @TableField(value = "name")
    private String name;
    private Integer age;
    private String email;

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public void setId(Long id) {
        id = this.id;
    }

    public void setName(String name) {
        name = this.name;
    }

    public void setAge(Integer age) {
        age = this.age;
    }
    public void setEmail(String email){
        email = this.email;
    }
}
