package com.imooc2;
import java.util.Scanner;

public class Scanner_Input {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter: ");
		
		int score = input.nextInt();
		
	        //int score = 53; 

	        int count = 0;

	    System.out.println("�ӷ�ǰ�ɼ���" + score); 

	        while(score < 60) {

	           score += 1;

	           count++;   }

	    System.out.println("�ӷֺ�ɼ���" + score);

	    System.out.printf("�����ˣ�%d ��!" , count);
	}
}
