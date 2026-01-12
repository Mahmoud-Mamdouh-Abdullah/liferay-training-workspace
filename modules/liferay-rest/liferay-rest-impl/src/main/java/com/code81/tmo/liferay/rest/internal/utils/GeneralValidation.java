package com.code81.tmo.liferay.rest.internal.utils;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class GeneralValidation {

    private static final Log logger = LogFactoryUtil.getLog(GeneralValidation.class);

    private static final DateTimeFormatter STRICT_DATE_FORMATTER =
            DateTimeFormatter.ofPattern("uuuu-MM-dd")
                    .withResolverStyle(ResolverStyle.STRICT);

    public static boolean isValidIsoDate(String date) {
        if (date == null) {
            return false;
        }

        try {
            LocalDate.parse(date, STRICT_DATE_FORMATTER);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean isValidNumber(String number) {
        if (number == null) {
            return false;
        }
        try {
            Integer.parseInt(number);
            return true;
        }  catch (NumberFormatException e) {
            logger.error("Invalid number format");
            return false;
        }
    }
}
