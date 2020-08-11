package ru.sbrf.lesson;

public class Main {

    //todo: скоро тут будет крутой проект
    public static void main(String[] args) {

        System.out.println(sum((byte) 3,(short )5));
        System.out.println(multiplication(10, 100));
        System.out.println(getMaxNumber(15, 25));
        System.out.println(isCharA('r'));
        System.out.println(isCharNumber('5'));
        binaryString(30);
        numberTen();
        System.out.println(numberChar('g'));
        System.out.println(numberTwelve(75));

    }

    public static byte sum(byte a, short  b){
        System.out.println("---Задание 4---");
        return (byte) (a + b);
    }

    public static int multiplication(int a, long b){
        System.out.println("---Задание 5---");
        return (int) (a * b);
    }

    public static int getMaxNumber(int a, int b){
        System.out.println("---Задание 6---");
        return Math.max(a, b);
    }

    public static boolean isCharA(char a){
        System.out.println("---Задание 7---");
        return a == 'A';
    }

    public static boolean isCharNumber(char a){
        System.out.println("---Задание 8---");
        return Character.isDigit(a);
    }

    public static void binaryString(int a){
        System.out.println("---Задание 9---");

        for (int i = 0; i < a; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    public static void numberTen(){
        System.out.println("---Задание 10---");
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    public static int numberChar(char a){
        System.out.println("---Задание 11---");
        return a;
    }

    public static char numberTwelve(int a){
        System.out.println("---Задание 12---");
        return (char)a;
    }
}
