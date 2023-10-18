package edu.patrik.semana_5;

public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Lunch lunch) {
        System.out.println("O(a) estudante está comendo!");
    }

    void drinking(Juice juice) {
        System.out.println("O(a) estudante está bebendo!");
    }

    void running() {
        System.out.println("O(a) estudante está correndo!");
    }
}

public class School {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 12;
        student1.color = Color.FAIR;
        student1.sex = Sex.MALE;

        Student student2 = new Student();
        student1.name = "Sophia";
        student1.age = 10;
        student1.color = Color.FAIR;
        student1.sex = Sex.FEMALE;

        Student student3 = new Student();
        student1.name = "Lily";
        student1.age = 11;
        student1.color = Color.DARK;
        student1.sex = Sex.FEMALE;
    }
}
