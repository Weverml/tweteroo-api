package com.tweteroo.api.Dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TweetDTO {
    
    @NotBlank
    @Size(max = 280)
    private String text;
    
}
