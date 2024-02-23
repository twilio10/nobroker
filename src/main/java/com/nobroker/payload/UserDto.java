package com.nobroker.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long Id;

    private String name;

    private String email;

    private Long mobile;

    private  String password;
}
