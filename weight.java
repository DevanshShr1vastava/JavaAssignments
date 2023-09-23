// 1. Write a Java Program for Method returning an Object and Object as a Parameter to Method. Consider following scenario.
// Write one Weight class which has Kilogram and gram as a Data members.
// Through getData() input the Kilogram and Gram value,
// putData() method will show the Kilogram and Gram Values and 
// sumWeight Will return the weight object and has the two Weight objects as a Parameters. In sumWeight() method we will sum the two objects weights.
// (Convert summation into appropriate Kilogram and Gram)

public class weight{
    int Kilogram;
    int gram;
    
    public weight(){
            Kilogram = 0;
            gram = 0;
        }

    public void getData(int kg,int g){
        if(g>999){
            gram = g%1000;
            Kilogram = kg + (g/1000);
        } 
        else{
            gram = g;
            Kilogram = kg;
        }
    }

    public void putData(){
        System.out.println(Kilogram+" kg "+gram+" grams ");
    }

    public static weight sumWeight(weight w1,weight w2){
        weight sumW = new weight();
        int sumKg = w1.Kilogram + w2.Kilogram;
        int sumG = w1.gram + w2.gram;
        sumW.getData(sumKg,sumG);
        return sumW; 
    }

    public static void main(String args[]){

        weight w1 = new weight();
        weight w2 = new weight();
        
        w1.getData(15, 700);
        System.out.println("The weight of the first object is : ");
        w1.putData();
        w2.getData(89, 800);
        System.out.println("The weight of the second object is : ");
        w2.putData();
        System.out.println("The sum of the weights of the two objects is : ");
        weight sumOf = sumWeight(w1,w2);
        sumOf.putData();
    }
}
    
