package Generics;

import java.security.Key;

public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key,V value){
        this.key=key;
        this.value=value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}
 class Main1{
    public static void main(String[] args){
        Pair<String,Integer> pair = new Pair<>("Divya",12);
        String i = pair.getKey();
        int j = pair.getValue();
        System.out.println(i+" "+j);
    }

 }