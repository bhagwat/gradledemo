package demo.gradle;

import demo.gradle.domain.Person;

public class SampleJava {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        Person person = new Person();
        person.setName("Gradle Lover");
        person.setExperience(4);
        System.out.println(person);
    }
}
