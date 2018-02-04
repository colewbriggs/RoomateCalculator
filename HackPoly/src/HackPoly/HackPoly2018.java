
package HackPoly;

import java.util.*;
import javafx.util.Pair;
import java.text.*;

public class HackPoly2018 {

    public static void main(String[] args) {
        //Variables
        double water = 0.0, electricity = 0.0, gas = 0.0, internet = 0.0, trash = 0.0, totalUtil = 0.0;
        int test = 0;
        String person = null;
        //ask user how many roomates are paying rent 
        Scanner scan = new Scanner(System.in);
        int people = getPeople(scan,"Enter number of room mates: ");
        //create array for people in households
        List<Pair<String, Integer>> namesRent = new ArrayList<Pair<String, Integer>>();
        int Bills [];
        Bills = new int[people];
        String People [];
        People = new String[people];  
        boolean list = false;
while(list == false)
    {
        if (test < people){
        System.out.print("Enter name: ");
        if (scan.hasNextLine()) {
        person = scan.nextLine();
        }
        else {
        System.out.print("Enter a valid name");
        }
        System.out.print("Enter Rent: ");
            if (scan.hasNextInt()){
            int rent = scan.nextInt();
            namesRent.add(new Pair<String, Integer>(person, rent));
            test++;
            list = false;
            }else{
                System.out.println("Please enter a valid number: ");
            }
        } else {
            list = true;
        }  
        scan.nextLine();    
}
    for (int i = 0; i < namesRent.size(); i++) {
    Pair pair = namesRent.get(i);
    People[i] = (String)pair.getKey();
    Bills[i] = (int)pair.getValue();
}
    System.out.println("Enter in the following Bills: ");
	water = getWater(scan, "Water Amount");
	gas = getGas(scan, "Gas Amount");
	electricity = getElectricity(scan, "Electricity Amount");
	internet = getInternet(scan, "Internet Amount");
	trash = getTrash(scan, "Trash Amount");
	
	totalUtil = water + electricity + gas + internet + trash; 
	totalUtil = totalUtil / people; 
	
	for(int i=0; i < People.length; i++) {
		System.out.println(People[i] +" Owes: " + (Bills[i] + totalUtil));
	}
 }

public static int getPeople(Scanner scan, String prompt) 
  {
            int people = 0;
            boolean isvalid = false;
            while(isvalid==false){
                System.out.print(prompt);
                if (scan.hasNextInt()){
                    people = scan.nextInt();
                    isvalid = true;
                }
                else 
                {
                    System.out.println("Please enter a valid number: ");
                }
                scan.nextLine(); //discard other data received on the line 
                              
            }   
return people;

}

public static int getWater(Scanner scan, String prompt)
	{
		int amount = 0;
		boolean valid = false;
		while (valid == false) 
		{
			System.out.println(prompt);
			if(scan.hasNextInt()) {
				
				amount = scan.nextInt();
				valid = true;
			} else 
			{
				System.out.println("Must be numeric, please reenter");
				scan.nextLine();
			}
			
	}
		return amount;
}

public static int getGas(Scanner scan, String prompt)
{
	int amount = 0;
	boolean valid = false;
	while (valid == false) 
	{
		System.out.println(prompt);
		if(scan.hasNextInt()) {
			
			amount = scan.nextInt();
			valid = true;
		} else 
		{
			System.out.println("Must be numeric, please reenter");
			scan.nextLine();
		}
		
}
	return amount;
}

public static int getElectricity(Scanner scan, String prompt)
{
	int amount = 0;
	boolean valid = false;
	while (valid == false) 
	{
		System.out.println(prompt);
		if(scan.hasNextInt()) {
			
			amount = scan.nextInt();
			valid = true;
		} else 
		{
			System.out.println("Must be numeric, please reenter");
			scan.nextLine();
		}
		
}
	return amount;
}

public static int getInternet(Scanner scan, String prompt)


{
	int amount = 0;
	boolean valid = false;
	while (valid == false) 
	{
		System.out.println(prompt);
		if(scan.hasNextInt()) {
			
			amount = scan.nextInt();
			valid = true;
		} else 
		{
			System.out.println("Must be numeric, please reenter");
			scan.nextLine();
		}
		
}
	return amount;
}

public static int getTrash(Scanner scan, String prompt)
{
	int amount = 0;
	boolean valid = false;
	while (valid == false) 
	{
		System.out.println(prompt);
		if(scan.hasNextInt()) {
			
			amount = scan.nextInt();
			valid = true;
		} else 
		{
			System.out.println("Must be numeric, please reenter");
			scan.nextLine();
		}
		
}
	return amount;
}

} // End of class

  
  
    
