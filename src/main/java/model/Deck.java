package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Zsolt
 * 
 */
public class Deck {

	public List<Card> pakli = new ArrayList<Card>();

	public List<Card> Apakli = new ArrayList<Card>();

	public List<Card> Bpakli = new ArrayList<Card>();

	public void felolt(){
		Card insert = new Card(); 
		
		insert.setName("Porshe"); 
		insert.setHengermeret(4000);
		insert.setNyomatek(150);
		insert.setAtlagfogyaztas(9.5f);
		insert.setVegsebbeseg(300);
		pakli.add(insert);
		
		insert.setName("Lada"); 
		insert.setHengermeret(1500);
		insert.setNyomatek(75);
		insert.setAtlagfogyaztas(7.5f);
		insert.setVegsebbeseg(140);
		pakli.add(insert);
		
		
		Random random = new Random();
		
		for (int i=0; i<pakli.size()/2;i++){
			Apakli.add(pakli.get(i));
			Bpakli.add(pakli.get(i+pakli.size()/2));
		}
		/*
		for (int i=0; i<pakli.size()/2;i++){
			Bpakli.add(pakli.get(random.nextInt(pakli.size())+1));
		}
		 */   
	}
	public static void main(String args[]) {

	}

}
