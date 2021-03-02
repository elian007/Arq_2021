
package Model;

/**
 *
 * @author elian
 */
public class Solo {
    
    public double calculoFosforo(double solo, String textura, double teor){
        double ideal;
        double soloCorrigido;
        
        if("Argiloso".equals(textura)){
            ideal = 9.0;
        }
        if("Textura Média".equals(textura)){
            ideal = 12.0;
        }
        
        if(teor > 0.01){
            return soloCorrigido = teor;
        }
        return solo;
    }
    
     public double calculoPotassio(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
     
      public double calculoCalcio(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
       public double calculomagnesio(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
        public double calculoEnxofre(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
         public double calculoAluminio(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
          public double calculoHmaisAL(double solo, double ideal){
        double resultado = 0;
        
        return resultado;
    }
}
