/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ec.edu.espe.model.Student;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Labs-DECC
 */
public class SumaUnitTest {
    
    public SumaUnitTest() {
    }
    
    @Test
    public void testNegative(){
    float nota1;
    float nota2;
    float nota3;
    nota1=10.0f;
    nota2=10.0f;
    nota3=10.0f;
    Student suma=new Student();
    float expResult = 10.0f;
    float actualResult=suma.promedioEstudiante(nota1, nota2, nota3);
    assertEquals(expResult,actualResult);
    }
    
    @Test
    public void testPositive1(){
    float nota1;
    float nota2;
    float nota3;
    nota1=10.0f;
    nota2=10.0f;
    nota3=10.0f;
    Student suma=new Student();
    float expResult = 10.0f;
    float actualResult=suma.promedioEstudiante(nota1, nota2, nota3);
    assertEquals(expResult,actualResult);
    }
    
    @Test
    public void testPositive2(){
    float nota1;
    float nota2;
    float nota3;
    nota1=10.0f;
    nota2=10.0f;
    nota3=10.0f;
    Student suma=new Student();
    float expResult = 10.0f;
    float actualResult=suma.promedioEstudiante(nota1, nota2, nota3);
    assertEquals(expResult,actualResult);
    }
    
    @Test
    public void testNegative1(){
    float nota1;
    float nota2;
    float nota3;
    nota1=10.0f;
    nota2=10.0f;
    nota3=10.0f;
    Student suma=new Student();
    float expResult = 10.0f;
    float actualResult=suma.promedioEstudiante(nota1, nota2, nota3);
    assertEquals(expResult,actualResult);
    }
    
    @Test
    public void testPositive3(){
    float nota1;
    float nota2;
    float nota3;
    nota1=15.0f;
    nota2=15.0f;
    nota3=15.0f;
    Student suma=new Student();
    float expResult = 15.0f;
    float actualResult=suma.promedioEstudiante(nota1, nota2, nota3);
    assertEquals(expResult,actualResult);
    }
    
    @Test
    public void testPositive4(){
    float nota1;
    float nota2;
    float nota3;
    nota1=-10.0f;
    nota2=-10.0f;
    nota3=-10.0f;
    Student suma=new Student();
    float expResult = -10.0f;
    float actualResult=suma.promedioEstudiante(nota1, nota2, nota3);
    assertEquals(expResult,actualResult);
    }
    
    @Test
    public void testPositive5(){
    float nota1;
    float nota2;
    float nota3;
    nota1=10.0f;
    nota2=10.0f;
    nota3=10.0f;
    Student suma=new Student();
    float expResult = 10.0f;
    float actualResult=suma.promedioEstudiante(nota1, nota2, nota3);
    assertEquals(expResult,actualResult);
    }
    
    @Test
    public void testPositive6(){
    float nota1;
    float nota2;
    float nota3;
    nota1=10.0f;
    nota2=10.0f;
    nota3=10.0f;
    Student suma=new Student();
    float expResult = 10.0f;
    float actualResult=suma.promedioEstudiante(nota1, nota2, nota3);
    assertEquals(expResult,actualResult);
    }
    
    @Test
    public void testNegative3(){
    float nota1;
    float nota2;
    float nota3;
    nota1=10.0f;
    nota2=10.0f;
    nota3=10.0f;
    Student suma=new Student();
    float expResult = 10.0f;
    float actualResult=suma.promedioEstudiante(nota1, nota2, nota3);
    assertEquals(expResult,actualResult);
    }
    
    @Test
    public void testNegative4(){
    float nota1;
    float nota2;
    float nota3;
    nota1=10.0f;
    nota2=10.0f;
    nota3=10.0f;
    Student suma=new Student();
    float expResult = 10.0f;
    float actualResult=suma.promedioEstudiante(nota1, nota2, nota3);
    assertEquals(expResult,actualResult);
    }
}
