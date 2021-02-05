//package com.it.wu.demo01.controller;
//
//import com.it.wu.demo01.dao.UserRepository;
//import com.it.wu.demo01.model.User;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.text.DateFormat;
//import java.util.Date;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//public class UserRepositoryTests {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void test() throws Exception {
//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
//        String formattedDate = dateFormat.format(date);
//
//        userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
//        userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
//        userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));
//
//        Assert.assertEquals(3, userRepository.findAll().size());
//        System.out.println(userRepository.findByUserNameOrEmail("bb", "bb@126.com"));
//        Assert.assertEquals("bb2", userRepository.findByUserNameOrEmail("bb", "bb@126.com").getNickName());
//        userRepository.delete(userRepository.findByUserName("aa"));
//    }
//
//}