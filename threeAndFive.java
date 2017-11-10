//projecteuler.net problem one

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9, 10, 12, 15, 18, 21, 24, 25, 27, 30, 33, 36, 35. The sum of these multiples is 23.

//Find the sum of all the multiples of 3 or 5 below 1000.
public class threeAndFive {
    
    public static void main(String[] args) {
        
        int counterThree = 0;
        int counterFive = 0;
        for(int i = 0; i < 1000; i++){
            if(i%3 == 0){
                counterThree = i + counterThree;
                
            }
            else if(i%5 == 0)
            {
                counterFive += i;

            }

        }
    
        System.out.println(counterFive + counterThree);
    
    
}
}

//amerigroup primary care Dr. Yee 245 engle st suite 3 2015699005
//optometrist 18004288789 vision coverage
//18002382333
