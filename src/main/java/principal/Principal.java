package principal;

import javax.swing.JOptionPane;
import model.Aluno;

public class Principal {
    public static void main (String args[]) {
        
        Aluno media = new Aluno();
        
        media.setAluno(JOptionPane.showInputDialog("Digite o nome do aluno: "));
        media.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota1: ")));
        media.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota2: ")));
        media.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota3: ")));
        
        JOptionPane.showMessageDialog(null,"A média do aluno " + media.getAluno() + " é: " + media.getMedia());
    } 
}
