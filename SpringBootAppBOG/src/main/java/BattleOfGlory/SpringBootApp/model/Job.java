package BattleOfGlory.SpringBootApp.model;

import java.util.ArrayList;

public interface Job {

	
	 // getter
	 
	 public int getLevel();
	 public int getHP();
	 public int getPDef();
	 public int getPAtk();
	 public int getMDef();
	 public int getMAtk();
	 public int getExp();
	 public int getPlayerID();
	 public int getJobID();
	 
	 
	 public ArrayList<Skill> getAllSkill();
	 public String getJobname();
	 // setter
	 
	 public void setLevel(int levelparam);
	 public void setHp(int hpparam);
	 public void setPDef(int defparam);
	 public void setPAtk(int atkparam);
	 public void setMDef(int defparam);
	 public void setMAtk(int atkparam);
	 public void setExp(int expparam);
	 public void setPlayerID(int playeridparam);
	 public void setJobID(int jobIDparam);
	 
	 public ArrayList<Skill> AddnewSkill(Skill s);
	 // setJobname() when job name is change, character is also change too 
	 public String ChangeClass();
	 
	 public void GrowthUp();
	 
	 
}
