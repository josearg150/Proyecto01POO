/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131273_proyecto_01;


import java.util.Random;

/**
 *
 * @author Jose angel
 */
 class ArregloCircuitos {
     //Atributos
     private Circuito []datos ;
     //Constructores
     //por defecto
     public ArregloCircuitos(){
         datos = new Circuito[5];
         for(int i=0;i<datos.length;i++){
             datos[i]= new Circuito();
         }
       }
     //Tamaño especificado por usuario
     public ArregloCircuitos(int n){
         datos = new Circuito[n];
          for(int i=0;i<datos.length;i++){
             datos[i]= new Circuito();
         }
     }
     //toString
     public String toString(){
        String cad = "{";
        for(int i=0; i<datos.length; i++){
            cad = cad + datos[i]+"";
            if(i < datos.length-1)
                 cad =cad + ",";
        }
         cad = cad + "}";
         return cad;
    }
    //Métodos get/set
    public int getTamaño(){
        return datos.length;
    }
    //obtener circuito de arreglo
    public Circuito getCircuito(int posicion){
        return datos[posicion];        
    }  
    //Establecer circuito en el arreglo
    public void setCircuito(Circuito c, int posicion){
        datos[posicion] = c;
    }
    //Métodos de ordenamiento
    public String mayor(){
        for (int i = 0; i < datos.length-1; i++) 
            for (int j = i+1; j < datos.length; j++)
                if(datos[i].calcularImpedancia() > datos[j].calcularImpedancia()){
                    Circuito aux = datos[i];
                    datos[i] = datos[j];
                    datos[j] = aux;
        }
        
        return datos[datos.length-1].getNombre();
    }
    public String menor(){
         for (int i = 0; i < datos.length-1; i++) 
            for (int j = i+1; j < datos.length; j++)
                if(datos[i].calcularImpedancia() > datos[j].calcularImpedancia()){
                    Circuito aux = datos[i];
                    datos[i] = datos[j];
                    datos[j] = aux;
        }
         return datos[0].getNombre();
    }
    public void ordenarAlfabetico(){
        for (int i = 0; i < datos.length-1; i++) 
            for (int j = i+1; j < datos.length; j++)
                if(datos[i].getNombre().compareTo(datos[j].getNombre()) > 0){
                    Circuito aux = datos[i];
                    datos[i] = datos[j];
                    datos[j] = aux;
                }
    }
    public void impedanciaDescendente(){
        for (int i = 0; i < datos.length-1; i++) 
            for (int j = i+1; j < datos.length; j++)
                if(datos[i].calcularImpedancia() > datos[j].calcularImpedancia()){
                    Circuito aux = datos[i];
                    datos[i] = datos[j];
                    datos[j] = aux;
        }
    }
    //Metodos aleatorios
    public String nombreAleatorio(){
        Random azar = new Random();
        String []nombres = {"XSD","DE","FG","SS","E34-","E32-","DF","LKF","DSCF-","ASV","DAQE","CV0-",
                                    "ABR","4GD","LGF","FGG","FF5-","GPT","LS","MBB","DF-E","E-","AS43-"};
        
        return nombres[azar.nextInt(nombres.length)] + String.valueOf(azar.nextInt(10) )  + String.valueOf(azar.nextInt(10) );
    }
    public double valorAleatorio(){
        Random azar = new Random();
        
        return 20+azar.nextInt(1001);
    }
 }
     

 