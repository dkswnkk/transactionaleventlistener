package com.example.transactionaleventlistener.service;

import com.example.transactionaleventlistener.entity.Example;
import com.example.transactionaleventlistener.event.ValueChangeEvent;
import com.example.transactionaleventlistener.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CurrentValueChangeService {
    private final ExampleRepository exampleRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    public void changeValue(String value) {
        Example example = exampleRepository.find(1L);

        String beforeValue = example.getCurrentValue();

        example.updateCurrentValue(value);

        applicationEventPublisher.publishEvent(new ValueChangeEvent(beforeValue));
    }
}
