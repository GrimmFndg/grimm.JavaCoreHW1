package ru.geekbrains.classes;

import ru.geekbrains.classes.animals.*;
import ru.geekbrains.classes.obstacles.*;
public class Application {

    public static void main(String[] args) {

//2.Добавить класс Team, который будет содержать название команды, массив из 4-х участников 	(т.е.
// в конструкторе можно сразу всех участников указывать), метод для вывода информации о членах команды, прошедших дистанцию,
// метод вывода информации обо всех членах команды.

        Team team_A = new Team ("Team A",
                                5,5,                                //1-ый участник
                                4,4,                                //2-ой участник
                                10,4,10,            //3-ий участник
                               50,50,50);       //4-ый участник

        Participant [] teamA = team_A.preparedTeam();


//3. Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод,
// который будет просить команду пройти всю полосу.

        Course c = new Course("с", 5, 10, 10);
        c.doIt(teamA);
        team_A.showResults(teamA);

    }
}
