package tipo-tarefa;

public class Casa extends Pessoa {
    private String td;

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }

    @Override
    public String toString() {
        return "Tarefa de Casa:\n"
		+ "Início da Tarefa: "+getInicio()
                + "\nConclusão da Tarefa: "+getConclusao()
                +"\nObjetivo: "+td;
    }
    
    
    
    
    
}
