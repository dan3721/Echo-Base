package com.bush.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static java.lang.System.out;

public class LombokPOJOs {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder(toBuilder = true)
    public static final class Foo {
        private String bar;
    }

    public static void main(String[] args) {
        Foo foo = Foo.builder().bar("hello world!").build();
        out.println(foo);
    }
}
