package seminar6;

import java.util.Objects;

public class Sem6Task2 {
    public String name;
    public int age;
    public int weight;

    public String getName() { // узнать
        return name;
    }

    public void setName(String name) { // присвоить
        this.name = name;
    }

    public int getAge() { // узнать
        return age;
    }

    public void setAge(int age) { // присвоить
        this.age = age;
    }

    @Override
    public String toString() { // вывод информации
        return "Собаку зовут " + name + ", ей " + age + " лет";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sem6Task2 sem6Task2 = (Sem6Task2) o;
        return age == sem6Task2.age && Objects.equals(name, sem6Task2.name) && weight == sem6Task2.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
