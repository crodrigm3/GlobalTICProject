public class crashFlow {
    private String Usuario;
    private Double Monto;
    private String concepto;

    public crashFlow(String _Usuario, Double _Monto, String _concepto){
        Usuario = _Usuario;
        Monto = _Monto;
        concepto = _concepto;
    }

    public void mostrarDatosCrashFlow(){
        System.out.println("El usuario es: "+Usuario);
        System.out.println("El monto es de: "+Monto);
        System.out.println("El concepto es: "+concepto);
    }
}
