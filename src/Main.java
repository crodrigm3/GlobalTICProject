
public class Main {
    public static void main(String[] args) {
        enterprise empresa1 = new enterprise("GlobalTic", "Call 14 #25-64", "9001274376", 3100000);
        empleado emp1 = new empleado(01,"GlobalTic", "Pedro", "Perez", 20, "pedroPerez@gmail.com" ,30100329, "Administrador");
        
        empresa1.mostrarDatosEmpresa();
        emp1.mostrarDatos();
    }
}
