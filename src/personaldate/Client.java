package personaldate;

import java.util.Scanner;

public class Client extends PersonalDate {
    private int saldo;
    
    public void actualizarDatos(){
        Scanner teclado=new Scanner(System.in);
        int op=1;
        while(op>0){
            System.out.println("Por favor indique el parametro a actualizar o 0 (cero) para salir");
            System.out.println("1. Nombre");
            System.out.println("2. Apellido");
            System.out.println("3. Edad");
            System.out.println("4. Numero de identificacion");
            System.out.println("5. Fecha de nacimiento");
            System.out.println("6. Direccion");
            System.out.println("7. Telefono");
            System.out.println("0. Salir");
            op=teclado.nextInt();
            switch (op){
                case 0:
                    System.out.println("Gracias..");
                    break;
                case 1:
                    System.out.println("Ingrese nombre: ");
                    String name=teclado.next();
                    setName(name);
                    break;
                case 2:
                    System.out.println("Ingrese Apellido: ");
                    String lastName=teclado.next();
                    setLastName(lastName);
                    break;
                case 3:
                    System.out.println("Ingrese edad: ");
                    int age=teclado.nextInt();
                    setAge(age);
                case 4:
                    System.out.println("Ingrese numero de identificacion: ");
                    String id=teclado.next();
                    setId(id);
                    break;
                case 5:
                    System.out.println("Ingrese fecha de nacimiento (DD-MM-AAAA): ");
                    String birthDate=teclado.next();
                    setBirthDate(birthDate);
                    break;
                case 6:
                    System.out.println("Ingrese Direccion: ");
                    String address=teclado.next();
                    setAddress(address);
                    break;
                case 7:
                    System.out.println("Ingrese Telefono: ");
                    String tel=teclado.next();
                    setTel(tel);
                    break;
            }
        }
    }
    public void consignacion(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el monto a consignar");
        int valor=teclado.nextInt();
        this.saldo+=valor;
        System.out.println("Usted ha consignado "+valor+" en su cuenta.");
        System.out.println("En este momento su saldo es "+saldo+".");
        System.out.println("Gracias");
    }
        public void retiro(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el monto a retirar");
        int valor=teclado.nextInt();
        if (valor>saldo)
            System.out.println("Usted no tiene suficientes fondos en su cuenta");
        else{
            this.saldo-=valor;
            System.out.println("Usted ha retirado "+valor+" de su cuenta.");
            System.out.println("En este momento su saldo es "+saldo+".");
            System.out.println("Gracias");
        }
    }
        public void consultarSaldo(){
        System.out.println("En este momento su saldo es "+saldo+".");
        System.out.println("Gracias");
    }
}