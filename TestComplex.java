import java.util.Scanner;

public class TestComplex {

    public static void main(String[] arg) {
        System.out.println("Это программа для работы с комплексными числами, выберите операцию которую хотите выполнить: \n");
        System.out.println(" 1)Вычислить модуль. \n 2)Вычислить аргумент. \n 3)Сложение комплексных чисел. \n 4)Вычитание комплексных чисел. \n 5)Выход. \n");

        Scanner sc = new Scanner(System.in);

        int answer = 0;

        while (answer < 5) {
                                                //цикл который позволяет нам не перезапускать программу
        answer = sc.nextInt();

        if (answer==5| answer>5){}

        else {
            System.out.println("Введите действительную часть: ");
            double real = sc.nextDouble();
            System.out.println("Введите мнимую часть: ");
            double image = sc.nextDouble();

            Complex a = new Complex(real, image);

                switch (answer) {
                    case 1:
                        System.out.println("Модуль равен: " + a.abs());         //кейс модуля
                        break;

                    case 2:
                        System.out.println("Аргумент равен: " + a.arg());       //кейс аргумента
                        break;

                    case 3:
                        System.out.println("Введите вторую действительную часть: ");
                        double real2;
                        real2 = sc.nextDouble();
                        System.out.println("Введите вторую мнимую часть: ");
                        double image2;                                                          //кейс суммы
                        image2 = sc.nextDouble();
                        Complex Alfa = new Complex(real, real2);
                        Complex Betta = new Complex(image, image2);
                        System.out.println("Сумма равна: " + Alfa.SumRe(real, real2) + " " + Betta.SumIm(image, image2) + "i");
                        break;

                    case 4:
                        System.out.println("Введите вторую действительную часть: ");
                        double real3;
                        real3 = sc.nextDouble();
                        System.out.println("Введите вторую мнимую часть: ");
                        double image3;                                                          //кейс разницы
                        image3 = sc.nextDouble();
                        Complex Alfa2 = new Complex(real, real3);
                        Complex Betta2 = new Complex(image, image3);
                        System.out.println("Разница равна: " + Alfa2.SubRe(real, real3) + " " + Betta2.SubIm(image, image3) + "i");
                        break;

                }

            }

        }

    }

}


