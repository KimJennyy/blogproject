package com.blog.blog.dto;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// getter setter contructor 자동으로 만들어줌
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private int idx;
    private String id;
    private String pw;
    private String name;
    private String email;
    private String insert_date;
    // private int kakao;
    // private String mem_role;
}
