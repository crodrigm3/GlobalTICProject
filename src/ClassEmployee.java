public class ClassEmployee {
    private Integer ID;
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private Character genero;

    public ClassEmployee(Integer nuevoID)
    {
        ID = nuevoID; //Se le da un ID al empleado
    }
    //Método para obtener el nombre del empleado
    public Integer getID()
    {
        return ID;
    }

    public ClassEmployee(String nuevoNombre)
    {
        nombre = nuevoNombre; //Se le da un nombre al empleado
    }

    //Método para obtener la edad del empleado
    public int getEdad()
    {
        return edad;
    }

    //Método para establecer la edad del empleado
    public void setEdad(int nuevaEdad)
    {
        edad = nuevaEdad;
    }

    //Método para obtener el nombre del empleado
    public String getNombre()
    {
        return nombre;
    }

    //Método para establecer y obtener el apellido del empleado
    public String setApellido()
    {
        return apellido;
    }
    public String getApellido()
    {
        return apellido;
    }

    //Método para establecer y obtener el telefono del empleado
    public Integer setTelefono()
    {
        return telefono;
    }
    public Integer getTelefono()
    {
        return telefono;
    }

    //Método para establecer y obtener el telefono del empleado
    public Character setGenero()
    {
        return genero;
    }
    public Character getGenero()
    {
        return genero;
    }
}

