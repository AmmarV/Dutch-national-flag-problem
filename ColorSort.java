/**
 * Created by Ammar on 4/15/17.
 */
public class ColorSort {

    public static void main(String[] args) {

        char [] array = {'R','G','G','B','B','G'};
        char [] array2 = {'G','G','R','G','B','G'};
        char [] array3 = {'G','B','G','B','G','R'};
        char [] array4 = {'G','R','R','G','R','B'};
        char [] array5 = {'R','G','R','G','B','R'};
        char [] array6 = {'R','G','B','R','G','B'};
        char [] array7 = {'B', 'B', 'G', 'B', 'B'};
        char [] array8 = {'G','G','G','R','B','G'};
        System.out.println(finish(array));
        System.out.println(finish(array2));
        System.out.println(finish(array3));
        System.out.println(finish(array4));
        System.out.println(finish(array5));
        System.out.println(finish(array6));
        System.out.println(finish(array7));
        System.out.println(finish(array8));
    }

    public static char[] finish(char[] array){
        int redIndicator = 0;
        int ySlider = array.length-1;

        for(int i=0; i<ySlider; i++){

            char L = examine(array, i);
            char R = examine(array, ySlider);

            switch(L){
                case 'R': swap(array,redIndicator,i);
                          redIndicator++;
                          break;

                case 'G': switch (R){
                             case 'R': swap(array, redIndicator, ySlider);
                                       redIndicator++;
                                       break;
                             case 'G':
                                       break;
                             case 'B': ySlider--;
                                       break;
                }
                    break;

                case 'B': switch (R){
                             case 'R': swap(array, i, ySlider);
                                       redIndicator++;
                                       ySlider--;
                                       break;
                             case 'G': swap(array,i,ySlider);
                                       ySlider--;
                                       i--;
                                       break;
                             case 'B': ySlider--;
                                       i--;
                                       break;
                }
                    break;
            }


        }
        return array;
    }


    public static void swap(char[] array, int x, int i){
        char temp = array[i];
        array[i] = array[x];
        array[x] = temp;
    }

    public static char examine(char[] array, int pos){
        return array[pos];
    }
}
