package com.rohinisha.java8.repeatannotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MultiAccess.class)
public @interface Access {
    Role value() default Role.GUEST;
    String env();
}