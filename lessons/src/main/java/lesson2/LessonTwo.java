package lesson2;

public class LessonTwo {

    public static void main(String[] args) {

        String[][] array = new String[][]{{"8","0","52","07mmlss/"},
                                            {"2dyyh,m-","04","dgjhj2","sdss8"},
                                            {"/*-5+","1fhfd","35csfs","/.cl0"},
                                            {"+++2rgf","6","7f5nn","qweew-0"}};

        ChangingArray changingArray = new ChangingArray(array);

        System.out.println("Сумма чисел массива = " + ChangingArray.getSum());
    }
}
