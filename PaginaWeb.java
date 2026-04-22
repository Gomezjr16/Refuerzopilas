public class PaginaWeb {
    private String url;
    private String titulo;
    private String fechaAcceso;

    public PaginaWeb() {
    }

    public String getUrl() {
        return url;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaAcceso() {
        return fechaAcceso;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaAcceso(String fechaAcceso) {
        this.fechaAcceso = fechaAcceso;
    }
}