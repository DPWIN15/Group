import static java.lang.Thread.sleep;

/**
 *
 * @author Maximus
 */
public class BattleRunner {
    Battle battle;
    BattleDisplay display;
    public BattleRunner(Battle battle){
        this.battle = battle;
    }
    public static void main(String [] args){
        BattleDisplay display = new BattleDisplay();
        display.setVisible(true);

    }
    public void displayBattle(){
        display = new BattleDisplay();
        display.setVisible(true);
        //initUnitText();
    }
    public void setUnitText() throws InterruptedException {
        
        javax.swing.JTextArea [] unitArray = display.getLeftGroupPanel().getUnitArray();
        javax.swing.JTextArea [] unitArray1 = display.getRightGroupPanel1().getUnitArray();
        int group1Size = battle.test1.size();
        int group2Size = battle.test2.size();

        for (int i = 0; i < group1Size; i++){
            if (!unitArray[i].getText().equals(battle.test1.get(i).toString())){
                unitArray[i].setBackground(new java.awt.Color(255, 0, 0));
                sleep(200);
                unitArray[i].setBackground(new java.awt.Color(255, 255, 255));
            }
            unitArray[i].setText(battle.test1.get(i).toString());

        }
        for(int i = 0; i < group2Size; i++){
            if (!unitArray1[i].getText().equals(battle.test2.get(i).toString())){
                unitArray1[i].setBackground(new java.awt.Color(255, 0, 0));
                sleep(200);
                unitArray1[i].setBackground(new java.awt.Color(255,255,255));
            }
            unitArray1[i].setText(battle.test2.get(i).toString());
        }
    }

    
}
