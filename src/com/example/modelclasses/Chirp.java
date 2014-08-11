package com.example.modelclasses;

import java.util.Date;
/*
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
*/

/*
 * Blog post object known as a "Chirp".
 * @author Paul Vo 8/11/2014
 * 
 * 
 */
public class Chirp {
	//Fields
	private int id;
	private Date creation;
	private String body;
	//private ArrayList<Integer> reponseChrip;
	//Constructor
	public Chirp(){
		this.id=0;
		this.body="New chirp";
		//this.creation = something; Date date = new Date(Year - 1901, Month, Day);
		//this.reponseChrip = new ArrayList<Integer>();
	}
	public Chirp(int id, Date creation, String body){
		
	}
	//Getters and Setters
	public int getid(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getBody(){

		return this.body;
	}
	public void set(String body){
		this.body = body;
	}
	public Date getCreation(){
		return this.creation;
	}
	public void setCreation(Date creation){
		this.creation = creation;
	}
	
	
	public boolean isRoot(){
		return true;
	}

	public void toDelete(){
		return;
	}

}
