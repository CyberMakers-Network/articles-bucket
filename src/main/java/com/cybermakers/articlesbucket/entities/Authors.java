package com.cybermakers.articlesbucket.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
@Data
@Generated
@AllArgsConstructor
@NoArgsConstructor
@Document("Authors")
@ToString
@Builder
public class Authors {

    @NotNull
    private String name;

    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    private String gitName;

    @NotNull
    @NotEmpty
    private String url;

    @NotNull
    private List<Articles> articlesList;

}
