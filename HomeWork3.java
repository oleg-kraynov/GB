/*  Java Level 1. Lesson 3. HomeWork 3.

    @autor Kraynov Oleg
    @version 20.08.2018
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        guessTheNumber();
        guessTheWord();
    }

/*
    1. Написать программу, которая загадывает случайное число от 0 до 9,
    и пользователю дается 3 попытки угадать это число.
    При каждой попытке компьютер должен сообщить больше ли указанное пользователем
    число чем загаданное,
    или меньше. После победы или проигрыша выводится запрос –
    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

    static void guessTheNumber() {
        int repeat;
        Scanner scanner = new Scanner(System.in);
        do {
            Random random = new Random();
            int thinkNumb = random.nextInt(10);
            int attempt = 3;
            System.out.println("Я загадал число от 0 до 9, попробуйте угадать! У Вас есть 3 попытки! " + thinkNumb);
            for (int i = 0; i < 3; i++) {
                attempt = attempt - 1;
                int inpNumb = scanner.nextInt();
                if (thinkNumb == inpNumb) {
                    System.out.println("Вы угадали это число " + thinkNumb);
                    break;
                }
                if (thinkNumb > inpNumb) {
                    System.out.println("Вы ввели маленькое число! Количество оставшихся попыток: " + attempt);
                }
                if (thinkNumb < inpNumb) {
                    System.out.println("Вы ввели большое число! Количество оставшихся попыток: " + attempt);
                }
                if (attempt == 0) {
                    System.out.println("Сожалею, Вы проиграли! Это число " + thinkNumb);
                }
            }
            System.out.println("Повторить игру еще раз? 1 - ДА / 0 - НЕТ");
            repeat = scanner.nextInt();
        } while (repeat == 1);
        System.out.println("Вы закончили угадывать числа!");
    }
/*
    2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana",
    "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
    "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
    "pineapple", "pumpkin", "potato"};
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
    Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово
    Используем только маленькие буквы
 */
    static void guessTheWord() {

        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String word;
        int n = random.nextInt(words.length);
        System.out.println(words[n]);
        System.out.println("Я загадал слово из списка " + Arrays.toString(words) + ", попробуйте угадать");
        char[] chs = words[n].toCharArray();
        char[] chCmp = new char[15];
        for (int i = 0; i < 15; i++) {
            chCmp[i] = '#';
        }

        while (true) {
            System.out.print("Введите слово: ");
            word = scanner.nextLine();
            if (word.equals(words[n])) {
                System.out.println("Вы угадали");
                break;
            } else {
                System.out.println("Вы не угадали");
                char[] chWord = word.toCharArray();

                for (int i = 0; i < chs.length; i++) {
                    if (i >= chWord.length) {
                        break;
                    }
                    if (chs[i] == chWord[i]) {
                        chCmp[i] = chs[i];
                    }
                }
                System.out.println(String.valueOf(chCmp));
            }
        }
    }
}
