/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131273_proyecto_01;

/**
 *
 * @author Jose angel
 */
class Circuito {
    //Atributos de la clase circuito ////////////////////////////////////////////////////////////////////////////
    private String nombre;
    private double resistencia;
    private double reactanciaInductiva;
    private double reactanciaCapacitiva;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Constructores ///////////////////////////////////////////////////////////////////////////////////////////
    //Constructor por defecto
    public Circuito(){
        nombre = "NoID";
        resistencia = 0;
        reactanciaInductiva = 0;
        reactanciaCapacitiva = 0;
    }
    //Constructor con datos agregados por usuario al declarar objeto
    public Circuito(String nom, double resist, double reactI,double reactC){
        nombre = nom;
        resistencia = resist;
        reactanciaInductiva = reactI;
        reactanciaCapacitiva = reactC;
    }
    //Constructor para copiar objetos
    public Circuito(Circuito c){
        nombre = c.nombre;
        resistencia = c.resistencia;
        reactanciaInductiva = c.reactanciaInductiva;
        reactanciaCapacitiva = c.reactanciaCapacitiva;
    }
    public Circuito(int n){
        Circuito []c = new Circuito[n];
    
    } 
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Métodos get/set///////////////////////////////////////////////////////////////////////////////////////
    //Nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    //Metodos resistencia
    public double getResistencia(){
        return resistencia;
    }
    public void setResistencia(double resist){
        resistencia = resist;
    }
    //Métodos reactancia inductiva
    public double getReactanciaInductiva(){
        return reactanciaInductiva;
    }
    public void setReactanciaInductiva(double reactI){
        reactanciaInductiva = reactI;
    }
    //Métodos reactancia capacitiva
    public double getReactanciaCapacitiva(){
        return reactanciaCapacitiva;
    }
    public void setReactanciaCapacitiva(double reactC){
        reactanciaCapacitiva = reactC;
    }
    //toString
    @Override
    public String toString(){
        return "Los datos del circuito son: \nNombre: "+nombre+
                                                             "\nImpedancia: "+calcularImpedancia()+
                                                             "\nResistencia: "+resistencia+
                                                             "\nReactancia inductiva: "+reactanciaInductiva+
                                                             "\nReactancia capacitivia: "+reactanciaCapacitiva;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Métodos de calculo ////////////////////////////////////////////////////////////////////////////////////
    //Impedancia
    public double calcularImpedancia(){
        //La formula es Z= raiz (resistencia^2 + (Reactancia inductiva - reactancia capacitiva)^2)
        return  Math.sqrt(Math.pow(resistencia, 2) + Math.pow((reactanciaInductiva - reactanciaCapacitiva),2));
    }
   
}
