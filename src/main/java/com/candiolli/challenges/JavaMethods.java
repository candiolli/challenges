package com.candiolli.challenges;

import lombok.Getter;
import lombok.Setter;

public class JavaMethods {

    @Getter
    @Setter
    static class User {
        private Long id;
        String name;

        void saidHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    @Getter
    @Setter
    class Customer extends User {
        @Override
        public void setName(String name) {
            super.setName(name);
        }
    }

}
