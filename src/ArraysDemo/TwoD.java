package ArraysDemo;

import java.util.Scanner;

public class TwoD {
	int[][] mat = new int[3][3];
	int[][] mat1=new int[3][3];
	int[][] mat3=new int[3][3];
	Scanner s = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter 9 elements for matrix1");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				mat[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
			
		}
		System.out.println("Enter 9 elements for matrix2");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				mat1[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.println();
			
		}
		System.out.println("Addition of Matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat3[i][j]=mat[i][j]+mat1[i][j];
			}
		}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(mat3[i][j]+"\t");
				}
				System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoD oo = new TwoD();
		oo.accept();
	}

}
