package l35L36;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BobrList {

    static List<Bobr> bobrList = new ArrayList<>();
    public void showList(){
        System.out.println(bobrList);
    }
    public List<Bobr> getBobrList(){ return this.bobrList = bobrList;
    }
    static class Bobr implements Comparable<Bobr>{
        String name;
        int age;
        int relativesCount;

        Bobr(String name , int age, int relativesCount)
        {
            this.name = name;
            this.age = age;
            this.relativesCount = relativesCount;

        }

        public int getAge() {return age;}
        public int getRelativesCount(){return relativesCount;}

        public String getName(){return name;}
        @Override
        public int compareTo(Bobr obj) {
            return this.age - obj.getAge();
        }


        @Override
        public String toString(){
            return "Hi I am " + this.name + " I am " + this.age + " and have " + this.relativesCount + " Relatives";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bobr bobr = (Bobr) o;
            return Objects.equals(name, bobr.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    public static class NameComporator implements Comparator<Bobr> {
        @Override
        public int compare(Bobr bobr1, Bobr bobr2){
            return bobr1.getName().compareTo(bobr2.getName());
        }
    }
    public void addBobr(String name, int age, int relativesCount){
        bobrList.add(new Bobr(name, age, relativesCount));
    }
    public void sortBobr(){
        Collections.sort(bobrList);
        System.out.println("Collection sort" + bobrList);

        Collections.sort(bobrList, new NameComporator());
        System.out.println("Collection sorted by name " + bobrList);

        Collections.sort(bobrList,(bobr1, bobr2) -> Integer.compare(bobr1.getRelativesCount(),bobr2.getRelativesCount()));
        System.out.println("Collection sorted by the number of relatives " + bobrList);
    }

    public static Map<String, Integer> setHashMap(){
        Map<String, Integer> bobrHashMap = new HashMap<>();

        for (Bobr bobr : bobrList)
        {
            bobrHashMap.put(bobr.getName(), bobr.getRelativesCount());
        }
        return bobrHashMap;
    }

    public static void setHashSet(){
        Set<Bobr> bobrHashSet = new HashSet<>();

        for (Bobr bobr : bobrList)
        {
            bobrHashSet.add(bobr);
        }
        System.out.println(bobrHashSet);
    }
    public static void Iterator(){
        Iterator<Bobr> bobrIterator = bobrList.iterator();
        while(bobrIterator.hasNext())
        {
            System.out.println(bobrIterator.next());
        }
    }
}
