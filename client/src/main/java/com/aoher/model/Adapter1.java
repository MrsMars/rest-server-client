package com.aoher.model;

import com.aoher.converter.DateConverter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;

public class Adapter1 extends XmlAdapter<String, LocalDate> {

    public LocalDate unmarshal(String value) {
        return (DateConverter.parse(value));
    }

    public String marshal(LocalDate value) {
        return (DateConverter.print(value));
    }
}
