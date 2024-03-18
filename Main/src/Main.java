import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,opcion,total;
        do {
            System.out.println("1.Suma");
            System.out.println("1.Resta");
            System.out.println("3.Division");
            System.out.println("4.Multiplicar");
            System.out.println("5.Salir");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el primer valor");
                    num1=sc.nextInt();
                    System.out.println("Ingrese el segundo valor");
                    num2=sc.nextInt();
                    total=num1+num2;
                    System.out.println("El resultado de la suma es "+total);
                    break;
                case 2:
                    System.out.println("Ingrese el primer valor");
                    num1=sc.nextInt();
                    System.out.println("Ingrese el segundo valor");
                    num2=sc.nextInt();
                    total=num1-num2;
                    System.out.println("El resultado de la resta es "+total);
                    break;

                case 3:
                    System.out.println("Ingrese el primer valor");
                    num1=sc.nextInt();
                    System.out.println("Ingrese el segundo valor");
                    num2=sc.nextInt();
                    total=num1/num2;
                    System.out.println("El resultado de la division es "+total);
                    break;
                case 4:
                    System.out.println("Ingrese el primer valor");
                    num1=sc.nextInt();
                    System.out.println("Ingrese el segundo valor");
                    num2=sc.nextInt();
                    total=num1*num2;
                    System.out.println("El resultado de la multiplicacion es "+total);
            }

        }while(opcion!=4);
        System.out.println("Opcion invalida");
    }
}