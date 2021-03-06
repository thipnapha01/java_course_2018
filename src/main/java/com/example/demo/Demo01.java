
package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        Demo01 demo01 =new Demo01();
//        demo01.demoList();
        demo01.demoMap();
        demo01.demoSet();
    }
    
    private void demoSet() {
        Set<String> names = new HashSet<String>(); {
            names.add("n1");
            names.add("n1");
            names.add("n1");
            for(String name : names){
                System.out.println(name);
            }
        }
        
    }

    private void demoMap() {
       Map<String, Integer> names = new HashMap<>();
       names.put("n1", 20);
       names.put("n2", 30);
        Set<String> keys = names.keySet();
        for(String key : keys){
            System.out.println(key + "=" + names.get(key));
        }
    }

    private void demoList(){
        System.out.println("Call demoList");
        //Generic
       // ArrayList<String> names = new ArrayList<String>(); //Don't
        List<String> names = new ArrayList<String>();
        names.add("Name1");
        names.add("Name2");
//        for(String name : names){
//            System.out.println(name);
//        }
        
//--       names.forEach(name -> System.out.println(name));
//--       names.forEach(System.out::println);        
// --      for(Iterator<String> i = names.iterator(); i.hasNext();){
//            System.out.println(i.next());
//        }
    }
}
