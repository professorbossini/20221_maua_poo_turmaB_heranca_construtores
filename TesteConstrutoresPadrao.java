import javax.swing.JOptionPane;

public class TesteConstrutoresPadrao {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("José", 19);
        System.out.println(p);
        JOptionPane.showMessageDialog(null, p);
    }    
}
