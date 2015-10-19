package co.com.ceiba.calculadora;

/**
 * Created by ana.franco on 19/10/2015.
 */
public class Calculadora {


    public String sumar(String numero1, String numero2) {

        String numeroConvertido1 = this.convertirRestasASumas(numero1);
        String numeroConvertido2 = this.convertirRestasASumas(numero2);



        //Cantidad de I

        int cantidadI = 0;
        if(numero1.contains(Romano.I.toString())) {
            cantidadI = (numero1.lastIndexOf(Romano.I.toString()) - numero1.indexOf(Romano.I.toString()))+1;
        }
        if(numero2.contains(Romano.I.toString())){
            cantidadI += (numero2.lastIndexOf(Romano.I.toString())- numero2.indexOf(Romano.I.toString()))+1;
        }

        int cantidadV = 0;
        if(numero1.contains(Romano.V.toString())) {
            cantidadV = (numero1.lastIndexOf(Romano.V.toString()) - numero1.indexOf(Romano.V.toString()))+1;
        }
        if(numero2.contains(Romano.V.toString())){
            cantidadV += (numero2.lastIndexOf(Romano.V.toString())- numero2.indexOf(Romano.V.toString()))+1;
        }

        String resultado = "";
        String resultadoParcial= "";
        if(cantidadI <=3){
            resultadoParcial = numero1 + numero2;
        }
        else if(cantidadI == 4){
            resultadoParcial = Romano.I.toString() + Romano.I.next().toString();
        }
        else if(cantidadI == 5){
            resultado = Romano.I.next().toString();
        }
        else if(cantidadI == 6){
            resultado = Romano.I.next().toString() + Romano.I.toString();
        }

        return resultado;
    }

    public String convertirRestasASumas(String numeroAConvertir) {
        String resultado = "";

        // de atras hacia inicio

        if(numeroAConvertir.length() > 1){
            for(int i = numeroAConvertir.length() - 1; i >= 0; i--){
                Romano romanoBase = Romano.toRomano(numeroAConvertir.charAt(i));
                Romano romanoAnterior = Romano.toRomano(numeroAConvertir.charAt(i - 1));

                if(romanoBase.esPrevio(romanoAnterior)){
                    if(romanoBase.esUnidadMedia()){
                        convertir(pedazoAnterior) + romanoAnterior+ romanoAnterior+ romanoAnterior+ romanoAnterior;
                    }
                    else{
                        convertir(pedazoAnterior) + romanoAnterior.next() + romanoAnterior + romanoAnterior+ romanoAnterior+ romanoAnterior;
                    }
                }
            }
        }
        else{
            return numeroAConvertir;
        }


        if(numeroAConvertir.contains(Romano.I.toString())
                && numeroAConvertir.lastIndexOf(Romano.I.toString())<numeroAConvertir.length()-1){
            char numeroARestar = numeroAConvertir.charAt(numeroAConvertir.lastIndexOf(Romano.I.toString()) + 1);
            resultado = Romano.toRomano(numeroARestar).prev().toString() +
                    Romano.I.toString() + Romano.I.toString() + Romano.I.toString();
        }
        return resultado;
    }

    
}
