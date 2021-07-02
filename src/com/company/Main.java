package com.company;




public class Main {

    public static void main(String[] args) {
	// write your code

        //Это арондамайзер
        int min = 0;
        int max = 107;
        int ran = max - min;
        Random random = new Random();
        int i = random.nextInt(ran + 1);
        i += min;

        String name = "Ahmed";
        int age = i;
        int tem = +29;

        if (20 <= age && 45 >= age && tem < +30 && -20 < tem) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && tem > 0 && 28 > tem) {
            System.out.println("Иди гуляй");
        } else if (age < 45 && -10 < tem && 25 > tem) {
            System.out.println("Можно погулять");
        } else {
            System.out.println("Не гуляй");
        }
        System.out.println(age);
        //здесь я решил вывести результат
    }
}
