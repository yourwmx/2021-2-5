package com.it.wu.demo01.model;

import com.it.wu.demo01.enums.UserSexEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {

//    @Id
    private Long id;

    private String userName;

    private String passWord;

    private UserSexEnum userSex;

    private String nickName;

    public UserEntity(){

    }

    public UserEntity(String userName, String passWord, UserSexEnum userSex) {
        super();
        this.userName = userName;
        this.passWord = passWord;
        this.userSex = userSex;
    }
}
