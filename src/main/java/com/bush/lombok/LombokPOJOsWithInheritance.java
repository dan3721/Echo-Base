package com.bush.lombok;

import lombok.*;

import static java.lang.System.out;

    public class LombokPOJOsWithInheritance {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static abstract class Foo {

        protected String a; // make me protected!

        @Data
        @EqualsAndHashCode(callSuper = false)
        public static final class Bar extends Foo {

            private String b;

            @Builder(toBuilder = true) // implement the all args constructor and place the @Builder annotation on it
            private Bar(String a, String b) { // make me private!
                super(a);
                this.b = b;
            }

        }
    }

    public static void main(String[] args) {
        Foo.Bar bar = Foo.Bar.builder()
                .a("hello")
                .b("world!")
                .build();
        out.println(bar.getA() + " " + bar.getB());
    }
}
