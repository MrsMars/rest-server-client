package com.aoher.model;

import com.aoher.converter.DateConverter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;

public class Adapter1 extends XmlAdapter<String, LocalDate> {
    @Override
    public LocalDate unmarshal(String value) throws Exception {
        return (DateConverter.parse(value));
    }

    @Override
    public String marshal(LocalDate value) throws Exception {
        return (DateConverter.print(value));
    }
}
