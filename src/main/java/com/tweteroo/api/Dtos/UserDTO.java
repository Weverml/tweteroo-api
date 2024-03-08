package com.tweteroo.api.Dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {
   
    @NotBlank
    private String avatar;

    @NotBlank
    @Size(max = 100)
    private String userName;

}
