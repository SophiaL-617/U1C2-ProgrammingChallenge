public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        return (t1+t2+t3+t4)/4;
    }

    public int roundAverage(double average) {
        return (int) (average+0.5);
    }

    public boolean isPassing(int roundedAverage) {
        return (roundedAverage>=65);
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        return shares*price;
    }


    public int roundValueChange(double totalStock) {
        return (int) (Math.round(totalStock));
    }

    /*
    Problem 3: Digit Incrementer 
    */
   //mildly less worst program in existence i think
    public double addDigit(double number, double digits) {
        number -= number % (digits);
        number += ((digits));
        return (number % (digits*10));
    }

    public double adjustDigits(double userDouble) {
        double newDouble = 0;
        for (double i=10; i<10000; i*=10) {
            newDouble += addDigit((userDouble%i), i/10);
        }
        int tenths = (int) (((userDouble % 1) * 10) + 1)%10;
        int hundreths = (int) (((userDouble % 0.1) * 10) + 1)%10;
        newDouble += tenths/10.0 + hundreths/100.0;
        return newDouble;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
