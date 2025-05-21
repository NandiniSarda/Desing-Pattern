package PrototypeAndRepository;

import java.util.HashMap;
import java.util.Map;

public class Registory {

    Map<String , Student> registoryMap;
     public  Registory()
     {
         this.registoryMap= new HashMap<>();
     }

     public  void addPrototype(String key, Student value)
     {
         registoryMap.put(key,value);
     }
    public Student getStudent(String key) {
         Student student = registoryMap.get(key);
//        return student!=null ? student.copy(): null ;
         return student!=null ? student.clone(): null ;
    }

    public void removeStudent(String key) {
        registoryMap.remove(key);
    }
}
