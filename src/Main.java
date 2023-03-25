public class Main {
    public static void main(String[] args) {

        System.out.println("Esto es una prueba de la clase Calculadora");
       Calculadora calculadora=new Calculadora();
        if(calculadora.multiplicar(80,3)==240){
            System.out.println("El resultado de multiplicar 80 por 3 da 240");
        }else{
            System.out.println("La prueba dio mal");
        }
        if(calculadora.dividir(calculadora.sumar(150,180),3 )==110){
            System.out.println("El resultado de sumar 150 y 180, dividido por 3, da 110");
        }else{
            System.out.println("La prueba dio mal");
        }
        if(calculadora.multiplicar(calculadora.restar(80,50),15)!=605){
            System.out.println("El resultado de restar 80 y 50, multiplicado por 15, no da 605");
        }else{
            System.out.println("La prueba dio mal");
        }
        if(calculadora.multiplicar(calculadora.sumar(70,40),25 )!=2700){
            System.out.println("El resultado de sumar 70 y 40, multiplicador por 25, no da 2700");
        }else{
            System.out.println("La prueba dio mal");
        }
    }
}