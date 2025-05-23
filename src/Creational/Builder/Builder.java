//package Creational.Builder;
//
//public class Creational.Builder {
//
//    private String name;
//    private int age;
//    private   String email;
//    private String number;
//
//    public Creational.Builder(String name, int age, String email, String number) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.number = number;
//    }
//    public Creational.Builder()
//    {
//
//    }
//
//    public Student build()
//    {
//        ///do validations here
//        return  new Student(this);
//    }
//
//    public Creational.Builder setName(String name) {
//        this.name = name;
//        return  this;
//    }
//
//    public Creational.Builder setAge(int age) {
//        this.age = age;
//        return  this;
//    }
//
//    public Creational.Builder setEmail(String email) {
//        this.email = email;
//        return  this;
//    }
//
//    public Creational.Builder setNumber(String number) {
//        this.number = number;
//        return  this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//}
