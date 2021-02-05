package com.it.wu.demo01.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WuProperties {

    @Value("${com.it.wu.title}")
    private String title;

    @Value("${com.it.wu.description}")
    private String description;
}
