/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import JavaProgram.Calculator;
import static junit.Calculator_JUnit.addTest;
import static junit.Calculator_JUnit.mulTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JavaTest_Cases {
    
   Calculator  a = null;
    
    @Before
    public void setUp() {
        a = new Calculator();
    }
    
    @After
    public void tearDown() {
        a=null;
    }
    
    @Test
    public void testAdd()
    {
        double v1=10;
        double v2=20;
        double actualResult=0; 
        double expectedResult=30;
        
        try {
            actualResult = a.add(v1, v2);
        
        } catch (Exception e) {
            
        }
        assertEquals(expectedResult, actualResult,0);
    }
    
    @Test
    public void testAddLowerLimit_Value1(){
        double v1=-10000;
        double v2=20;
        String expectedMessage = "V1 out of bound";
        String actualMessage="";
        
        try{
        a.add(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    public void testAddUpperLimit_Value1(){
        double v1=10000;
        double v2=20;
        String expectedMessage = "V1 out of bound";
        String actualMessage="";
        
        try{
        a.add(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    public void testAddLowerLimit_Value2(){
        double v1=20;
        double v2=-10000;
        String expectedMessage = "V2 out of bound";
        String actualMessage="";
        
        try{
        a.add(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
     @Test
    public void testAddUpperLimit_Value2(){
        double v1=20;
        double v2=10000;
        String expectedMessage = "V2 out of bound";
        String actualMessage="";
        
        try{
        a.add(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
     @Test
    public void testAddResultLower(){
        double v1=9998;
        double v2=9999;
        String expectedMessage = "r out of bound";
        String actualMessage="";
        
        try{
        a.add(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testAddResultUpper(){
        double v1=-9999;
        double v2=-9999;
        String expectedMessage = "r out of bound";
        String actualMessage="";
        
        try{
        a.add(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    
    
    
    
    @Test
    public void testSub()
    {
        double v1=40;
         
        double v2=10;
        double actualResult=0; 
        double expectedResult=30;
        
        try {
            actualResult = a.sub(v1, v2);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(expectedResult, actualResult,0);
    }
    
      @Test
    public void testSubLowerLimit_Value1(){
        double v1=-10000;
        double v2=20;
        String expectedMessage = "V1 out of bound";
        String actualMessage="";
        
        try{
        a.sub(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    public void testSubUpperLimit_Value1(){
        double v1=10000;
        double v2=20;
        String expectedMessage = "V1 out of bound";
        String actualMessage="";
        
        try{
        a.sub(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    public void testSubLowerLimit_Value2(){
        double v1=20;
        double v2=-10000;
        String expectedMessage = "V2 out of bound";
        String actualMessage="";
        
        try{
        a.sub(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
     @Test
    public void testSubUpperLimit_Value2(){
        double v1=20;
        double v2=10000;
        String expectedMessage = "V2 out of bound";
        String actualMessage="";
        
        try{
        a.sub(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
      @Test
    public void testSubResultLower(){
        double v1=9998;
        double v2=-9999;
        String expectedMessage = "r out of bound";
        String actualMessage="";
        
        try{
        a.sub(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testSubResultUpper(){
        double v1=-9999;
        double v2=9999;
        String expectedMessage = "r out of bound";
        String actualMessage="";
        
        try{
        a.sub(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    
    
    
    @Test
    public void testMul()
    {
        double v1=10;
        double v2=20;
        double actualResult=0; 
        double expectedResult=200;
        
        try {
            actualResult = a.mul(v1, v2);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(expectedResult, actualResult,0);
    }
    
      @Test
    public void testMulLowerLimit_Value1(){
        double v1=-10000;
        double v2=20;
        String expectedMessage = "V1 out of bound";
        String actualMessage="";
        
        try{
        a.mul(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    public void testMulUpperLimit_Value1(){
        double v1=10000;
        double v2=20;
        String expectedMessage = "V1 out of bound";
        String actualMessage="";
        
        try{
        a.mul(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    public void testMulLowerLimit_Value2(){
        double v1=20;
        double v2=-10000;
        String expectedMessage = "V2 out of bound";
        String actualMessage="";
        
        try{
        a.mul(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
     @Test
    public void testMulUpperLimit_Value2(){
        double v1=20;
        double v2=10000;
        String expectedMessage = "V2 out of bound";
        String actualMessage="";
        
        try{
        a.mul(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
      @Test
    public void testMulResultLower(){
        double v1=9998;
        double v2=9999;
        String expectedMessage = "r out of bound";
        String actualMessage="";
        
        try{
        a.mul(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testMulResultUpper(){
        double v1=-9999;
        double v2=-9999;
        String expectedMessage = "r out of bound";
        String actualMessage="";
        
        try{
        a.mul(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    
    
    
    
    @Test
    public void testDiv()
    {
        double v1=20;
        double v2=10;
        double actualResult=0; 
        double expectedResult=2;
        
        try {
            actualResult = a.div(v1, v2);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(expectedResult, actualResult,0);
    }
 
      @Test
    public void testDivLowerLimit_Value1(){
        double v1=-10000;
        double v2=20;
        String expectedMessage = "V1 out of bound";
        String actualMessage="";
        
        try{
        a.div(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    public void testDivUpperLimit_Value1(){
        double v1=10000;
        double v2=20;
        String expectedMessage = "V1 out of bound";
        String actualMessage="";
        
        try{
        a.div(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    public void testDivLowerLimit_Value2(){
        double v1=20;
        double v2=-10000;
        String expectedMessage = "V2 out of bound";
        String actualMessage="";
        
        try{
        a.div(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
     @Test
    public void testDivUpperLimit_Value2(){
        double v1=20;
        double v2=10000;
        String expectedMessage = "V2 out of bound";
        String actualMessage="";
        
        try{
        a.div(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
      @Test
    public void testDivResultLower(){
        double v1=-1000;
        double v2=0.1;
        String expectedMessage = "r out of bound";
        String actualMessage="";
        
        try{
        a.div(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    @Test
    public void testDivResultUpper(){
        double v1=1000;
        double v2=0.1;
        String expectedMessage = "r out of bound";
        String actualMessage="";
        
        try{
        a.div(v1,v2);
        
        }catch(Exception e){
           actualMessage=e.getMessage();
        }
        assertEquals(expectedMessage, actualMessage);
    }
    
    
    
}
