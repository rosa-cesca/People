package com.rosa_cesca.exercises.people;
import java.util.Calendar;

public class Person {
	private String name;
	private char gender;
	private String hairColor;
	private Calendar birthday;
	
	
	public Person(){
		
	}
	
	public Person(String Name, char Gender, String HairColor){
		this.setName(Name);
		this.setGender(Gender);
		this.setHairColor(HairColor);
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	
	public void setBirthday(int year, int month, int day){
		this.birthday= Calendar.getInstance();
		this.birthday.set(year, month - 1, day - 1);
	}
	
	public void setGender(char g){
		g = Character.toUpperCase(g);
		
		if ( (g == 'F') || (g == 'M') || (g == 'X') ){
			this.gender = g;
		} 
		else {
			this.gender = '?';
		}
	}
	
	public void setHairColor(String hc){
		this.hairColor = hc;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	public int getAge(){
		// Calcular idade com base na data de nascimento
		// Data de agora - Data de Nascimento
		int age = 0;
		
		Calendar current = Calendar.getInstance();

		int birthYear= this.birthday.get(Calendar.YEAR);
		int currentYear = current.get(Calendar.YEAR);
		int birthDay= this.birthday.get(Calendar.DAY_OF_YEAR);
		int currentDay = current.get(Calendar.DAY_OF_YEAR);
		
		age = currentYear - birthYear;		
		if (currentDay < birthDay){
			age = age - 1;
		}

		return age;
		
	}
	
	public Calendar getBirthday(){
		return this.birthday;
	}
	
	public char getGender(){
		return this.gender;
	}
	
	public String getHairColor(){
		return this.hairColor;
	}
	
	public String toString(){
		return "Person: " + this.name + " (" + this.gender + ") " + this.getAge() + ", hair " + this.hairColor;
	}

}
