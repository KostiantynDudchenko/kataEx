package javaCore.t2t4t15;

/*В спортивном центре есть три возрастные группы для занятий волейболом
1 - от 7 до 13 лет 2 - от 14 до 17 лет 3 - от 18 до 65 лет.

        Напишите публичный нестатичный метод determineGroup который принимает
        возраст человека и возвращает целое число, которое обозначает номер группы
        в которую его надо определить, если подходящей группы нет - верните -1.

        Пример ввода: 10
        Пример вывода: 1

        Пример ввода: 60
        Пример вывода: 3

        Пример ввода: 77
        Пример вывода: -1
*/
public class SportGroup {
    public int determineGroup(int age) {
        int groupNumber = -1;
        if (age >= 7 && age <= 13) {
            groupNumber = 1;
        } else if (age >= 14 && age <= 17) {
            groupNumber = 2;
        } else if (age >= 18 && age <= 65) {
            groupNumber = 3;
        }
        return groupNumber;
    }
}
