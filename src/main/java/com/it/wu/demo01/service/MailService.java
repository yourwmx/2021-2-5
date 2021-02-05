package com.it.wu.demo01.service;

import java.util.List;

public interface MailService {
    void sendSimpleMail(String to, String subject, String content);

    void sendHtmlMail(String to, String subject, String content);

    void sendAttachmentsMail(String to, String subject, String content, List<String> filePaths);

    void sendInlineResourceMail(String to, String subject, String content, List<String> rscPaths, List<String> rscIds);
}
