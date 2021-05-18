package lesson5;

public class NewArray extends Thread{

    private String name;
    private float[] arr;

    NewArray(String name, float[] arr) {
        this.name = name;
        this.arr = arr;
    }

    @Override
    public void run() {
        runningArray();
    }

    public void runningArray(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
