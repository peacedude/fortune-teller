package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;
    
    int subSeven(int value){
    while(value>=10)
        value -= 7;
    return value;
    }
    
    int addTen(int value){
    while(value<0)
        value +=10;
    return value;
    }
    double divTen(double value){
        while(value<10)
            value /= 2;
        return value;
    }

    public int  calculateA() {
        MagicNumbers matte = new MagicNumbers();
        int spaces = name.length() - name.replace(" ", "").length() + 1;
        return matte.subSeven(spaces + age); 
    }

    public int calculateB() {
        MagicNumbers matte = new MagicNumbers();
        return matte.subSeven(location.length() + income);
    }

    public int calculateC() {
        MagicNumbers matte = new MagicNumbers();
        return matte.addTen(calculateA()+calculateB() - height);
    }

    public int calculateD() {
        MagicNumbers matte = new MagicNumbers();
        if(calculateA()>5)
            return matte.addTen(calculateA()+calculateB()-income);
        else
        return matte.addTen(calculateA()+calculateC() - income);
    }

    public int calculateE() {
        MagicNumbers matte = new MagicNumbers();
        long Calc1 = age*income;
        long multiply1 = Calc1*income;
        long multiply2 = multiply1*height;
        double Calc2 = (double)Math.sqrt(multiply2);
        while(Calc2>10)
            Calc2 /= 2;
        int Calc3 = (int)Math.round(Calc2);
        return Calc3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}