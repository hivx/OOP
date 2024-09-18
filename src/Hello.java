import javax.swing.JOptionPane;
public class Hello {
    public static void main(String[] args) {

        //print
        System.out.println("Hello world!");

        //Message
        String result;
        result = JOptionPane.showInputDialog("Hay nhap ten ban:");
        JOptionPane.showMessageDialog(null,"Xin chao "+ result + "!");

        System.exit(0);
    }
}