package com.example.modelclasses;

import java.util.ArrayList;
import java.util.Date;

/*
 * Users with chirping capabilities.
 * @author Paul Vo 8/11/2014
 * 
 * 
 */
public class User {
	//Fields
	private int id;
	private Date creation;
	private String email;
	private String name;
	private String password;//encryption algorithm
	private int num_post;
	private ArrayList<Integer> responses;

	//Constructor
	public User(){
		this.id = 0;
		//this.creation = ;
		this.email = "newuser@coderChrips.net";
		this.name = "newChirper";
		this.password = "password";
		this.num_post = 0;
		this.responses = new ArrayList<Integer>();
	}

	public User(int id, Date creation, String email, String name, String password, int num_post){
		this.id = id;
		this.creation = creation;
		this.email = email;
		this.name = name;
		this.password = password;
		this.num_post = num_post;
	}
	//Getters and Setters
	public void setId (int id){
		this.id =id;	
	}
	public int getId(){
		return this.id;
	}
	public void setEmail(String email){
		this.email =email;	
	}
	public String getEmail(){
		return this.email;
	}
	public void setName(String name){
		this.name =name;	
	}
	public String getName(){
		return this.name;
	}
	public void incNumPost(){
		this.num_post++;
	}
	public int getNumPost(){
		return this.num_post;
	}

	//TODO:
	public void addChirp(){

	}

}
