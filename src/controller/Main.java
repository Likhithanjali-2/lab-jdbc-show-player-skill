package controller;

import dao.SkillDAO;
import model.Skill;

public class Main{
	public static void main(String[] args) throws Exception {
		Skill skill=new Skill();
		SkillDAO skilldao=new SkillDAO();
		
		System.out.println("List of all skills");
		
		for(int i=0;i<skilldao.listAll_Skills().size();i++) {
			System.out.println(i+1+". "+skilldao.listAll_Skills().get(i).getSkillName());
		}
	}
}