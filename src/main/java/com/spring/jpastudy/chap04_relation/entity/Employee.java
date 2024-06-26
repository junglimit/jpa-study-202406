package com.spring.jpastudy.chap04_relation.entity;

import lombok.*;

import javax.persistence.*;

@Setter @Getter
@ToString(exclude = "department") // 연관관계 필드 빼기 . 따로 빼지 않으면 ManyToOne 걸린 필드에서 자동으로 같이 조회함
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id; // 사원번호

    @Column(name = "emp_name", nullable = false)
    private String name;


    // 단방향 매핑 - 데이터베이스처럼 한쪽에 상대방의 PK를 FK로 갖는 형태
    // EAGER Loading: 연관된 데이터를 항상 JOIN 을 통해 같이 가져옴
    // LAZY Loading: 해당 엔터티 데티어만 가져오고 필요한 경우 연관 엔터티를 가져옴
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id") // FK 컬럼명
    private Department department;

//    @ManyToOne
//    @JoinColumn(name = "receive_dept_id")
//    private Department department2;



}

