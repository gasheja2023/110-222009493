//Define a class with a method to add two numbers class Adder{
class Adder{
    public int add(int num1, int num2){
        return num1 + num2;
    }
}
class main{
    public static void main(String args[]){
        // create instance of the Adder class
        Adder myadder= new Adder();
        //use the add method to add two numbers
        int result = myadder.add(5, 3);
        System.out.println("Result: "+ result);//Output: 
    }
 } 