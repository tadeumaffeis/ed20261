
/**
 * Classe que representa uma pessoa com informações básicas
 * de nome, e-mail, dia e hora.
 * 
 * <p>Esta classe possui construtores, métodos de acesso
 * (getters e setters) e sobrescrita do método toString().</p>
 * 
 * @author SeuNome
 * @version 1.0
 */
public class Person {

    /** Nome da pessoa. */
    private String nome;

    /** E-mail da pessoa. */
    private String email;

    /** Dia associado ao registro da pessoa. */
    private int dia;

    /** Hora associada ao registro da pessoa. */
    private int hora;

    /**
     * Construtor padrão da classe Pessoa.
     */
    public Person() {
    }

    /**
     * Construtor com parâmetros para inicializar todos os atributos da classe.
     * 
     * @param nome nome da pessoa
     * @param email e-mail da pessoa
     * @param dia dia associado ao registro
     * @param hora hora associada ao registro
     */
    public Person(String nome, String email, int dia, int hora) {
        this.nome = nome;
        this.email = email;
        this.dia = dia;
        this.hora = hora;
    }

    /**
     * Retorna o nome da pessoa.
     * 
     * @return nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome novo nome da pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o e-mail da pessoa.
     * 
     * @return e-mail da pessoa
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o e-mail da pessoa.
     * 
     * @param email novo e-mail da pessoa
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna o dia associado ao registro.
     * 
     * @return dia do registro
     */
    public int getDia() {
        return dia;
    }

    /**
     * Define o dia associado ao registro.
     * 
     * @param dia novo dia do registro
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Retorna a hora associada ao registro.
     * 
     * @return hora do registro
     */
    public int getHora() {
        return hora;
    }

    /**
     * Define a hora associada ao registro.
     * 
     * @param hora nova hora do registro
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Retorna uma representação textual do objeto Pessoa.
     * 
     * @return String com os valores dos atributos da pessoa
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dia=" + dia +
                ", hora=" + hora +
                '}';
    }
}