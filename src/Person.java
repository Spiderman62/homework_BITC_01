import java.time.LocalDate;

public class Person {
    LocalDate localDate = LocalDate.now();
    private int age = 0;


    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int predictAge(){
        int year = localDate.getYear();
        return year - this.age;
    }

}
