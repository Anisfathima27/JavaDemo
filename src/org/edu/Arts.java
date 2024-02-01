package org.edu;

public class Arts extends Education{

	private void bSc() {
		System.out.println("B.Sc\t:Maths,physics,chemistry,IT");

	}
	private void bEd() {
		System.out.println("B.Ed\t:Bsc B.ED  , BA B.Ed  ");

	}
	private void bA() {
		System.out.println("BA\t:Tamil,English,History");

	}private void bBA() {
		System.out.println("BBA\t:Accounts,HR");

	}
	@Override
	public void ug() {
		 System.out.println("All UG\t:B.Sc,B.Ed,BA,BBA");
	} 
	@Override
	public void pg() {
	     System.out.println("All PG\t:Msc,MA");
	}
	public static void main(String[] args) {
		Arts a=new Arts();
		a.bSc();
		a.bEd();
		a.bA();
		a.bBA();
		a.ug();a.pg();
	}
	
     
}
