
public class ThreeDArray{
    public static void main(String[] args) {
      

        //declaring and assigning values
        int no[][][] = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};

        System.out.println();
        
        //displaying the values in array elements
        System.out.println("The values in the elements here");
        for (int i=0; i<no.length; i++){
            for(int x=0; x<no[i].length; x++){
                for(int z=0; z<no[i][x].length; z++){
                    System.out.print(no[i][x][z] +"\t");
                }
                System.out.println();        
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();

    }
}