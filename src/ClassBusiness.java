public class ClassBusiness {
    private String tipoContrato;
    private String tipoNomina;
    private String cargo;

    public ClassBusiness(String tipoContrato, String tipoNomina, String cargo) {
        this.tipoContrato = tipoContrato;
        this.tipoNomina = tipoNomina;
        this.cargo = cargo;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getTipoNomina() {
        return tipoNomina;
    }

    public void setTipoNomina(String tipoNomina) {
        this.tipoNomina = tipoNomina;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
