public class Simpleinterest{
    public static void main(String args[]){
        interest interest1= new interest();
        interest1.calculate();

    }
    
    
}
//class to calculate simple interest

class interest{
    public void calculate(){
        float principle=100000,rate=5,time=5,simpleinterest;
        simpleinterest=(principle*rate*time)/100;
        System.out.println("simple interest for Bob After 5 years is"+simpleinterest);
    }
}