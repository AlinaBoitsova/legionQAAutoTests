package lesson4;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Stream;

public class ArrayHomeWork {
    public void arrayListWeek() {
        ArrayList<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        System.out.println(days.get(1));
    }

    public void hashMapToys() {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(12, "Batmobile");
        hashMap.put(45, "Light Saber");
        hashMap.put(6, "Wonder Women");
        hashMap.put(201, "Hello Kitty Bag");
        hashMap.put(56, "Junior QA Analyst Doll");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Toy ID: ");
        int toyID = sc.nextInt();
//        int i;
//        i = 12;

        if (hashMap.get(toyID) == null) {
            System.out.println("No such Toy");
        } else {
            System.out.println(hashMap.get(toyID));
        }
    }

    public void hashSet(){
        HashSet <String> hashSet = new HashSet<String>();
        hashSet.add("Steve");
        hashSet.add("Tim");
        hashSet.add("Lucy");
        hashSet.add("Steve");
        hashSet.add("Pat");
        hashSet.add("Angela");
        hashSet.add("Tom");
        hashSet.add("Tim");
        hashSet.add("Anna");
        hashSet.add("Lucy");
        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);
    }
    public void arrayList(){
        ArrayList <String> list = new ArrayList<String>();
        list.add("Steve");
        list.add("Tim");
        list.add("Lucy");
        list.add("Steve");
        list.add("Pat");
        list.add("Angela");
        list.add("Tom");
        list.add("Tim");
        list.add("Anna");
        list.add("Lucy");
        HashSet <String> listWithoutDublicate = new HashSet<String>(list);
        Collections.sort(list);
        System.out.println(listWithoutDublicate);
    }
}

