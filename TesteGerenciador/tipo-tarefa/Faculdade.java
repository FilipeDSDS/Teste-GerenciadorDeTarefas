package tipo-tarefa;

public class Faculdade extends Pessoa{
    private String tf;

    public String getTf() {
        return tf;
    }

    public void setTf(String tf) {
        this.tf = tf;
    }
    
    @Override
    public String toString() {
        return "Tarefa da Faculdade:\n"
                + "Início da Tarefa: "+getInicio()
                + "\nConclusão da Tarefa: "+getConclusao()
                +"\nObjetivo: " +tf;
    }
}
