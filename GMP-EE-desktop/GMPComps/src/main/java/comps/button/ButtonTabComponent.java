/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comps.button;

/**
 *
 * @author Kaciano
 */
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;

public class ButtonTabComponent extends JPanel {

    private final JTabbedPane pane;

    public ButtonTabComponent(final JTabbedPane pane) {
        //unset default FlowLayout' gaps  
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;

        setOpaque(false);

        initialize(null);
    }//Fim do construtor.  

    public ButtonTabComponent(final JTabbedPane pane, Icon icon) {
        //unset default FlowLayout' gaps  
        super(new FlowLayout(FlowLayout.LEFT, 0, 0));
        if (pane == null) {
            throw new NullPointerException("TabbedPane is null");
        }
        this.pane = pane;

        setOpaque(false);

        initialize(icon);
    }

    private void initialize(Icon icon) {
        //faz a JLabel ler o título do JTabbedPane  
        JLabel label = new JLabel() {
            @Override
            public String getText() {
                int i = pane.indexOfTabComponent(ButtonTabComponent.this);
                if (i != -1) {
                    return pane.getTitleAt(i);
                }
                return null;
            }
        };
        String path = "/res/Icons/set1/16/Search.png";
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(path));
        label.setIcon(icon == null ? imageIcon : icon);
        add(label);
        //----------------------------------------------------------------------
        //adiciona mais espaço entre a label e o botão  
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
        //----------------------------------------------------------------------
        //tab button  
        JButton button = new TabButton();
        add(button);
        //----------------------------------------------------------------------
        //adiciona mais espaço para o topo do componente  
        //setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
    }

    private class TabButton extends JButton implements ActionListener {

        public TabButton() {
            int size = 15;
            setPreferredSize(new Dimension(size, size));
            setToolTipText("Fechar esta aba!");
            setUI(new BasicButtonUI());
            setContentAreaFilled(false);
            setFocusable(false);
            setBorder(BorderFactory.createEtchedBorder());
            setBorderPainted(false);
            setBackground(Color.red);
            addMouseListener(buttonMouseListener);
            setRolloverEnabled(true);
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int i = pane.indexOfTabComponent(ButtonTabComponent.this);
            if (i != -1) {
                pane.remove(i);
            }
        }

        //pinta o X  
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            //mudança na imagem para botões pressionados  
            if (getModel().isPressed()) {
                g2.translate(1, 2);
            }
            g2.setStroke(new BasicStroke(1));
            g2.setColor(Color.BLACK);
            if (getModel().isRollover()) {
                g2.setColor(Color.RED);
            }
            int delta = 5;
            g2.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta - 1);
            g2.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta - 1);
            g2.dispose();
        }
    }
    private final static MouseListener buttonMouseListener = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(true);
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            Component component = e.getComponent();
            if (component instanceof AbstractButton) {
                AbstractButton button = (AbstractButton) component;
                button.setBorderPainted(false);
            }
        }
    };
}
