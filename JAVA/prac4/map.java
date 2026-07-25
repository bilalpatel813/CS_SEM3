package JAVA_practical.pract4;

import java.util.*;

public class map{
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Amit");
        studentMap.put(102, "Riya");
        studentMap.put(103, "Amit");
        studentMap.put(101, "Soham");
        
        for(Map.Entry<Integer, String> entry : studentMap.entrySet()){
            System.out.println("Roll No: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        System.out.println("Name of Roll 102: " + studentMap.get(102));

    }
}