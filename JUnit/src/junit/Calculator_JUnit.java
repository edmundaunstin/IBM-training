
package junit;

import JavaProgram.Calculator;


public class Calculator_JUnit {
        static Calculator a; 
        static double actualResult; 
        static double expectedResult=30;
        static String actualMessage;
        static String expectedMessage = "V1 out of bound" ;
    
    public static void main(String[] args) {
        a = new Calculator();
        try {
            actualResult = a.add(100, 20000);
        addTest(actualResult);
        } catch (Exception e) {
            actualMessage = e.getMessage();
            if(actualMessage.equals(expectedMessage)){
                System.out.println("V1 out of exception is working");
            }
            else{
                System.out.println("V1 out of exception is not working");
            }
        }
        
        try{
        actualResult = a.sub(40000, 10);
        subTest(actualResult);
        } catch(Exception e){
            actualMessage = e.getMessage();
            if(actualMessage.equals(expectedMessage)){
                System.out.println("V1 out of exception is working");
            }
            else{
                System.out.println("V1 out of exception is not working");
            }
        }
        
        try{
        actualResult = a.mul(10000, 3);
        mulTest(actualResult);
        }catch(Exception e){
            actualMessage = e.getMessage();
            if(actualMessage.equals(expectedMessage)){
                System.out.println("V1 out of exception is working");
            }
            else{
                System.out.println("V1 out of exception is not working");
            }
        }
       
        try{
        actualResult = a.div(-300000, 10);
        divTest(actualResult);
        }catch(Exception e){
            actualMessage = e.getMessage();
            if(actualMessage.equals(expectedMessage)){
                System.out.println("V1 out of exception is working");
            }
            else{
                System.out.println("V1 out of exception is not working");
            }
        }
    }
    
    public static void addTest(double actualResult){
        if(expectedResult == actualResult){
            System.out.println("SUCCESSFULL>>>!!!!");
        }
        else
        {
            System.out.println("NOT SUCCESSFULL>>>!!!!");
        }
    }
    
     public static void subTest(double actualResult){
        if(expectedResult == actualResult){
            System.out.println("SUCCESSFULL>>>!!!!");
        }
        else
        {
            System.out.println("NOT SUCCESSFULL>>>!!!!");
        }
    }
     
      public static void mulTest(double actualResult){
        if(expectedResult == actualResult){
            System.out.println("SUCCESSFULL>>>!!!!");
        }
        else
        {
            System.out.println("NOT SUCCESSFULL>>>!!!!");
        }
    }
      
       public static void divTest(double actualResult){
        if(expectedResult == actualResult){
            System.out.println("SUCCESSFULL>>>!!!!");
        }
        else
        {
            System.out.println("NOT SUCCESSFULL>>>!!!!");
        }
    }
}
