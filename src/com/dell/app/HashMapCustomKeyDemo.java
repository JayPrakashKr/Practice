package src.com.dell.app;

import java.util.HashMap;
import java.util.Map;

public class HashMapCustomKeyDemo {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101,"Jay",10000000.0);
        Employee emp2 = new Employee(101,"Prakash",10000000.0);
        Employee emp3 = new Employee(101,"Kumar",10000000.0);

        HashMap<Employee,String> hashMap = new HashMap<>();

        hashMap.put(emp1,"employee-1");
        hashMap.put(emp2,"employee-2");
        hashMap.put(emp3,"employee-3");

        for(Map.Entry<Employee, String> map : hashMap.entrySet()){
            System.out.println(map);
        }
    }
}
