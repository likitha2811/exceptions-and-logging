package com.epam.mavendemo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{ private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
	LOGGER.warn("Simple and Compound Interest");
	LOGGER.info("Simple Interest is : " + findSimpleInterest(1000,2,5));
	LOGGER.debug("Compound Interest yearly is : " + findCompoundInterest(1500,2,5,true));
	LOGGER.error("Compound Interest half yearly is : " + findCompoundInterest(1600,3,4,false));
    
    	LOGGER.fatal("House Construction Cost");
    	LOGGER.warn("The cost for the construction is:  Rs " + estimateCost("standardMaterial", 300.0, false));
    	LOGGER.debug("The cost for the construction is:  Rs" + estimateCost("aboveStandardMaterial", 100.0, false));
    	LOGGER.error("The cost for the construction is:   Rs" + estimateCost("highStandardMaterial", 150.0, false));
    	LOGGER.info("The cost for the construction is:  Rs" + estimateCost("highStandardMaterial", 200.0, true));
    
}


public static double estimateCost(String material, double area, boolean fullyAutomated) {
// TODO Auto-generated method stub
if(material.equals("standardMaterial") && fullyAutomated == false)
{
return 1200*area;
}
else if(material.equals("aboveStandardMaterial") && fullyAutomated == false)
{
return 1500*area;
}
else if(material.equals("highStandardMaterial") && fullyAutomated == false)
{
return 1800*area;
}
else
{
return 2500*area;
}
}


 
       public static double findSimpleInterest(double Principle,double time,double rate)
       {
      return (Principle*time*rate)/100;
       }
       public static  double findCompoundInterest(double Principle,double time,double rate,boolean yearly)
       {
      if(yearly)
      {
      return Principle*(Math.pow(1+(rate/100),time)-1);
     
      }
      else
      {
      return Principle*(Math.pow(1+((rate/2)/100),2*time)-1);
      }
       }
	public static String findSimpleInterest(int principle, int time, int rate) {
		// TODO Auto-generated method stub
		return null;
	}
			}
