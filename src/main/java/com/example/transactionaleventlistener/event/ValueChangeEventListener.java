package com.example.transactionaleventlistener.event;

import com.example.transactionaleventlistener.service.BeforeValueChangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@RequiredArgsConstructor
public class ValueChangeEventListener {
    private final BeforeValueChangeService beforeValueChangeService;

    @TransactionalEventListener
    public void onExampleEvent(ValueChangeEvent valueChangeEvent) {
        beforeValueChangeService.changeBeforeValue(valueChangeEvent.beforeValue());
    }
}
