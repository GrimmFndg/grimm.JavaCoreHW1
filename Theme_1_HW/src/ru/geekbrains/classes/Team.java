package ru.geekbrains.classes;
import ru.geekbrains.classes.animals.*;

public class Team {

    String name;
    Participant [] team = new Participant[4];

    public Team (String _name,
                 int cat1RunDistance, int cat1JumpDistance,
                 int cat2RunDistance, int cat2JumpDistance,
                 int dogRunDistance, int dogJumpDistance, int dogSwimDistance,
                 int robotRunDistance, int robotJumpDistance, int robotSwimDistance){

        name = _name;

        team [0] = new Cat("cat1",cat1RunDistance,cat1JumpDistance,0);
        team [1] = new Cat("cat2", cat2RunDistance,cat2JumpDistance,0);
        team [2] = new Dog("dog",dogRunDistance,dogJumpDistance,dogSwimDistance);
        team [3] = new Robot("robot",robotRunDistance,robotJumpDistance,robotSwimDistance);
    }

    public Participant [] preparedTeam(){
        return team;
    }

    public void showResults (Participant[] team){
        System.out.println("------------------");
        for (int i = 0; i < team.length; i++){
            boolean result = team[i].isOnDistance();
            if ( result == true){
                System.out.println((i+1) + "-й участник команды " + this.name + " справился с маршрутом");
            }
        }
    }


/*
    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал кросс");
        } else {
            System.out.println(name + " не справился с кроссом");
            onDistance = false;
        }

    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул стену");
        } else {
            System.out.println(name + " не справился с прыжком");
            onDistance = false;
        }
    }

    @Override
    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать");
            onDistance = false;
        } else if (distance <= maxSwimDistance) {
            System.out.println(name + " успешно переплыл");
        } else {
            System.out.println(name + " не смог переплыть");
            onDistance = false;
        }

    }*/
}
