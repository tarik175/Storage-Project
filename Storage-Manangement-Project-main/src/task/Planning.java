package task;

import java.util.ArrayList;
public interface Planning {
    int idBase = 1001;
    
    void pSpecification(String name, String producer, String unit);//abstract method  must override which class implementing this interface
    ArrayList<Product> pList();//it is abstract class and should be override by the which concreate class implementation this interface return type is arrayList 
    //which is dataType(reference) productClass  
    void pShelving(int id, String shelf);//abstract method must override which class implementing this interface
}