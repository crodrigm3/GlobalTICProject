public class empleado {
    //Atributos
    private Integer ID;
    private String Empresa;
    private String nombre;
    private String apellido;
    private int edad;
    private String Correo;
    private int telefono;
    private String rol;

    // Constructor 
    public empleado(Integer ID, String Empresa, String nombre, String apellido, Integer edad, String Correo, Integer telefono, String rol){
        this.ID = ID;
        this.Empresa = Empresa;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.Correo = Correo;
        this.telefono = telefono;
        this.rol = rol;
    }

    public void mostrarDatos(){
        System.out.println("ID: "+ID);
        System.out.println("El nombre de la empresa es: "+Empresa);
        System.out.println("El nombre del empleado es: "+nombre);
        System.out.println("El apellido del empleado es: "+apellido);
        System.out.println("La edad es: "+edad);
        System.out.println("El correo es: "+Correo);
        System.out.println("Telefono: "+telefono);
        System.out.println("El cargo es: "+rol);
        
    }


    /* 
    public empleado(Integer nuevoID)
    {
        ID = nuevoID; //Se le da un ID al empleado
    }
    //Método para obtener el nombre del empleado
    public Integer getID()
    {
        return ID;
    }

    public empleado(String nuevaEmpresa)
    {
        Empresa = nuevaEmpresa; //Se le da un ID al empleado
    }
    //Método para obtener el nombre del empleado
    public String getEmpresa()
    {
        return Empresa;
    }
    */

}

