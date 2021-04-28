package lesson2;

public class MyArrayDataException extends Exception{

    MyArrayDataException(int i, int j) {

        System.out.println(String.format("Сannot be converted to int [%d][%d]", i, j));
    }
}
