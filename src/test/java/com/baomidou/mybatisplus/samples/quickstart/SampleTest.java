package com.baomidou.mybatisplus.samples.quickstart;

import com.baomidou.mybatisplus.samples.quickstart.entity.User;
import com.baomidou.mybatisplus.samples.quickstart.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5,userList.size());
        userList.forEach(System.out::println);
    }
    public void add(){
        User user = new User();
        user.setId(14L);
        user.setName("joke");
        user.setAge(25);
        userMapper.insert(user);
    }
}
