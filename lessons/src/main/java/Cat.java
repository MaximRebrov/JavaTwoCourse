public class Cat implements Action {

    private String name;
    private int run;
    private int jump;

    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public int getJump() {
        return jump;
    }

    @Override
    public int getRun() {
        return run;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void jump() {
        System.out.println(name + " перепрыгнула препятствие!");
    }

    @Override
    public void run() {
        System.out.println(name + " пробежала " + run);
    }
}
