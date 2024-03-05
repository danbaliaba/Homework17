package l35L36;


import java.util.*;

public class BobrList {
    private static int indexOfBobr;
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

    }
    public static class NameComporator implements Comparator<Bobr> {
        @Override
        public int compare(Bobr bobr1, Bobr bobr2){
            return bobr1.getName().compareTo(bobr2.getName());
        }
    }
    public static class RelativesCountComparator implements Comparator<Bobr> {
        @Override
        public int compare(Bobr bobr1, Bobr bobr2){return Math.max(bobr1.getRelativesCount(), bobr2.getRelativesCount());}
    }
    public void addBobr(String name, int age, int relativesCount){
        bobrList.add(new Bobr(name, age, relativesCount));
        indexOfBobr++;
    }
    public void sortBobr(){
        Collections.sort(bobrList);
        System.out.println("Collection sort" + bobrList);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void setHashSet(String name){
        Set<Bobr> bobrHashSet = new HashSet<>();

        for (Bobr bobr : bobrList)
        {
            bobrHashSet.add(bobr);
            if (bobr.getName().equals(name))
            {
                bobrHashSet.remove(bobr);
            }
        }
        System.out.println(bobrHashSet);
    }




}
