package JavaProgram;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = "welcome";
		//String s = new String("Welcome");
		//System.out.println(s);
		
		//1st Method = length()-length of the string(number of character)
		String s ="welcome";
		s.length();
		System.out.println(s.length());
		System.out.println("welcome".length());
		//2nd Method = concat() = joining string
		String s1="Welcome";
		String s2 =" to Java";
		String s3 =" Automation";
		
		System.out.println(s1+s2); //Welcome to Java
		System.out.println(s1.concat(s2));//Welcome to Java
		System.out.println(s1.concat(s2).concat(s3));//Welcome to Java Automation
        System.out.println(s1.concat(s2+s3));//Welcome to Java Automation
	
        //3rd method: trim()=remove spaces right and left side
        s="   Welcome   ";
        System.out.println(s);
        
        System.out.println("Before triming:" +s.length()); 
        System.out.println(s.trim()); 
        System.out.println("After trimming : " +s.trim().length()); 
		
        //4th Method: chatAt() =return a character from a string based on index
        //index starts from 0
        s="welcome";
        System.out.println(s.charAt(3)); //c
        System.out.println(s.charAt(0)); //w
        
        
        //5th method: contains() =
        s="welcome";
        System.out.println(s.contains("wel"));//true
        System.out.println(s.contains("come"));//true
        System.out.println(s.contains("Wel"));//false
        System.out.println(s.contains("Come"));//false
        System.out.println(s.contains("welme"));//false
        
        //equals(),equalIgnoreCase() --compare string
        s1="welcome";
        s2="welcome";
        
        System.out.println(s1==s2); //true
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equalsIgnoreCase("Welcome"));//true
        
        //https://www.youtube.com/watch?v=NN9A9g2gHqE&ab_channel=SDET-QA
        
        
        
        
        
        
        
        

	}

}
