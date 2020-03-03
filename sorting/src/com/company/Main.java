//package com.company;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Comparator;
//
///*
//Задача по алгоритмам
//*/
//class Person {
//    private String name;
//
//    Person(String name) {
//        this.name = name;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> list = new ArrayList<>();
//        while (true) {
//            String s = reader.readLine();
//            if (s.isEmpty()) {
//                break;
//            }
//            list.add(s);
//        }
//
//        String[] array = list.toArray(new String[0]);
//        sort(array);
//
//        for (String x : array) {
//            System.out.println(x);
//        }
//    }
//
//    public static void sort(String[] array) {
//        ArrayList<String> strings = new ArrayList();
//        ArrayList<Integer> numbers = new ArrayList();
//
//        for(String elem: array) {
//            if (isNumber(elem)) {
//                numbers.add(Integer.parseInt(elem));
//            } else {
//                strings.add(elem);
//            }
//        }
//
//        numbers.sort(Integer::compareTo);
//
//        Comparator<String> comparator = (x, y) -> isGreaterThan(x, y) ? 1 : -1;
//        strings.sort(comparator);
//
//        int numPointer = strings.size() - 1;
//        int stringPointer = 0;
//        for(int i = 0; i < array.length; i++) {
//            if (isNumber(array[i])) {
//                array[i] = String.valueOf(numbers.get(numPointer));
//                numPointer--;
//            } else {
//                array[i] = strings.get(stringPointer);
//                stringPointer++;
//            }
//        }
//    }
//
//    // Метод для сравнения строк: 'а' больше чем 'b'
//    public static boolean isGreaterThan(String a, String b) {
//        return a.compareTo(b) > 0;
//    }
//
//    public static int calculate (int x) {
//        return 5;
//    }
//
//    // Переданная строка - это число?
//    public static boolean isNumber(String s) {
//        if (s.length() == 0) {
//            return false;
//        }
//
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            char c = chars[i];
//            if ((i != 0 && c == '-') // Строка содержит '-'
//                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
//                    || (chars.length == 1 && c == '-')) // или одиночный '-'
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//}
