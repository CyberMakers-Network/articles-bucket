package com.cybermakers.articlesbucket.entities;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Validated
@Data
@Builder
@ToString
public class Articles {

    @NotNull
    private String title;

    @NotNull
    private String subTitle;

    @NotNull
    @Min(15)
    private String description;

    @NotNull
    @NotEmpty
    private String url;

}
