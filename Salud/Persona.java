package Salud;

import java.util.*;

public class Persona {

    private String tipoDoc,nombre,apellido,sexo;
    private double peso,estatura,pesoActual;
    private int edad,documento;

    Scanner sc = new Scanner(System.in);

    public Persona(){}

    public Persona(String tipoDoc, String nombre, String apellido, String sexo, double peso, double estatura, double pesoActual,int documento, int edad){

        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
        this.pesoActual = pesoActual;
        this.edad = edad;
        this.documento = documento;

    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public void pedirDatos()
    { 
        System.out.print("Ingrese el tipo de documento");
        tipoDoc = sc.next();
        System.out.print("Ingrese el numero de documento");
        documento = sc.nextInt();
        System.out.print("ingrese el nombre");
        nombre = sc.next();
        System.out.print("Ingrese el apellido");
        apellido = sc.next();
        System.out.print("Ingrese el peso en kg");
        peso = sc.nextDouble();
        System.out.print("Ingrese la estatura en m");
        estatura = sc.nextDouble();
        System.out.print("Ingrese la edad");
        edad = sc.nextInt();
        System.out.print("Ingrese el sexo");
        sexo = sc.next();
    }

    public void mostrarPersona()
    {
        System.out.print("Tipo de documento: " + tipoDoc);
        System.out.print("Numero documento: " + documento);
        System.out.print("Nombre: " + nombre);
        System.out.print("Apellido: " + apellido);
        System.out.print("Peso: " + peso);
        System.out.print("Estatura: " + estatura);
        System.out.print("Edad: " + edad);
        System.out.print("Sexo: " + sexo);
    }

    public double calcularImc()
    {
        System.out.println("IMC");

        pesoActual = peso / (Math.pow(estatura, 2));

        return pesoActual;
    }

    public void mayorEdad() 
    {
        if (edad <= 0)
        {
            System.out.print("Valor incorrecto");
        }
        else if (edad >= 18)
        {
            System.out.print("Es mayor de edad");
        }
        else
        {
            System.out.print("Es menor de edad");
        }
    }


}
