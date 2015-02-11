/**
 *
 * @author Maximus
 */
public class BattleDisplay extends javax.swing.JFrame {
    private LeftGroupPanel leftGroupPanel1;
    private RightGroupPanel rightGroupPanel1;

    public BattleDisplay() {
        initComponents();
    }

    private void initComponents() {

        leftGroupPanel1 = new LeftGroupPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);
        getContentPane().add(leftGroupPanel1);
        leftGroupPanel1.setBounds(10, 11, 229, 578);

        rightGroupPanel1 = new RightGroupPanel();
        getContentPane().add(rightGroupPanel1);
        rightGroupPanel1.setBounds(600, 11, 229, 578);

        pack();
    }

    public LeftGroupPanel getLeftGroupPanel(){return this.leftGroupPanel1;}
    public RightGroupPanel getRightGroupPanel1(){return this.rightGroupPanel1;}


}
