import java.util.Scanner;

public class assignment3 {
    public static void main(String args[]){
        //1. Write a Java Program to check the Array Elements are Prime or not and Print their result in Another Array
        
        int arrLim; //for the number of elements in the array
        int k; //flag variable for prime condition check
        int arr1[] = new int[100]; //initializing main array
        int primArr[] = new int[100]; //initializing prime result array
        Scanner sc = new Scanner(System.in); //creating scanner object
        System.out.println("Enter the number of elements you want to enter in the array : ");
        arrLim = sc.nextInt();
        //taking user input for number of elements and the elements to enter in the array
        System.out.println("Enter the elements for the array : ");

        for(int i = 0;i<arrLim;i++){
            arr1[i] = sc.nextInt(); 
        }

        //displaying the array elements as entered by the user
        System.out.println("The array elements are as follows : ");

        for(int i = 0;i<arrLim;i++){
            System.out.print("\t"+arr1[i]);
        }

        //checking prime condition
        for(int i = 0;i<arrLim;i++){
            k=0;
            if(arr1[i]==0||arr1[i]==1){ //since 1 and 0 are not prime numbers
                    k = 1;
                }
            else{
                for(int j = 2;j<=arr1[i]/2;j++){
                    //condition check for prime number
                    if(arr1[i]%j==0){
                        k = 1;
                        break;
                    }
                }
            }
            if(k==0){
                primArr[i] = 1;
            }
            else{
                primArr[i] = 0;
            }
        }

        System.out.println("\nPrime check array is : ");
        for(int i = 0;i<arrLim;i++){
            System.out.print("\t"+primArr[i]);
        }
        System.out.println("\nPrime check for elements in array :");
        for(int i = 0;i<arrLim;i++){
            if(primArr[i]==0){
                System.out.println((i+1)+" place element is not prime");
            }
            else{
                System.out.println((i+1)+" place element is prime");
            }
        }
    }
}
