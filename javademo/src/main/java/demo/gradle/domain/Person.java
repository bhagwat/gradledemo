package demo.gradle.domain;

public class Person {
    String name;
    Integer experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Hey "
                + name
                + ". Congratulations on completing "
                + experience
                + " years as developer.";
    }
}
