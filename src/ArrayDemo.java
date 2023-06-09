import java.util.Arrays;

public class ArrayDemo {


  /*  static boolean trueAndFalse(int[] arr,int value){

        for(int gez:arr){
            if( gez==value){
                return true;
            }
        }
        return false;
    }*/




    public static void main(String[] args) {
        int[] list = new int[]{3,7,3,3,2,9,10,21,1,33,9,1};
        int[] newList = new int[list.length];
        int start = 0;


        for(int i = 0; i<list.length; i++){
            for(int j=0; j<list.length; j++){
                 if(i!=j && list[i]==list[j]){

                         newList[start++] = list[j];

                     }

                 }
            }
        System.out.println(Arrays.toString(newList));

        }
     /*   for(int value:newList){
            if(value!=0){
                System.out.println(value);
            }
        }*/
    }



