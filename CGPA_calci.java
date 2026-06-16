package CGPA_Calculator;
import java.text.DecimalFormat;
import java.util.*;

public class CGPA_calci {
	static Scanner sc = new Scanner(System.in);
	static float[] gpa() {
		float[] res = new float[2];
		System.out.println("How manu subjects do you have?");
		int subjects=sc.nextInt();                            //subject count
		float[] grade_point= new float[subjects];             
		float[] credit_point= new float[subjects];
		float total_CP=0;
		float total_GP=0;
		System.out.println("Enter grade points earned");
		for(int l1=0;l1<subjects;l1++) {
			grade_point[l1]=sc.nextInt();                     //grade_point input
		}
		System.out.println("Enter credit points in same order");
		for(int l2=0;l2<subjects;l2++) {
			credit_point[l2]=sc.nextInt();                   //credit_point input
			total_CP+=credit_point[l2];                      //adding total credit_point 
		}
		for(int l3=0;l3<subjects;l3++) {
			total_GP+=(grade_point[l3]*credit_point[l3]);
		}
		res[0]= total_GP;
		res[1]= total_CP;
     //String formattedValue = decimalFormat.format(gpa);
		return res;
	}
	static void cgpa() {
		
		 DecimalFormat decimalFormat = new DecimalFormat("#." + "0".repeat(3));
		
		System.out.println("Enter how many semester are completed");
		int sem=sc.nextInt();
		double totalGradePoints=0;
		double totalCreditPoints=0;
		
		float[] res = new float[2];
		for(int i=0;i<sem;i++) {
			System.out.println("Enter Semester "+(i+1)+" Details:");
			res=gpa();
			totalGradePoints+=res[0];
			totalCreditPoints+=res[1];
		}
//		double cgpa = 0;
//		System.out.println(totalGradePoints+" "+totalCreditPoints);
		System.out.println("Your CGPA is :"+decimalFormat.format(res[0]/res[1]));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DecimalFormat decimalFormat = new DecimalFormat("#." + "0".repeat(2));
		
		System.out.println("Welcome to GPA and CGPA Calculator!");
		System.out.println();
		System.out.println("What would you like to calculate?");
		System.out.println("If GPA enter 1");
		System.out.println("If CGPA enter 2");
		
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			
			float[] res=gpa();    //returns 2 values : 1.total grade points 2.total credit points
			System.out.println("Your GPA is :"+decimalFormat.format(res[0]/res[1])); //GPA
			
			break;
		}
		case 2:{
			cgpa();
			break;
		}
		default:{
			System.out.println("Run again and Enter valid choice!");
			
		}

	}
		sc.close();
	}
}
