//package com.it.wu.demo01.config.schedulerTask;
//
//import com.it.wu.demo01.controller.UserController;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SchedulerTask {
//
//    private int count=0;
//
//    @Autowired
//    private UserController userController;
//
//    @Scheduled(cron="*/6 * * * * ?")
//    private void process(){
//        System.out.println("this is scheduler task runing  "+(count++));
//        System.out.println(userController.getUsers());
//    }
//
//}
