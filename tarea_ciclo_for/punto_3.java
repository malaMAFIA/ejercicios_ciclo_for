import javax.swing.JOptionPane;
public class punto_3 {
    public static void main (String[]args){

        String num = JOptionPane.showInputDialog("Ingrese el numero que desea multiplicar ");
        int numero = Integer.parseInt(num);  
        for (int i=1;i<=10; i ++){
        int multi = i*numero;
        JOptionPane.showMessageDialog(null, numero+"x"+i+"="+multi);

        }     
    }
}

