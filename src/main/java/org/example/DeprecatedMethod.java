package com.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedMethod {
    String message() default "Цей метод застарілий і не рекомендується до використання";
}