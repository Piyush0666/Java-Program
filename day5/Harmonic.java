public class Harmonic
{

	public static void main(String args[])
	{
	double n=12;
        double i;
	double sum=0;
	
        if(n != 0){
	for( i=1;i<=n;i++)
	{
		sum=sum+(1/i);
	}
	System.out.println("Harmonic value = "+sum);
	}
else{
       System.out.println("n should not be equal to zero");
}
}
}