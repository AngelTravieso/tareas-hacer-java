package domain;

public class Tarea {

    private int tareaId;
    private String titulo;
    private boolean status;
    private int tareasContador;

    private Tarea() {
        ++tareasContador;
    }

    public Tarea(String titulo, boolean status) {
        // llamar constructor privado
        this();
        this.titulo = titulo;
        this.status = status;
        tareaId = tareasContador;

    }

    public int getTareaId() {
        return this.tareaId;
    }

    public int tareasContador() {
        return this.tareasContador;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarea{" + "tareaId=" + tareaId + ", titulo=" + titulo + ", status=" + status + ", tareasContador=" + tareasContador + '}';
    }

}
