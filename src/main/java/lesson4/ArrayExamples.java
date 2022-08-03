package lesson4;

import java.util.*;

public class ArrayExamples {

    public void stringsArray(){
        String[] buttons = {"OK", "Cancel", "Login", "SingUp"};
//        buttons[2] = "Exit";

        int length = buttons.length;
//        System.out.println(buttons[2]);
//        System.out.println("length " + length);
        // вывести все кнопки
//        for(int i=0; i<buttons.length; i++){
//            System.out.println(buttons[i]);
        for(String button: buttons){
            System.out.println(button);
        }
    }

    public void stringsArrayWithSize(){
        String[] array = new String[5];
        array[0] = "OK";
        array[1] = "Cancel";
        array[2] = "Login";
        array[3] = "SingUp";
        array[4] = "Exit";

        System.out.println("length " + array.length);
    }

    public void integerArray(){

        int[] ids = {13, 3, 5, 8};
        System.out.println(ids[2]);
    }

    public void arrayListExample() {
        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add("OK");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("Exit");

        System.out.println(buttons.get(0));
//        for (String button : buttons) {
//            System.out.println(button);
//        }
//        System.out.println("The size of the list " + buttons.size());
//        //добавить кнопку
//        buttons.add("SignUP");
//        for (String button : buttons) {
//            System.out.println(button);
//        }
//        buttons.remove("Exit");
//        for (String button : buttons) {
//            System.out.println(button);
//        }
        // очистить лист
//        buttons.clear();
//        System.out.println(buttons.size());
    }

    public void arrayListSortingExample() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(123);
        arrayList.add(1);
        arrayList.add(23);
        arrayList.add(98);
        Collections.sort(arrayList);
        for(Integer i: arrayList){
            System.out.println(i);
        }
    }
public void hashMapExample(){
    HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
    hashMap.put("John", 12);
    hashMap.put("Kate", 31);
    hashMap.put("Moshe", 9);
    System.out.println(hashMap);
    System.out.println(hashMap.get("Moshe"));
    hashMap.remove("John");
    System.out.println(hashMap.size());
}

public void hashSetExamples(){
    HashSet<String> hashSet = new HashSet<String>();
    hashSet.add("John");
    hashSet.add("Kate");
    hashSet.add("Moshe");
    System.out.println(hashSet);
    //просто так отсортировать нельзя, поэтому нужно создать array
    List<String> list = new ArrayList<String>(hashSet);
    Collections.sort(list);
    System.out.println(list);
}
}
