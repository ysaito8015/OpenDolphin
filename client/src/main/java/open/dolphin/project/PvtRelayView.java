/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package open.dolphin.project;

/**
 *
 * @author kazushi
 */
public class PvtRelayView extends javax.swing.JPanel {

    /**
     * Creates new form PvtRelayView
     */
    public PvtRelayView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pvtRelayCheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        pvtRelayDirField = new javax.swing.JTextField();
        pvtRelaySelectionBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pvtRelayUTF8Radio = new javax.swing.JRadioButton();
        pvtRelaySHIFTJISRadio = new javax.swing.JRadioButton();
        pvtRelayEUCRadio = new javax.swing.JRadioButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("受付リレー"));

        pvtRelayCheck.setText("このマシンで受付情報をリレーする");

        jLabel1.setText("出力先ディレクトリ:");

        pvtRelaySelectionBtn.setText("選択...");

        jLabel2.setText("エンコーディング:");

        pvtRelayUTF8Radio.setText("UTF-8");

        pvtRelaySHIFTJISRadio.setText("SHIFT-JIS");

        pvtRelayEUCRadio.setText("EUC-JP");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(pvtRelayCheck)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(8, 8, 8)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel2)
                            .add(jLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(pvtRelayDirField)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pvtRelaySelectionBtn))
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(pvtRelayUTF8Radio)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pvtRelaySHIFTJISRadio)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pvtRelayEUCRadio)
                                .add(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(pvtRelayCheck)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(pvtRelayDirField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pvtRelaySelectionBtn))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(pvtRelayUTF8Radio)
                    .add(pvtRelaySHIFTJISRadio)
                    .add(pvtRelayEUCRadio))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox pvtRelayCheck;
    private javax.swing.JTextField pvtRelayDirField;
    private javax.swing.JRadioButton pvtRelayEUCRadio;
    private javax.swing.JRadioButton pvtRelaySHIFTJISRadio;
    private javax.swing.JButton pvtRelaySelectionBtn;
    private javax.swing.JRadioButton pvtRelayUTF8Radio;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JCheckBox getPvtRelayCheck() {
        return pvtRelayCheck;
    }

    public javax.swing.JTextField getPvtRelayDirField() {
        return pvtRelayDirField;
    }

    public javax.swing.JRadioButton getPvtRelayEUCRadio() {
        return pvtRelayEUCRadio;
    }

    public javax.swing.JRadioButton getPvtRelaySHIFTJISRadio() {
        return pvtRelaySHIFTJISRadio;
    }

    public javax.swing.JButton getPvtRelaySelectionBtn() {
        return pvtRelaySelectionBtn;
    }

    public javax.swing.JRadioButton getPvtRelayUTF8Radio() {
        return pvtRelayUTF8Radio;
    }

}
