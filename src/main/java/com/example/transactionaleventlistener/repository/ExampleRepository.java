package com.example.transactionaleventlistener.repository;

import com.example.transactionaleventlistener.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, Long> {

    default Example find(Long id) {
        return findById(id).orElseThrow();
    }

}
