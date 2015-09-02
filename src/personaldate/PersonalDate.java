package personaldate;
import java.util.Scanner;
public class PersonalDate {
    private String name;
    private String lastName;
    private int age;
    private String id;
    private String birthDate;
    private String address;
    private String tel;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public void setData(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        name=teclado.next();
        System.out.println("Ingrese Apellido: ");
        lastName=teclado.next();
        System.out.println("Ingrese edad: ");
        age=teclado.nextInt();
        System.out.println("Ingrese numero de identificacion: ");
        id=teclado.next();
        System.out.println("Ingrese fecha de nacimiento (DD-MM-AAAA): ");
        birthDate=teclado.next();
        System.out.println("Ingrese Direccion: ");
        address=teclado.next();
        System.out.println("Ingrese Telefono: ");
        tel=teclado.next();
    }
    public void getData(){
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(id);
        System.out.println(birthDate);
        System.out.println(address);
        System.out.println(tel);
    }
    

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Client carlos=new Client();
        System.out.println("Ingrese los datos del usuario...");
        Client juan=new Client();
        juan.setData();
        int val=1;
        while (val>0){
            System.out.println("Elija la opcion...");
            System.out.println("1. Actualizar datos");
            System.out.println("2. Consignar");
            System.out.println("3. Retiro");
            System.out.println("4. Consultar saldo");
            System.out.println("0. Salir");
            int op=teclado.nextInt();
            switch (op){
                case 0:
                    val=0;
                    break;
                case 1:
                    juan.actualizarDatos();
                    break;
                case 2:
                    juan.consignacion();
                    break;
                case 3:
                    juan.retiro();
                    break;
                case 4:
                    juan.consultarSaldo();
                    break;
            }
        }
    }
    
}
