package com.jwt.example.models;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {

    private String Id;

    private String name;


    private String email;
}
