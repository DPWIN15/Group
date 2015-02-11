/**
 * Created by Max Towery on 2/10/2015.
 */
public class RightGroupPanel extends javax.swing.JPanel{
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea unit1;
    private javax.swing.JTextArea unit2;
    private javax.swing.JTextArea unit3;
    private javax.swing.JTextArea unit4;
    private javax.swing.JTextArea unit5;
    public RightGroupPanel() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        unit1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        unit2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        unit3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        unit4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        unit5 = new javax.swing.JTextArea();

        setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        unit1.setEditable(false);
        unit1.setColumns(20);
        unit1.setRows(4);
        jScrollPane1.setViewportView(unit1);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 166, 78);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        unit2.setEditable(false);
        unit2.setColumns(20);
        unit2.setRows(4);
        jScrollPane2.setViewportView(unit2);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 140, 166, 78);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        unit3.setEditable(false);
        unit3.setColumns(20);
        unit3.setRows(4);
        jScrollPane3.setViewportView(unit3);

        add(jScrollPane3);
        jScrollPane3.setBounds(30, 230, 166, 78);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        unit4.setEditable(false);
        unit4.setColumns(20);
        unit4.setRows(4);
        jScrollPane4.setViewportView(unit4);

        add(jScrollPane4);
        jScrollPane4.setBounds(30, 320, 166, 78);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        unit5.setEditable(false);
        unit5.setColumns(20);
        unit5.setRows(4);
        jScrollPane5.setViewportView(unit5);

        add(jScrollPane5);
        jScrollPane5.setBounds(30, 410, 166, 78);
    }

    public javax.swing.JTextArea [] getUnitArray(){
        javax.swing.JTextArea [] array = {unit1, unit2, unit3, unit4, unit5};
        return array;
    }

}
