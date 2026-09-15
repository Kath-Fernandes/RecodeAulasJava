package aplicacao;
 
import dao.VideoAula;
import dao.VideoAulaDAO;
 
public class Aplicacao {
 
    public static void main(String[] args) {
        VideoAula aula = new VideoAula("Java para iniciantes", 1, 475.75);
        VideoAula aula1 = new VideoAula("Java intermediário", 2, 575.75);
        VideoAula aula2 = new VideoAula("Java avançado", 3, 985.75);
        
        VideoAulaDAO dao = new VideoAulaDAO();
        //dao.apagaTabela();
        dao.criaTabela();
        dao.grava(aula);
        dao.consultaTudo();
        dao.grava(aula1);
        dao.grava(aula2);
        // dao.consultaTudo();
        dao.consultaPorNome("Java para iniciantes");
        //dao.apaga(4);
        //dao.apaga(5);
        //dao.apaga(6);
        dao.alteraValor(1, 250.49);
        dao.consultaPorNome("Java para iniciantes");
    }
 
}