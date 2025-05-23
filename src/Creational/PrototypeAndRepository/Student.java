package Creational.PrototypeAndRepository;

public class Student implements Cloneable{
    String name;
    String batch_id;
    int age ;
    String month;

    Student(String name, String batch_id, int age, String month) {
        this.name = name;
        this.batch_id = batch_id;
        this.age = age;
        this.month = month;
    }

    Student(){}

    public  Student(Student st)
    {
        this.name=st.name;
        this.batch_id=st.name;
        this.month=st.month;
        this.age=st.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
//    public Student copy() {
//        return new Student(this);
//    }
    public Student clone()
    {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
