package ru.madbrains.lesson1;

import java.util.Arrays;
import java.util.Random;

public class Methods {

    public static void main(String[] args) {
        primitivesUsageExample();
        System.out.println("------------------------");
        referencesUsageExample();
        System.out.println("------------------------");
        referencesArraysUsageExample();
        System.out.println("------------------------");
        referencesSomeObjectUsageExample();
    }

    public static void primitivesUsageExample() {
        int a = 100;
        testPrimitive(a);
        System.out.println("А не был изменен, и по прежнему " + a);
    }

    public static void testPrimitive(int a) {
        a = 200;
        System.out.println("В методе a был изменен на " + a);
    }

    public static void referencesUsageExample() {
        Random rand = new Random();
        System.out.println("rand: " + rand);
        testReference(rand);
        System.out.println("rand не был изменен, и по прежнему " + rand);
    }

    // Random[] a = new int[10];
    // a[0] = 1,
    // a1, java.util.Random@23fc625e, java.util.Random@23fc625e, 0, 0, 0, 0, 0, 0, 0
    public static void testReference(Random random) {
        random = new Random();
        System.out.println("В методе a был изменен на " + random);
    }

    public static void referencesArraysUsageExample() {
        int[] arr = new int[5];
        System.out.println("arr: " + arr);
        System.out.println(Arrays.toString(arr));
        testArrayReference(arr);
        System.out.println("arr не был изменен, и по прежнему " + arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void testArrayReference(int[] arr) {
//        arr = new int[100];
        arr[0] = 1000;
        System.out.println("В методе arr был изменен на " + arr);
    }

    public static void referencesSomeObjectUsageExample() {
        SomeObject someObject = new SomeObject();
        someObject.a = 1000;

        System.out.println("до");
        System.out.println(someObject);
        System.out.println(someObject.a);

        testSomeObjectReference(someObject, 2000);
        System.out.println("после");
        System.out.println(someObject);
        System.out.println(someObject.a);
    }

    // сигнатура метода
    private static void testSomeObjectReference(SomeObject someObject) {
        someObject.a = 2000;
        System.out.println("В методе someObject.a был изменен на " + someObject.a);
    }

    private static void testSomeObjectReference(SomeObject someObject, int b) {
        someObject.a = b;
        System.out.println("В методе someObject.a был изменен на " + someObject.a);
    }

    static class SomeObject {
        int a;
    }

}
