/**
 * @author Matt Holdorf
 * 
 */

package Holdorf_Matthew;
public class Exercises
{
	public static int threeAndFive()
	{
		double sum3=(.5)*(333)*(999+3);
		double sum5=(.5)*(199)*(995+5);
		double sum15=(.5)*(66)*(990+15);
		
		return (int)(sum3+sum5-sum15);
	}
	
	public static int evenFibSum()
	{
		int sum=0;
		int previous=0;
		int prevprev=1;
		int current=0;
		
		while(current<4000000)
		{
			current=prevprev+previous;
			prevprev=previous;
			previous=current;
			
			if (current % 2 == 0)
				sum+=current;
		}
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		long maxPrime=-1;
		long n = 600851475143L; 
		
		while (n % 2 == 0)
		{ 
            maxPrime = 2; 
            n=n/2;
        } 
		
		for (int i = 3; i <= Math.sqrt(n); i += 2)
		{ 
            while (n % i == 0)
            { 
                maxPrime = i; 
                n = n / i; 
            } 
        } 
		
		if (n > 2) 
            maxPrime = n; 
  
        return (int) maxPrime; 
	}
}
