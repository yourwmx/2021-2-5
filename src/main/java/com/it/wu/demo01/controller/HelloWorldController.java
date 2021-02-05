//package com.it.wu.demo01.controller;
//
//import com.it.wu.demo01.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpSession;
//import java.util.Map;
//import java.util.UUID;
//
//@RestController
//public class HelloWorldController {
//
//    @Value("${com.it.wu.title}")
//    private String title;
//
////    @Resource
////    FilterRegistrationBean filterRegistrationBean;
//
////    @RequestMapping("/getFilterConfig")
////    public Map getInitMap(){
////        Map initParameters = filterRegistrationBean.getInitParameters();
////        System.out.println(filterRegistrationBean.getOrder());
////        System.out.println(filterRegistrationBean.getServletNames());
////        System.out.println(filterRegistrationBean.getUrlPatterns());
////        return initParameters;
////    }
//
//    @RequestMapping("/hello")
//    @Cacheable(value="hello-key")
//    public String index() {
//        System.out.println("666");
//        return "Hello World";
//    }
//
//    @RequestMapping("/getUser")
//    @Cacheable(value="user-key")
//    public User getUser() {
//        User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
//        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
//        return user;
//    }
//
//    @RequestMapping("/uid")
//    String uid(HttpSession session) {
//        UUID uid = (UUID) session.getAttribute("uid");
//        if (uid == null) {
//            uid = UUID.randomUUID();
//        }
//        session.setAttribute("uid", uid);
//        return session.getId();
//    }
//}