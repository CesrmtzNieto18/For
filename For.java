import javax.swing.JOptionPane;
public class For {
    public static void main(String[] arqs) {
        float estatura, imc;
        int peso;
        int resp = 1; 
        
        for (int i = 0; i < resp; i++) {
            peso = Integer.parseInt(JOptionPane.showInputDialog("Captura tu peso"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Captura estatura "
                    + "en forma de metros"));
            imc = (peso / (estatura * estatura)); 
            if (imc < 18.49) {
                JOptionPane.showMessageDialog(null, "Peso Bajo");
            } else if (imc >= 18.50 && imc <= 24.99) {
                JOptionPane.showMessageDialog(null, "Peso Normal");
            } else if (imc >= 25 && imc <= 29.99) {
                JOptionPane.showMessageDialog(null, "Sobre Peso");
            } else if (imc >= 30 && imc <= 34.99) {
                JOptionPane.showMessageDialog(null, "Obesidad leve");
            } else if (imc >= 35 && imc <= 39.99) {
                JOptionPane.showMessageDialog(null, "Obesidad Media");
            } else {
                JOptionPane.showMessageDialog(null, "Obesidad Morbida");
            }
            
            resp = Byte.parseByte(JOptionPane.showInputDialog("Capture 1, si desea "
                    + "realizar otro cálculo, o 0 para salir"));
        }
    }
}


