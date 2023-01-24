

public class TwoDArray{
    public static void main(String[] args) {
      

        //declaring and assigning values
        int no[][] = {{1,2,3},{4,5,6}};

        System.out.println();
        
        //displaying the values in array elements
        System.out.println("The values in the elements here");
        for (int i=0; i<no.length; i++){
            for(int x=0; x<no[i].length; x++){
                System.out.println(no[i][x] +"\t");
            }
            
        }

    }
}