package lesson1;

public class Wall extends Tournament {

    private int height;

    public Wall(String name, int height){
        super();

        this.height = height;
    }

    @Override
    public boolean tournament(Action arr) {
        System.out.println("Прыжки через препятствие: ");

        arr.jump();

        if(arr.getJump() >= height) {
            System.out.println(" " + arr.getName() + " перепрыгнул препятствие!");
            return true;
        }
        else
            System.out.println(" " + arr.getName() + " не может перепрыгнуть. Максимальные возможности " + arr.getJump() + " метра.");
            return false;
    }
}
