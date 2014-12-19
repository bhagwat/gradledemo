package demo.domain

import demo.util.StringHandler

class Person {
    String name

    @Override
    public String toString() {
        return StringHandler.capitalize(name)
    }
}
