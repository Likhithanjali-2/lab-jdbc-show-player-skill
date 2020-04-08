package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	public List<Skill> listAll_Skills () throws Exception {
		List<Skill> list=new ArrayList<Skill>();
		
		Skill skill = null;
		
		ConnectionManager cm=new ConnectionManager();
		Connection con=cm.getConnection();
		
		Statement stmt=con.createStatement();
		String sql="SELECT NAME FROM SKILL";
		
		ResultSet rs=stmt.executeQuery(sql);	
		
		while(rs.next()) {
			skill = new Skill();
			skill.setSkillName(rs.getString("name"));
			list.add(skill);
		}
		
		rs.close();
		stmt.close();
		con.close();
		return list;
		
		
		//List<String> ls=new ArrayList<String>();
//		
//		ConnectionManager cm=new ConnectionManager();
//		Connection con=cm.getConnection();
//		
//		String sql="SELECT NAME FROM SKILL";
//		
//		Statement stmt=con.createStatement();
//		
//		ResultSet rs=stmt.executeQuery(sql);
//		
//		while(rs.next()) {
//			ls.add(rs.getString("name"));
//		}
		//return ls;
	}
}