import java.util.Scanner;

public class assignment4 {
    public static void main(String args[]){
        int curEven,curOdd; //initializing even and odd array indexes
        int arrLim; //number of elements for the array 
        int arr1[] = new int[100]; //initializing main array
        int evenArr[] = new int[100]; //initializing even elements array
        int oddArr[] = new int[100]; //initializing odd elements array

        Scanner sc = new Scanner(System.in); //initializing scanner object
        System.out.println("Enter the number of elements you want to enter in the array : ");
        //taking user input
        arrLim = sc.nextInt();

        System.out.println("Enter the elements for the array : ");

        for(int i = 0;i<arrLim;i++){
            arr1[i] = sc.nextInt(); 
        }
        //displaying the array the user entered elements for
        System.out.println("The array elements are as follows : ");

        for(int i = 0;i<arrLim;i++){
            System.out.print("\t"+arr1[i]);
        }

        //checking even odd and appending into arrays
        System.out.println("\nChecking even or odd : ");
        //initializing the indexes for the even and odd elements array
        curEven = 0;
        curOdd = 0;
        for(int i = 0;i<arrLim;i++){
            if(arr1[i]%2==0){ //condition check for even number
                evenArr[curEven] = arr1[i];
                curEven++;
            }
            else{
                oddArr[curOdd] = arr1[i];
                curOdd++;
            }
        }
        System.out.println("\nEven element array : \n");
        for(int i = 0;i<curEven;i++){
            System.out.print("\t"+evenArr[i]);
        }
        System.out.println("\nOdd element array : \n");
        for(int i = 0;i<curOdd;i++){
            System.out.print("\t"+oddArr[i]);
        }
    }
}
