package BattleOfGlory.SpringBootApp.model;

import java.util.ArrayList;

public class Druid implements Job {
	
	// Note : Job ID for druid is alway 1.
	
	private int Level,P_Def,P_Atk,M_Def,M_Atk,Exp,PlayerID,JobID;
	private String Jobname;
	private ArrayList<Skill> skillList;
	
	Druid(){
	this.Level = 1;
	this.P_Atk = 1;
	this.P_Def =1 ;
	this.M_Atk =1 ;
	this.M_Def =1 ;
	this.Exp =1 ;
	this.PlayerID = 99999999;
	this.JobID=1;
	
	}
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getHP() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPDef() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPAtk() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMDef() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMAtk() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getExp() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPlayerID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getJobID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Skill> getAllSkill() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getJobname() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLevel(int levelparam) {
		// TODO Auto-generated method stub
		
	}

	public void setHp(int hpparam) {
		// TODO Auto-generated method stub
		
	}

	public void setPDef(int defparam) {
		// TODO Auto-generated method stub
		
	}

	public void setPAtk(int atkparam) {
		// TODO Auto-generated method stub
		
	}

	public void setMDef(int defparam) {
		// TODO Auto-generated method stub
		
	}

	public void setMAtk(int atkparam) {
		// TODO Auto-generated method stub
		
	}

	public void setExp(int expparam) {
		// TODO Auto-generated method stub
		
	}

	public void setPlayerID(int playeridparam) {
		// TODO Auto-generated method stub
		
	}

	public void setJobID(int jobIDparam) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Skill> AddnewSkill(Skill s) {
		// TODO Auto-generated method stub
		return null;
	}

	public String ChangeClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public void GrowthUp() {
		// TODO Auto-generated method stub
		
	}

}
