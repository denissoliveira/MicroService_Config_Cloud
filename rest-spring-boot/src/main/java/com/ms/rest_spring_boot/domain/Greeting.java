package com.ms.rest_spring_boot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Getter
@ToString
public class Greeting implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private long id;
    private String content;
}
