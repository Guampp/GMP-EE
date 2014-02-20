package br.com.gmp.comps.datefield;

import br.com.gmp.comps.baloontip.src.BalloonUtil;
import br.com.gmp.comps.interfaces.ValidableComponent;
import br.com.gmp.utils.formatter.MaskFormats;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import org.jdesktop.swingx.SwingXUtilities;

/**
 *
 * @author kaciano
 */
public class GMPDateField extends JFormattedTextField implements ValidableComponent {

    private Date date;

    /**
     * Creates new form GMPDateField
     */
    public GMPDateField() {
        initialize();
    }

    /**
     * Inicializa o componente
     */
    private void initialize() {
        initComponents();
        setMask();
        setDate(new Date());
        this.setLayout(new BorderLayout());
        this.add(gBDate, BorderLayout.EAST);
        jPopDate.add(jPCalendar);
        jSpinnerYear.setModel(new javax.swing.SpinnerListModel(getYearList()));
    }

    /**
     * Adiciona a mascara ao campo
     */
    private void setMask() {
        setFormatterFactory(new DefaultFormatterFactory(new MaskFormats()
                .getMask(MaskFormats.DATE)));
    }

    /**
     * Retorna a data selecionada
     *
     * @return Date Data selecionada
     * @throws ParseException
     */
    public Date getDate() throws ParseException {
        return date;
    }

    /**
     * Modifica a data
     *
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
        jXCalendar.getCalendar().set(date.getYear(), date.getMonth(), date.getDay());
        jXCalendar.setSelectionDate(date);
        jXCalendar.setFirstDisplayedDay(date);
        jXCalendar.repaint();
        jXCalendar.revalidate();
        setText(new SimpleDateFormat("dd/MM/yyyy").format(date));
    }

    /**
     *
     * @return
     */
    private String[] getYearList() {
        int actual = new Date().getYear() + 1900;
        int initial = actual - 100;
        int dif = 100;
        String[] yearList = new String[dif];
        int j = 0;
        for (int i = actual; i != initial; i--) {
            if (j <= 100) {
                yearList[j] = String.valueOf(i);
                j++;
            } else {
                break;
            }
        }
        return yearList;
    }

    /**
     *
     * @return
     */
    public int getMonth() {
        return jXCalendar.getCalendar().getTime().getMonth();
    }

    /**
     *
     * @return
     */
    public int getYear() {
        return jXCalendar.getCalendar().getTime().getYear();
    }

    /**
     * Vai para o próximo mês
     */
    public void nextMonth() {
        if (date.getMonth() == 12) {
            date.setMonth(1);
            date.setYear(date.getYear() + 1);
        } else {
            date.setMonth(date.getMonth() + 1);
        }
        setDate(date);
    }

    /**
     * Volta para o mês anterior
     */
    public void previousMonth() {
        if (date.getMonth() == 1) {
            date.setMonth(12);
            date.setYear(date.getYear() - 1);
        } else {
            date.setMonth(date.getMonth() - 1);
        }
        setDate(date);
    }

    /**
     * Ação de componente em foco
     *
     * @param e FocusEvent
     */
    public void focusGained(FocusEvent e) {
        this.setBackground(new Color(255, 230, 166));
    }

    /**
     * Ação de componente sem foco
     *
     * @param e FocusEvent
     */
    public void focusLost(FocusEvent e) {
        this.setBackground(new JTextField().getBackground());
        if (getText().equals("") || getText() == null) {
            setDate(date);
        }
    }

    @Override
    public boolean validateComponent() {
        if (this.getText().equals("") || this.getText() == null) {
            new BalloonUtil().showModernBallon(jXCalendar, "Data invalida!");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Mostra a PopUp de seleção de datas
     */
    private void openPopUp() {
        gBDate.setComponentPopupMenu(jPopDate);
        gBDate.getComponentPopupMenu().show(gBDate.getParent(), 0, getHeight());
    }

    public void checkPop() {
        if (jPopDate.isShowing()) {
            jPopDate.setVisible(false);
        } else {
            jPopDate.show(gBDate.getParent(), 0, getHeight());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopDate = new javax.swing.JPopupMenu();
        jPCalendar = new javax.swing.JPanel();
        jTBPrev = new javax.swing.JToolBar();
        gBPrevious = new br.com.gmp.comps.button.GMPButton();
        jTBYear = new javax.swing.JToolBar();
        jSpinnerYear = new javax.swing.JSpinner();
        jTBNext = new javax.swing.JToolBar();
        gBNext = new br.com.gmp.comps.button.GMPButton();
        jXCalendar = new org.jdesktop.swingx.JXMonthView();
        gBOk = new br.com.gmp.comps.button.GMPButton();
        gBDate = new br.com.gmp.comps.button.GMPButton();

        jTBPrev.setFloatable(false);
        jTBPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        gBPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/circle_left.png"))); // NOI18N
        gBPrevious.setHorizontalTextPosition(0);
        gBPrevious.setVerticalTextPosition(3);
        gBPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBPreviousActionPerformed(evt);
            }
        });
        jTBPrev.add(gBPrevious);

        jTBYear.setFloatable(false);

        jSpinnerYear.setModel(new javax.swing.SpinnerListModel(new String[] {"Item 0", "Item 1", "Item 2", "Item 3"}));
        jTBYear.add(jSpinnerYear);

        jTBNext.setFloatable(false);

        gBNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/circle_right.png"))); // NOI18N
        gBNext.setHorizontalTextPosition(0);
        gBNext.setVerticalTextPosition(3);
        gBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBNextActionPerformed(evt);
            }
        });
        jTBNext.add(gBNext);

        jXCalendar.setBackground(new java.awt.Color(102, 153, 255));
        jXCalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        jXCalendar.setDaysOfTheWeek(new String[] {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"});
        jXCalendar.setDaysOfTheWeekForeground(new java.awt.Color(0, 102, 153));
        jXCalendar.setSelectionForeground(new java.awt.Color(255, 102, 0));
        jXCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXCalendarMouseClicked(evt);
            }
        });

        gBOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/circle_ok.png"))); // NOI18N
        gBOk.setText("Confirmar");
        gBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCalendarLayout = new javax.swing.GroupLayout(jPCalendar);
        jPCalendar.setLayout(jPCalendarLayout);
        jPCalendarLayout.setHorizontalGroup(
            jPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCalendarLayout.createSequentialGroup()
                .addComponent(jTBPrev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTBYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jTBNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jXCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(gBOk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPCalendarLayout.setVerticalGroup(
            jPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCalendarLayout.createSequentialGroup()
                .addGroup(jPCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBNext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBPrev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jXCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(gBOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPCalendarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTBNext, jTBPrev, jTBYear});

        gBDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/calendar.png"))); // NOI18N
        gBDate.setMaximumSize(new java.awt.Dimension(26, 26));
        gBDate.setMinimumSize(new java.awt.Dimension(26, 26));
        gBDate.setPreferredSize(new java.awt.Dimension(26, 26));
        gBDate.setSize(new java.awt.Dimension(26, 26));
        gBDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBDateActionPerformed(evt);
            }
        });

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        setComponentPopupMenu(jPopDate);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void jBDatePickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDatePickActionPerformed

    }//GEN-LAST:event_jBDatePickActionPerformed

    private void jFTDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTDateFocusGained

    }//GEN-LAST:event_jFTDateFocusGained

    private void jFTDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTDateFocusLost

    }//GEN-LAST:event_jFTDateFocusLost

    private void gBDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBDateActionPerformed
        checkPop();
    }//GEN-LAST:event_gBDateActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        focusGained(evt);
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        focusLost(evt);
    }//GEN-LAST:event_formFocusLost

    private void jXCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXCalendarMouseClicked
        if (evt.getClickCount() == 2) {
            setDate(jXCalendar.getSelectionDate());
            checkPop();
        } else {
            setDate(jXCalendar.getSelectionDate());
        }
    }//GEN-LAST:event_jXCalendarMouseClicked

    private void gBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBNextActionPerformed
        nextMonth();
    }//GEN-LAST:event_gBNextActionPerformed

    private void gBPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBPreviousActionPerformed
        previousMonth();
    }//GEN-LAST:event_gBPreviousActionPerformed

    private void gBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBOkActionPerformed
        checkPop();
    }//GEN-LAST:event_gBOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.button.GMPButton gBDate;
    private br.com.gmp.comps.button.GMPButton gBNext;
    private br.com.gmp.comps.button.GMPButton gBOk;
    private br.com.gmp.comps.button.GMPButton gBPrevious;
    private javax.swing.JPanel jPCalendar;
    private javax.swing.JPopupMenu jPopDate;
    private javax.swing.JSpinner jSpinnerYear;
    private javax.swing.JToolBar jTBNext;
    private javax.swing.JToolBar jTBPrev;
    private javax.swing.JToolBar jTBYear;
    private org.jdesktop.swingx.JXMonthView jXCalendar;
    // End of variables declaration//GEN-END:variables

}