import java.util.Scanner;

public class FourthTypeFunction2 {

    static float m1(String country,int amt) {
  	  float res=0.0f;
  	  if(country.equalsIgnoreCase("USA")) {
  		  res = amt * 78.67f;
  	  }
  	  else if (country.equalsIgnoreCase("UK")) {
  		  res = amt * 120.56f;
  		 
  	  }
  	  else if (country.equalsIgnoreCase("UAE")) {
  		  res = amt * 20.56f;
  	  }
  	  return res;
    }
    static int getAmt() {
  	  return 100;
    }
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter country name:");
     String country=sc.next();
     String cC=getAmtDetails(country);
     System.out.println("enter amount in "+cC);
     if(cC.equalsIgnoreCase("Country NOT found!!!")) {
     System.out.println("not able to process...");     
	}
     else {
    	 int amt = sc.nextInt();
    	 System.out.println("For the country "+country+
    			 " the amt of "+amt+
    			 " = "+m1(country,amt)+" Indian rupees ");
     }
	}
	static String getAmtDetails(String country) {
		String res="";
	  	  if(country.equalsIgnoreCase("USA")) {
	  		  res="Dollar";
	  	  }
	  	  else if(country.equalsIgnoreCase("UK")) {
	  		  res="Pound";
	  	  }
	  	  else if(country.equalsIgnoreCase("UAE")) {
	  		  res="Dirams";
	  	  }
	  	  else {
	  		  res="country not found";
	  	  }
           return res;
	}
	
		
	}
	
	

