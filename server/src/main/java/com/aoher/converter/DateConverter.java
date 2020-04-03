package com.aoher.converter;

import com.aoher.exception.ConverterException;
import org.springframework.util.StringUtils;

import java.time.LocalDate;

import static java.lang.String.format;

public class DateConverter {

    public static LocalDate parse(String rawValue) {
        if (StringUtils.isEmpty(rawValue)) {
            return null;
        }
        try {
            return java.time.LocalDate.parse(rawValue);
        } catch (IllegalArgumentException ex) {
            throw new ConverterException(format("Unable to parse date: %s", rawValue), ex);
        }
    }

    public static String print(LocalDate date) {
        return date == null ? null : date.toString();
    }

    private DateConverter() {
    }
}
