public class enterprise {
    String Nombre;
    String Direccion;
    String NIT;
    Integer Telefono;

    public enterprise(String _Nombre, String _Direccion, String _NIT, Integer _Telefono){
        Nombre = _Nombre;
        Direccion = _Direccion;
        NIT = _NIT;
        Telefono = _Telefono;
    };

    public void mostrarDatosEmpresa(){
        System.out.println("El nombre de la empresa es: "+Nombre);
        System.out.println("La direccion es: "+Direccion);
        System.out.println("El NIT es: "+NIT);
        System.out.println("El telefono es: "+Telefono);
    };
}
