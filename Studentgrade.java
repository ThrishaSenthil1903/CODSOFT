package com.Task2;
import java.util.Scanner;
public class Studentgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number of subjects: ");
int subject=scan.nextInt();
int[] marks=new int[subject];	
int sum=0;
for(int i=0;i<subject;i++) {
	System.out.println("Enter a marks for subject: "+(i+1));
	marks[i]=scan.nextInt();
	sum=sum+marks[i];
}
double average=(double)sum/subject;
char grade;
if(average>=90) {
	grade='O';
}else if(average>80) {
	grade='A';
	
}else if(average>70) {
	grade='B';
}else if(average>60) {
	grade='C';

}else if(average>50) {
	grade='D';
}
else {
	grade='N';
}System.out.println("Display results: ");
System.out.println("Enter a Average : "+average);
System.out.println("Enter a total marks: "+sum);
System.out.println("Enter a grade: "+grade);

}
}