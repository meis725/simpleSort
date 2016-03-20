/**
 * Created by Song on 3/12/16.
 */
public class simpleStringSort {

    public static void main(String[] args){
        //initilize array
        String[] names = new String[]{"awer","zjkdf", "jsdkf", "werui"};

        sort(names); //function sort
        printResult(names); //function print result

    }

    private static void sort(String[] names){
        for(int i = 0; i < names.length; i++){ //get each element in the array
            for (int j = i+1; j < names.length; j++) { //compare with other items in the array
                if (names[j].compareTo(names[i]) < 0) { //if the next one less than the current one
                    String temp = names[i]; //save current one in a temp variable
                    names[i] = names[j]; //swap current one and the smallest one
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
