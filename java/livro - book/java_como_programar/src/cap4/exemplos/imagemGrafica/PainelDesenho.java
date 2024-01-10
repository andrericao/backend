package cap4.exemplos.imagemGrafica;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PainelDesenho extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // chama paintComponent para assegurar que o painel é exibido corretamente
        int width = getWidth();
        int height = getHeight();

        // desenha uma linha a partir do canto superior esquerdo até o inferior direito
        g.drawLine(0, 0, width, height);

        // desenha uma linha a partir do canto inferior esquerdo até o superior direito
        g.drawLine(0, height, width, 0);
    }
}
