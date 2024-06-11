package play;
import tipo-tarefa.Casa;
import tipo-tarefa.Faculdade;
import tipo-tarefa.Tipo;
import javax.swing.JOptionPane;

public class GerenciadorExe {
    public static void main(String[] args) {
        Casa vetorPF[] = new Casa[10];
        Faculdade vetorPJ[] = new Faculdade[10];
        int contVetorCS = 0;
        int contVetorFC = 0;
        
        
        int opcao;
        do {
            opcao = Integer.parseInt(
            JOptionPane.showInputDialog(
                    "Digite uma opcao:\n"
                            + "1 - Inserir Tarefa de Casa.\n"
                            + "2 - Inserir Tarefa da Faculdade.\n"
                            + "3 - Consultar Tarefa de Casa.\n"
                            + "4 - Consultar Tarefa da Faculdade.\n"
                            + "0 - Para sair."));
            switch(opcao){
                case 1:
                    Casa c = inserirTarefaCasa();
                    vetorCS[contVetorCS] = c;
                    contVetorCS++;
                    break;
                case 2:
                    Faculdade f = inserirTarefaFaculdade();
                    vetorFC[contVetorFC] = f;
                    contVetorFC++;
                    break;
                case 3:                    
                    for (int i = 0; i < contVetorCS; i++) {
                        JOptionPane.showMessageDialog
                            (null, vetorCS[i]);
                    }
                    break;
                case 4:
                    for (int i = 0; i < contVetorFC; i++) {
                        JOptionPane.showMessageDialog
                            (null, vetorFC[i]);
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog
                    (null, "Encerrando....");
                    break;
               default:
                    JOptionPane.showMessageDialog(null, 
                            "Opção Inválida!\n"
                            + "Tente novamente");
            }
        } while (opcao!=5);
    }
    
    
    public static Casa inserirTarefaCasa(){
        Casa c = new Casa();
        c.setInicio(JOptionPane.
                showInputDialog("Digite quando será o início da tarefa: "));
        c.setConclusao(JOptionPane.
                showInputDialog("Digite até quando terá que ser concluída a tarefa: "));
        c.setObjetivo(JOptionPane.
                showInputDialog("Digite qual será a tarefa a ser realizada: "));
        return c;
    }
    
    public static Faculdade inserirTarefaFaculdade(){
        Faculdade f = new Faculdade();
        c.setInicio(JOptionPane.
                showInputDialog("Digite quando será o início da tarefa: "));
        c.setConclusao(JOptionPane.
                showInputDialog("Digite até quando terá que ser concluída a tarefa: "));
        c.setObjetivo(JOptionPane.
                showInputDialog("Digite qual será a tarefa a ser realizada: "));
        return c;
    }
    

}
