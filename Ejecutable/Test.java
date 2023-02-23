package Ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        int num;
        String salida;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));

        switch(num)
        {
            case 0:
                salida = "CERO";
                break;
            case 1:
                salida = "UNO";
                break;
            case 2:
                salida = "DOS";
                break;
            default:
                salida = "NO ES UN DIGITO";
                break;
            case 3:
                salida = "TRES";
                break;
            case 4:
                salida = "CUATRO";
                break;
            case 5:
                salida = "CINCO";
                break;
            case 6:
                salida = "SEIS";
                break;        
            case 7:
                salida = "SIETE";
                break;
            case 8:
                salida = "OCHO";
                break;
            case 9:
                salida = "NUEVE";
                break;
        }

        if(num > 10 & num < 0)
        {
            JOptionPane.showMessageDialog("El numero tiene que ser de un digito", JOptionPane.ERROR_MESSAGE);
        }
        
        //Output
        JOptionPane.showMessageDialog(null, salida);

        //End
        System.exit(0);
    }
}
