package com.adeliacm.course.repositories;

import com.adeliacm.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
