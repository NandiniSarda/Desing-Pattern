package PrototypeAndRepository;

public class IntelligentStudent extends Student{

    int iq ;
    public IntelligentStudent(String name , String batch_id , int age , String month , int iq)
    {
        super(name , batch_id, age, month);
        this.iq=iq;
    }
    public IntelligentStudent()
    {
        this.iq=50;
    }
    public IntelligentStudent(IntelligentStudent st) {
        super(st);
        this.iq = st.iq;
    }
    @Override
//    public Student copy() {
//        return new IntelligentStudent(this);
//    }
    public IntelligentStudent clone()
    {
        return (IntelligentStudent) super.clone();
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

}
