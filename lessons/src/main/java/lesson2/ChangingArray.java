package lesson2;

public class ChangingArray{

    private static int sumArray;

    public ChangingArray(String[][] array) {

        if(4 != array.length)
        new MyArraySizeException();
        System.out.println();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                try {
                    sumArray += Integer.parseInt(array[i][j]);
                }catch (Exception ex) {
                    new MyArrayDataException(i, j);
                    ex.printStackTrace(System.out);
                    System.out.println();
                }
            }
        }
    }

    public static int getSum() {
        return sumArray;
    }
}
