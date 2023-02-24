package basics;

public class Practis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="";
		String position = "";
		int years = 0 ;
		String employType = null ;
		int sallary=0;
		
		
		if(years>0 && years<2 && employType == "Permanat")
		{
			sallary = 200000;
		}else if(years>2 && years<5 && employType == "Permanat")
		{
			sallary = 300000;
		}
		else if(years>5 && employType == "Permanat")
		{
			sallary = 400000;
		}
		
		else {
			if(years>0 && years<2 && employType == "Contract")
			{
				sallary = 150000;
			}else if(years>2 && years<5 && employType == "Contract")
			{
				sallary = 250000;
			}
			else if(years>5 && employType == "Contract")
			{
				sallary = 300000;
			}
			
			if(years ==2 && employType == "Permanat")
			{
				System.out.println(sallary);
			}
			name="william";
			position = "permanat";
			years =2;
		}
	}

}
