/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        initUnitText();
    }
    public void setUnitText(){
        
        javax.swing.JTextArea [] unitArray = display.getLeftGroupPanel().getUnitArray();
        int group1Size = battle.group1.getGroupList().size();
        int fill = 0;
        while (fill < group1Size){
            for (int i = 0; i < group1Size; i++){
                String unitTest = unitArray[i].getText();
                if (unitArray[i].getText().startsWith(battle.group1.getGroupList().get(i).getName())){
                    unitArray[i].setText(battle.group1.getGroupList().get(i).toString());
                    fill++;
                }
            }
        }
    }

    private void initUnitText(){
        javax.swing.JTextArea [] unitArray = display.getLeftGroupPanel().getUnitArray();
        int group1Size = battle.group1.getGroupList().size();
        for (int i = 0; i < group1Size; i++){
            unitArray[i].setText(battle.group1.getGroupList().get(i).toString());
        }
    }
    
}
