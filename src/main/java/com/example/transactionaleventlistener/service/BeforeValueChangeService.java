package com.example.transactionaleventlistener.service;

import com.example.transactionaleventlistener.entity.Example;
import com.example.transactionaleventlistener.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BeforeValueChangeService {
    private final ExampleRepository exampleRepository;

    @Transactional
    public void changeBeforeValue(String value) {
        Example example = exampleRepository.find(1L);

        example.updateBeforeValue(value);
    }
}
