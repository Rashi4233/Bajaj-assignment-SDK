package com.bajaj.trading.repository;

import com.bajaj.trading.model.Instrument;

import java.util.ArrayList;
import java.util.List;

public class InstrumentRepository {

    private static final List<Instrument> instruments = new ArrayList<>();

    static {
        instruments.add(new Instrument("TCS", "NSE", "EQUITY", 3500.00));
        instruments.add(new Instrument("INFY", "NSE", "EQUITY", 1500.00));
        instruments.add(new Instrument("RELIANCE", "NSE", "EQUITY", 2800.00));
    }

    public static List<Instrument> getAllInstruments() {
        return instruments;
    }
}
