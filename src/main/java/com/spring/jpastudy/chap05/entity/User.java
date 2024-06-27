package com.spring.jpastudy.chap05.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_mtm_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name")
    private String name;

    // mappedBy 엔 꼭 필드명을 넣기
    @OneToMany(mappedBy = "user",orphanRemoval = true, cascade = CascadeType.ALL)
    @Builder.Default
    private List<Purchase> purchaseList = new ArrayList<>();

}
