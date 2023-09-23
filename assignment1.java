import java.util.Scanner;
class assignment1{
    public static void main(String []args){
        //initializing the arrays
        int arr1[][] = new int[20][20];
        
        int row1,col1;
        Scanner sc = new Scanner(System.in);
        //taking user input for rows and columns for array
        System.out.println("Enter the number of rows for the first array : ");
        row1 = sc.nextInt();
        System.out.println("Enter the number of columns for first array : ");
        col1 = sc.nextInt();
        //taking element input from the user
        System.out.println("Enter elements for first array");
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<col1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        //displaying the array 
        System.out.println("first array is : ");
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<col1;j++){
                System.out.print(arr1[i][j]+"\t"); 
            }
            System.out.println("");
        }

        //a. Addition of All Row and Column

        int sumRow=0;
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<col1;j++){
                sumRow = sumRow + arr1[i][j];
            }
            System.out.println("The Sum for row "+(i+1)+" is : "+sumRow);
            sumRow = 0;
        }
        int sumColumn=0;
        for(int i = 0;i<row1;i++){
            for(int j = 0;j<col1;j++){
                sumColumn = sumColumn + arr1[j][i];
            }
            System.out.println("The Sum for Col "+(i+1)+" is : "+sumColumn);
            sumColumn = 0;
        }
        
        //b. Printing MAX and MIN from Row and Column.

        int maxElement = 0;
        int minElement = 0;
        for(int i =0;i<row1;i++){
            for(int k = 0;k<col1;k++){

                maxElement=arr1[i][0];
                if(arr1[i][k]>=maxElement){
                    maxElement = arr1[i][k];
                }
                minElement=arr1[i][0];
                if(arr1[i][k]<=minElement){
                    minElement = arr1[i][k];
                }
            }
            System.out.println("From Row "+(i+1)+" min element is : "+minElement);
            System.out.println("From Row "+(i+1)+" max element is : "+maxElement);
        }

        maxElement = 0;
        minElement = 0;
        for(int i =0;i<row1;i++){
            for(int k = 0;k<col1;k++){
                maxElement=arr1[0][i];
                if(arr1[k][i]>=maxElement){
                    maxElement = arr1[k][i];
                }
                minElement=arr1[0][i];
                if(arr1[k][i]<=minElement){
                    minElement = arr1[k][i];
                }
            }
            System.out.println("From Col "+(i+1)+" min element is : "+minElement);
            System.out.println("From COl "+(i+1)+" max element is : "+maxElement);
        }
        
    }
}