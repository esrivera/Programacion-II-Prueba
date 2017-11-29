/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.Scanner;

/**
 *
 * @author Labs-DECC
 */
public class Student {
    
    private float nota1;
    private float nota2;
    private float nota3;
    private String nombreEstudiante;
    private String nombreMateria;
    
    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }  
  
    public void leerdatos ()
    {
        float promedio;
        int contador = 0;
        Scanner sc=new Scanner (System.in);
        System.out.print("\nIngrese el Nombre del Estudiante:  ");
        nombreEstudiante = sc.nextLine();
        for(int i=1; i<=3; i++)
        {
            Scanner sb=new Scanner (System.in);
            System.out.print("Nombre de la materia "+i+": ");
            nombreMateria=sb.nextLine();
            System.out.print("Ingrese nota 1: ");
            setNota1(sc.nextFloat());
            System.out.print("Ingrese nota 2: ");
            setNota2(sc.nextFloat());
            System.out.print("Ingrese nota 3: ");
            setNota3(sc.nextFloat());
            promedio=promedioEstudiante(getNota1(),getNota2(),getNota3());
            System.out.println("***RESULTADO***\n");
            System.out.println(""+aprobar(promedio));
            if(aprobar(promedio) == "El estudiante reprobo la materia\n" ){
                contador++;
            }
        }
        if(contador>=2){
            System.out.println("ESTADO DEL ESTUDIANTE");
            System.out.println("El estudiante pierde el semestre");
            }
    }
    
    public float promedioEstudiante(float nota1,float nota2,float nota3){
        float promedio;
        promedio = (nota1+nota2+nota3)/3;
        return promedio;
    }
      
    public String aprobar(float promedio)
    {
        String estado = null;           
        if(promedio>=14 && promedio<21){
            estado="El estudiante aprobo la materia\n";
        }      
        else{
            if(promedio>=12 && promedio<14){
                estado="El estudinate debe rendir un examen de recuperacion\n";
            }
            else{
                estado="El estudiante reprobo la materia\n";
            }               
         }
        return estado;
    }
}
