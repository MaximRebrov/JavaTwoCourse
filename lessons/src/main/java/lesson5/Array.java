package lesson5;

public class Array {
     final int size = 10000000;
     float[] array = new float[size];
     final int h = size / 2;
     float[] arr1 = new float[h];
     float[] arr2 = new float[h];

     public void arrayFull() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
        long a = System.currentTimeMillis();
        for(int i = 0; i < array.length; i++){

            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    public void arrayHalf() throws InterruptedException {
        long a = System.currentTimeMillis();
        System.arraycopy(array, 0, arr1, 0, h);
        System.arraycopy(array, h, arr2, 0, h);

        Thread thread1 = new Thread(new NewArray("arr", arr1));
        Thread thread2 = new Thread(new NewArray("array", arr2));

        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();

        System.arraycopy(arr1, 0, array, 0, h);
        System.arraycopy(arr2, 0, array, h, h);

        System.out.println(System.currentTimeMillis() - a);
    }

}



