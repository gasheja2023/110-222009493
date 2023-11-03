public class compoundInterest
 {
   public double Interest(double p, double r, double t)
   {
        return (p*(1+(r/100)/12)*t);
   }
        public static void main(String args[])
        {
            compoundInterest gg= new compoundInterest();
            double pr=500;
            double rt=18;
            double tm=3;
            double result=gg.Interest(pr,rt,tm);
            System.out.println("+compound interest is"+result);
        }

    }

