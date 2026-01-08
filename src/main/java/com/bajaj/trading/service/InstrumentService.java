package com.bajaj.trading.service;

import com.bajaj.trading.repository.InstrumentRepository;
import org.springframework.stereotype.Service;

@Service
public class InstrumentService {

    public Object fetchAllInstruments() {
        return InstrumentRepository.getAllInstruments();
    }
}
