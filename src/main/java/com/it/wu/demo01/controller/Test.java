package com.it.wu.demo01.controller;

import com.it.wu.demo01.model.UserEntity;
import com.it.wu.demo01.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Test {

    @Autowired
    private HelloSender helloSender;

    @Autowired
    private HelloSender1 helloSender1;

    @Autowired
    private MailService mailService;

    @Autowired
    private SpringTemplateEngine templateEngine;

    @RequestMapping("/manySend")
    public void manySend() {
        UserEntity userEntity = new UserEntity();
        UserEntity userEntity1 = new UserEntity();
        userEntity.setId(1l);
        userEntity.setNickName("66");
        userEntity1.setId(2l);
        userEntity1.setNickName("77");
        for(int i = 0; i < 100; i++){
            helloSender.send(userEntity);
            helloSender1.send(userEntity1);
        }
    }

    //发送simple邮件
    @RequestMapping("/sendSimpleMail")
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("663681577@qq.com","simple","test");
    }

    //发送html邮件
    @RequestMapping("/sendHtmlMail")
    public void testHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封Html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("663681577@qq.com","html",content);
    }

    //发送附件邮件
    @RequestMapping("/sendAttachmentsMail")
    public void sendAttachmentsMail() {
        List<String> filePaths = new ArrayList<>();
        String filePath="E:\\周报\\周报-吴茂星2020.12.4.txt";
        filePaths.add(filePath);
        String filePath1="E:\\周报\\周报-吴茂星2020.12.11.txt";
        filePaths.add(filePath1);
        mailService.sendAttachmentsMail("663681577@qq.com", "主题：带附件的邮件", "有附件，请查收！", filePaths);
    }

    //发送静态资源邮件
    @RequestMapping("/sendInlineResourceMail")
    public void sendInlineResourceMail() {
        String rscId = "1111";
        String rscId1 = "2222";
        List<String> rscIds = new ArrayList<>();
        rscIds.add(rscId);
        rscIds.add(rscId1);
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ><img src=\'cid:" + rscId1 + "\' ></body></html>";
        List<String> imgPaths = new ArrayList<>();
        String imgPath = "C:\\Users\\66368\\Pictures\\Saved Pictures\\3.jpg";
        imgPaths.add(imgPath);
        String imgPath1 = "C:\\Users\\66368\\Pictures\\Saved Pictures\\2.jpg";
        imgPaths.add(imgPath1);
        mailService.sendInlineResourceMail("663681577@qq.com", "主题：这是有图片的邮件", content, imgPaths, rscIds);
    }

    //发送模板邮件
    @RequestMapping("/sendTemplateMail")
    public void sendTemplateMail() {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "006");
        String emailContent = templateEngine.process("emailTemplate", context);
//        System.out.println(emailContent);
        mailService.sendHtmlMail("663681577@qq.com","主题：这是模板邮件",emailContent);
    }
}
