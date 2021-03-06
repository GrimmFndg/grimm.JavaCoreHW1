package ru.geekbrains.classes.obstacles;

        import ru.geekbrains.classes.Participant;

public class Water extends Obstacle {

    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(length);
    }

    @Override
    public  void doIt(Participant[] team){
        for (int i = 0; i < team.length; i++){
            team[i].swim(length);
        }
    }
}
