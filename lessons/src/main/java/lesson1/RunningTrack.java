package lesson1;

public class RunningTrack extends Tournament {

    private int length;

    public RunningTrack(String name, int length){
        super();

        this.length = length;
    }

    @Override
    public boolean tournament(Action arr) {

        System.out.println("Забег на " + length + " метров: ");

        arr.run();

        if(length <= arr.getRun()) {
            System.out.println(" " + arr.getName() + " пробежал " + length + " метров");
            return true;
        }
        else
            System.out.println(arr.getName() + " не бегает на такое расстояние. Максимальные возможности " + arr.getName() + " " + arr.getRun() + " метров.");
        return false;
    }
}
