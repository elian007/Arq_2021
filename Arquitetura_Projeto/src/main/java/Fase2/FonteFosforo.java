
package Fase2;

public class FonteFosforo {

    public double valorFosforo(int fonte) {

        switch (fonte) {
            case 1:
                return 18.0;
            case 2:
                return 41.0;
            case 3:
                return 48.0;
            case 4:
                return 45.0;
            case 5:
                return 18.0;
            case 6:
                return 33.0;    
            case 7:
                return 29.0;    
            case 8:
                return 32.0;
            case 9:
                return 24.0;
            case 10:
                return 18.5;
            case 11:
                return 52.0;
            case 12:
                return 18.0;
        }
        return 0;
    }

     public double valorCalcio(int fonte) {

        switch (fonte) {
            case 1:
                return 0.28;
            case 2:
                return 0.2;
            case 3:
                return 0.09;
            case 4:
                return 0.16;
            case 5:
                return 0.28;
            case 6:
                return 0.52;    
            case 7:
                return 0.52;    
            case 8:
                return 0.45;
            case 9:
                return 0.28;
            case 10:
                return 0.44;
            case 11:
                return 0.0;
            case 12:
                return 0.18;
        }
        return 0;
    }
}
