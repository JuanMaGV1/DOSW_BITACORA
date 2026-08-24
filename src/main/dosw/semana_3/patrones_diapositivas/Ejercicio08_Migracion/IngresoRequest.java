package main.dosw.semana_3.patrones_diapositivas.Ejercicio08_Migracion;

public class IngresoRequest {
    private boolean pasaporteValido;
    private boolean antecedentesLimpios;
    private boolean motivoValido;
    private boolean aprobado;

    public IngresoRequest(boolean pasaporteValido, boolean antecedentesLimpios, boolean motivoValido){
        this.pasaporteValido = pasaporteValido;
        this.antecedentesLimpios = antecedentesLimpios;
        this.motivoValido = motivoValido;
        this.aprobado = true;
    }

    public boolean isPasaporteValido(){return pasaporteValido;}
    public boolean isAntecedentesLimpios(){return antecedentesLimpios;}
    public boolean isMotivoValido(){return motivoValido;}
    public boolean isAprobado(){return aprobado;}

    public void setPasaporteValido(boolean pasaporteValido){
        this.pasaporteValido = pasaporteValido;
    }
    public void setAntecedentesLimpios(boolean antecedentesLimpios){
        this.antecedentesLimpios = antecedentesLimpios;
    }
    public void setMotivoValido(boolean motivoValido){
        this.motivoValido = motivoValido;
    }
    public void setAprobado(boolean aprobado){
        this.aprobado = aprobado;
    }

    @Override
    public String toString() {
        return String.format("IngresoRequest{pasaporteValido=%s, antecedentesLimpios=%s, motivoValido=%s, aprobado=%s}",
            pasaporteValido, antecedentesLimpios, motivoValido, aprobado);
    }
}
