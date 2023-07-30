package com.jwt.example.Model;


import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String userId;
    private String name;
    private String emailId;
}
