package co.com.ceiba.calculadora;

/**
 * Created by ana.franco on 19/10/2015.
 */
public enum Romano {
    I, V, X, L, C, D, M;

    public Romano next(){
        switch (this){
            case I: return V;
            case V: return X;
            case X: return L;
            case L: return C;
            case C: return D;
            case D: return M;
            case M: return null;
            default: return null;
        }
    }

    public Romano prev(){
        switch (this){
            case I: return null;
            case V: return I;
            case X: return V;
            case L: return X;
            case C: return L;
            case D: return C;
            case M: return D;
            default: return null;
        }
    }
    
    public static Romano toRomano(char num){
        switch (num){
            case 'I': return I;
            case 'V': return V;
            case 'X': return X;
            case 'L': return L;
            case 'C': return C;
            case 'D': return D;
            case 'M': return M;
            default: return null;
        }
            
    }

    public Boolean esUnidadMedia() {
        switch (this){
            case I: case X: case C: case M: return Boolean.FALSE;
            case V: case L: case D: return Boolean.TRUE;
            default: return null;
        }
    }

    public Boolean esPrevio(Romano romano){
        Romano previo = this.prev();

        while(previo != null){
            if(previo.equals(romano)) return true;
            previo = previo.prev();
        }
        return false;
    }
}
