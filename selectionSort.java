/**
 * Created by Song on 3/26/16.
 */
public class selectionSort {

    public static void main(String[] args){
        //initilize array
        String[] names = new String[]{"awer","zjkdf", "jsdkf", "werui"};

        selectionSort(names); //function sort
        printResult(names); //function print result

    }

    private static void selectionSort(String[] names){
        for (int i = 0; i < names.length; i++){
            int min = i; //save the current index for the minimum one
            for (int j = i+1; j < names.length; j++){ //compare the current index one with the rest of the array elements
                if (names[min].compareTo(names[j]) > 0){ //if the one less than the outter index one
                    min = j; //save the index of the smallest one
                }
            }
            String temp = names[i]; //swap them
            names[i] = names[min];
            names[min] = temp;
        }

    }

    private static void printResult(String[] names){ //for each print
        for (String s: names) {
            System.out.println(s);
        }
    }
}
