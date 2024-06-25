package com.spring.jpastudy.chap01.repository;

import com.spring.jpastudy.chap01.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository 를 상속한 후 첫번째 제너릭엔 엔터티클래스, 두번째 제너릭엔 PK 의 타입
public interface ProductRepository extends JpaRepository<Product, Long> {

}
