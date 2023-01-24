package task;

import java.util.ArrayList;
public class Storage implements Planning, Purchasing, Sales {
    
    ArrayList<Product> pList = new ArrayList<>();
    @Override
    public void pSpecification(String name, String producer, String unit) {//get override by planning interface
        int id = pList.size() + idBase;//every increasing index will be create unique idBase
        Product product = new Product(id, name, producer, unit);//creating product object
        pList.add(product);//every product object(which has id,name,producer,unit) will add in arrayListand will be elements of arrayList
        //this method will has inside specific creatures same with product object 
    }
    @Override
    public ArrayList<Product> pList() {//get override by planning interface
        return pList; //return product objects creature as list 
    }
    @Override
    public void pShelving(int id, String shelf) {//get override by planning interface
        pList.get(id-idBase).shelf = shelf; //shelf comes from product class as instance variable, plist's reference has product class' members
                //idBase was 1001 and we trying to get exact index number in here for call exact member in pList 
    }
    @Override
    public void pEnter(int id, int quantity) { //add
        pList.get(id-idBase).quantity += quantity;//quantity comes from product class as instance variable, plist's reference has product class' members
      //idBase was 1001 and we trying to get exact index number in here for call exact member in pList
    }
    @Override
    public void pExit(int id, int quantity) {
        pList.get(id-idBase).quantity -= quantity; //removes
      //idBase was 1001 and we trying to get exact index number in here for call exact member in pList
    }
}
