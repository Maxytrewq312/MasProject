package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = Sum();
        System.out.println("\nСумма элементов массива:\n"  + sum);
        if (sum % 2 == 0) {
            System.out.println("Сумма четна");
        }
        else {
            System.out.println("Сумма НЕчетна");
        }
    }
    public static int Sum()
    {
        int[] arraymain = new int[20];
        System.out.println("Исходный массив:");
        for (int i = 0; i < arraymain.length; i++) {
            arraymain[i] = (int) Math.round((Math.random() * 30) - 15); //создаем массив в диапазоне от -15 до 15
            System.out.println(arraymain[i]  + ", ");
        }

        int summ = 0;
        for (int i = 0; i < arraymain.length; i++) {
            summ = arraymain[i] + summ;
        }
        return summ;
    }
}
