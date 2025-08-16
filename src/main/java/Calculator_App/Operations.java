package Calculator_App;

public class Operations {
    public double addition(double num1, double num2){
        return num1+num2;
    }

    public double subtraction(double num1, double num2){
        return num1-num2;
    }

    public double multiplication(double num1, double num2){
        return num1*num2;
    }

    public double division(double num1, double num2){
        return num1/num2;
    }

    public int average(){
        int sum=0;
        for(int i=0; i<10; i++){
            sum+= (int)((Math.random()*50)+50);
        }
        return sum/10;
    }

}
