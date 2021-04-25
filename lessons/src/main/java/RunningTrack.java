public class RunningTrack extends Tournament{

    private int length;

    public RunningTrack(String name, int length){
        super();

        this.length = length;
    }

    @Override
    public boolean tournament(Action arr) {

        System.out.println("Забег на " + length + " метров: ...");

        arr.run();

        if(length <= arr.getRun())
            return true;
        else
            System.out.println("Максимальные возможности " + arr.getName() + " " + arr.getRun() + " метров.");
        return false;
    }
}
