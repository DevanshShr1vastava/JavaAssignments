class weightInClass{
    int kilogram, gram;
    public void getdata(int kilo, int gram)
    {
        kilogram = kilo;
        this.gram = gram; 
    }

    public void putdata(){
        System.out.println("Kilogram : "+kilogram+" gram : "+gram);
    }

    public static weightInClass sumWeight(weightInClass w1,weightInClass w2){
        weightInClass sumW = new weightInClass();
        int sumKg = w1.kilogram + w2.kilogram;
        int sumG = w1.gram + w2.gram;
        sumW.getdata((sumKg + sumG/1000), (sumG%1000));

        return sumW;
    }

    public static void main(String args[]){
        weightInClass ob1 = new weightInClass();
        weightInClass ob2 = new weightInClass();

        ob1.getdata(5, 650);
        ob2.getdata(22, 825);

        ob1.putdata();
        ob2.putdata();

        weightInClass obSum = sumWeight(ob1, ob2);
        obSum.putdata();

    }
}