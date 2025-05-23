package Creational.Builder;

public class Student {
    private String name;
    private int age;
    private   String email;
    private String number;

    private Student(Builder builder)
    {

        this.name=builder.getName();
        this.age=builder.getAge();
        this.email=builder.getEmail();
        this.number=builder.getNumber();
    }

    public static Builder getBuilder()
    {
        return  new Builder();
    }
    static class Builder {

        private String name;
        private int age;
        private   String email;
        private String number;

        public Builder(String name, int age, String email, String number) {
            this.name = name;
            this.age = age;
            this.email = email;
            this.number = number;
        }
        public Builder()
        {

        }

        public Student build()
        {
            ///do validations here
            return  new Student(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return  this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return  this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return  this;
        }

        public Builder setNumber(String number) {
            this.number = number;
            return  this;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getEmail() {
            return email;
        }

        public String getNumber() {
            return number;
        }
    }
}



