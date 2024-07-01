package com.spring.jpastudy.chap06_querydsl.dto;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupAverageAgeDto {

    private String groupName;
    private Double averageAge;

}
