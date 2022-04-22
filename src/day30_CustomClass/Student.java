package day30_CustomClass;

public class Student {
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;


    // sag click generate- constructor-hepsini sec-sonra void ve setInfo yu ekle kendin
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }


    public String toString() {  //in order to be aBLE TO print every single students
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name +" is coding");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }






}
