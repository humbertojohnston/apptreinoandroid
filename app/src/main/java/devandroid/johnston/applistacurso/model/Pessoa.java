package devandroid.johnston.applistacurso.model;

public class Pessoa {

    //Construtor
    //Atributos está relacionado com Objetos (como se tivesse um molde, template, modelo)

    //Os Atributos são protegidos

    private String primeiroNome; //CTRL+D duplica a linha
    private String sobreNome;
    private String cursoDesejado;
    private String telefoneContato;

    //Os atributos estão criados e como são privados, precisa-se criar os
    // Métodos Get's e Set'spara que se possa acessar esses atributos na Classe MainActivity

    //Para criar os Gets e Sets: Botão direito do mouse -> Generate - Gets e Sets
    //e seleciona os atributos necessários.

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {

        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {

        this.sobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public Pessoa() {

    }

    @Override //Sobrescrever
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", cursoDesejado='" + cursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
