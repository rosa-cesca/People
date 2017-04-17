package com.rosa_cesca.exercises.people;
import java.util.ArrayList;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> peopleList = new ArrayList<Person>();

		

		Person leone = new Person("Leone Francisco Petry Cesca", 'M', "Castanho Claro");
		leone.setBirthday(1980, 8, 14);
		peopleList.add(leone);

		Person jaqueline = new Person("Jaqueline Cesca", 'F', "Castanho Escuro");
		jaqueline.setBirthday(1983, 2, 23);
		peopleList.add(jaqueline);

		Person diva = new Person("Diva Petry", 'F', "Loiro");
		diva.setBirthday(2012, 4, 7);
		peopleList.add(diva);
		
		
		Person vitor = new Person("Vitor Rosa", 'M', "Castanho Escuro");
		vitor.setBirthday(2012, 4, 6);
		peopleList.add(vitor);
		
		
		Person helena = new Person("Helena Cesca Freitas", 'F', "Castanho Claro");
		helena.setBirthday(2012, 4, 5);
		peopleList.add(helena);

		int higherAge = -1;
		int indexHigherAge = 0;
		
		System.out.println("Amount of people: " + peopleList.size());
		for (int i = 0; i < peopleList.size(); i++) {
			System.out.println(peopleList.get(i).toString());
			
			if (peopleList.get(i).getAge() > higherAge){
				higherAge= peopleList.get(i).getAge();
				indexHigherAge = i;
			}
		}
		System.out.println("Higher Age: " + peopleList.get(indexHigherAge).getName() + " (" + higherAge + ")");

		
	}

}
