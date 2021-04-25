public class LessonApp {


    public static void main(String[] args) {

        Human human = new Human("Bill", 100, 2);
        Cat cat = new Cat("Margo", 50, 3);
        Robot robot = new Robot("TinCan", 200, 16);

        Action[] arr = new Action[]{human, cat, robot};
        Tournament[] array = new Tournament[2];

        int score = 0;
        for(int i = 0;i < array.length; i++) {
            if (score == 1) {
                array[i] = new Wall("Wall" + i, 3);
            } else {
                array[i] = new RunningTrack("RunningTrack" + i, 70);
                score++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            boolean result = true;
            for (int j = 0; j < array.length; j++) {
                result = array[j].tournament(arr[i]);

                if(!result){
                    System.out.println(arr[i].getName() + " выбывает из соревнования!" );
                    break;
                }
            }
            System.out.println();
        }
    }
}
