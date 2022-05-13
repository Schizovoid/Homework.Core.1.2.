package Homework.JavaCore2.Homework2;

public class Exceptions {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] arr2 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "seven", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] arr3 = new String[][]{
                {"1", "2", "3"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}

        };

        try{
            arrayMethod(arr1);
        } catch (MySizeArrayException e){
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        try{
            arrayMethod(arr2);
        } catch (MySizeArrayException e){
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        try{
            arrayMethod(arr3);
        } catch (MySizeArrayException e){
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
    public static int arrayMethod(String[][] arr) throws MySizeArrayException, MyArrayDataException {
    if (arr.length != 4){
         throw new  MySizeArrayException("Неправильный размер массива!");
    }
    int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length != 4){
                throw new  MySizeArrayException("Неправильный размер массива!");
            }
            for (int j = 0; j < arr[i].length ; j++) {
                try {
                    sum += Integer.parseInt(arr[j][i]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Неправильный тип данных: [%d][%d]", j + 1, i + 1));
                }
            }
            }
        System.out.println("сумма всех чисел равна " + sum);
        return sum;
    }

}
