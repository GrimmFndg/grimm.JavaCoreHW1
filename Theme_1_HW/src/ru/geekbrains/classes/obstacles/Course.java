package ru.geekbrains.classes.obstacles;

import ru.geekbrains.classes.Participant;

public class Course extends Obstacle {

    private String name;
    private int runLength;
    private int swimLength;
    private int height;
    private Obstacle[] obstacles = new Obstacle[3];

    public Course(String _name, int _runLength, int _swimLength, int _height) {

        name = _name;

        obstacles[0] = new Cross(_runLength);
        obstacles[1] = new Wall(_height);
        obstacles[2] = new Water(_swimLength);
    }

    @Override
   public void doIt(Participant participant) {
       participant.jump(height);
   }


    @Override
    public void doIt(Participant[] team) {
        for (int i = 0; i < team.length; i++) {
            for (int k = 0; k < obstacles.length; k++) {
                obstacles[k].doIt(team[i]);
            }
        }
    }
}
