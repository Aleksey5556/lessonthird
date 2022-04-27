package Сollection.lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class Notebook {


    private HashMap <String, HashSet<String>> map;


    public Notebook(){
        this.map = new HashMap<>();
    }
    public void add(String surname,String telephone){
        if (!map.containsKey(surname)){
            map.put(surname,new HashSet<>());
        }
        map.get(surname).add(telephone);
    }

    public HashSet<String> find(String surname) {
if (!map.containsKey(surname)){
    return new  HashSet<>();
}
return map.get(surname);
    }

}
