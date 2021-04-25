public class Wall extends Tournament{

    private int height;

    public Wall(String name, int height){
        super();

        this.height = height;
    }

    @Override
    public boolean tournament(Action arr) {
        System.out.println("Прыжки через препятствие ...");

        arr.jump();

        if(arr.getJump() >= height)return true;

        else
            System.out.println("Максимальные возможности " + arr.getName() + " " + arr.getJump() + " метра.");
            return false;
    }
}
