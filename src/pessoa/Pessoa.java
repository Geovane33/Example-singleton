
package pessoa;

/**
 *
 * @author geovane.saraujo
 */
public class Pessoa {
     private static Pessoa instancia = new Pessoa();
     private int id;
     private String nome;
     private int idade;
     
    public Pessoa(){
        
    }
    public static Pessoa getInstancia(){
        return instancia;
    }

    /**
     * @param aInstancia the instancia to set
     */
    public static void setInstancia(Pessoa aInstancia) {
        instancia = aInstancia;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
