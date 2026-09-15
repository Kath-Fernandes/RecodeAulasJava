package dao;
 
public class VideoAula {
 
    private String curso;
    private Integer id;
    private Double valor;
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public VideoAula() {
    }   
    
    public VideoAula(String curso, Double valor) {
        this.curso = curso;
        this.valor = valor;
    }
    
    public VideoAula(String curso, Integer id, Double valor) {
        this.curso = curso;
        this.id = id;
        this.valor = valor;
    }
}