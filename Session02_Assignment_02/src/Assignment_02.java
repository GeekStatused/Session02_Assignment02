
public class Assignment_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
        
       
        //this is what loops through the numbers 
        for(int i=2; i < 100; i++){
               
        	
                boolean aPrime = true;
               
                //this is the loop that will check to see if the number is a prime number
                for(int j=2; j < i ; j++){
                       
                	//this is what determines if the number has a divisor
                	//if it does then it skips it and continues to the next number
                        if(i % j == 0){
                                aPrime = false;
                                continue;
                        }
                }
                
                // this will print the number and show the prime numbers
                if(aPrime)
                        System.out.println(i);
                
           
        }
	}

}
