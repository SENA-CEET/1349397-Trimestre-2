package co.edu.sena.proyectospoo.colecciones.ejemplo02;

/**
 * Created by Enrique on 31/05/2017.
 */
public class Aprendiz {
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombre;

    public Aprendiz(String tipoDocumento, String numeroDocumento, String nombre) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

         Aprendiz aprendiz = (Aprendiz) o;
       boolean respuesta = false;
        if(this.tipoDocumento == null || this.numeroDocumento == null || aprendiz.tipoDocumento== null || aprendiz.numeroDocumento== null ||this.nombre==null || aprendiz.nombre== null){
            respuesta= false;
        }else if(this.tipoDocumento.equals(aprendiz.tipoDocumento) && this.numeroDocumento.equals(aprendiz.numeroDocumento)){
            respuesta= true;
        }
        return respuesta;
    }

    @Override
    public int hashCode() {
        int result = tipoDocumento != null ? tipoDocumento.hashCode() : 0;
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
