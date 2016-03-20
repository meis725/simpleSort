/**
 * Created by Song on 3/19/16.
 */
public class InsertionSort {

    public static void main(String[] args){
        //initilize array
        String[] names = new String[]{"awer","zjkdf", "jsdkf", "werui"};

        sort(names); //function sort
        printResult(names); //function print result

    }

    private static void sort(String[] names){
        for (int i = 0; i < names.length; i++){
            for (int j = i; j > 0; j--){
                if (names[j].compareTo(names[j-1]) < 0){
                    String temp = names[j-1];
                    names[j-1] = names[j];
                    names[j] = temp;
                }
            }
        }
    }

    private static void printResult(String[] names){ //for each print
        for (String s: names) {
            System.out.println(s);
        }
    }
}
