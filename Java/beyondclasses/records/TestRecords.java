package beyondclasses.records;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

record Student(String school, String major, String name, int age) {
    public Student(String school, String major, String name, int age) {
        if(age <= 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
        school = school.toUpperCase();
        this.school = school;
        this.major = major + name;
        this.name = name;
    }
}

public class TestRecords {
}
