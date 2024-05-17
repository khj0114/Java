package kh.java.function;

import java.util.Scanner;

public class ArrayTest2 {
	public void test1() {
		int num =100;
		System.out.println("num :" +num);
		int num1 =100;
		System.out.println("num1" +num1);
		
		num1 =200;
		System.out.println("num1 :" +num1);
		System.out.println("num :" +num);
		
		
		int[] arr1 = {1,2,3,4,5};
		System.out.println("arr1 출력");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println();
		int[] arr2 = arr1; //얕은 복사(한 배열의 주소를 두개의 변수가 공유)
		
		System.out.println("arr2 출력");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		
		System.out.println();
		arr2[2] = 300; //복사된 배열의 데이터를 수정하면 원본데이터도 같이 수정(이유는 -> 두 배열은 같은배열 이기 때문에)
		System.out.println("arr2 출력");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		
		System.out.println();
		
		System.out.println("arr1 출력");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+"\t");
		}
	}
	public void test2() {
		int[] arr1 = {1,2,3,4,5};
		//배열의 깊은 복사(한 배열의 주소를 공유하는 것이 아니라 동인한 혀앹의 배열을 새로운 주소에 복사하는 개념)
		//깊은복사 하는방법 3가지
		//1)직접 복사를 한다.
		int[] arr2 = new int[arr1.length];//원본배열과 같은 자료형과 길이로 기본배열 생성
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("arr1 출력");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] +"\t");
		}
		System.out.println();
		System.out.println("arr2 출력");
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i] +"\t");
		}
		System.out.println();
		
		arr2[2] =300;
		System.out.println("arr2 출력");
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i] +"\t");
		}
		System.out.println();
		
		
		System.out.println("arr1 출력");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] +"\t");
		}
		System.out.println();
		//2) System.arraycopy를 사용(배열의 일부 데이터만 복사 가능)
		int[] arr3 = new int[arr1.length];
		//System.arraycopy(5개 값 설정)
		/*
		 원본배열,
		 원본배열 중 복사를 시작할 인덱스번호,
		 데이터가 복사될 배열,
		 데이터가 복사 될 배열 중 데이터가 들어갈 시작위치,
		 복사할 데이터길이		
		 */
		System.arraycopy(arr1, 1, arr3, 0, 3);
		System.out.println("arr3 출력");
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+ "\t");
		}
		System.out.println();
		//3) clone() : 복제의 개념
		int[] arr4 = arr1.clone();
		System.out.println("arr4 출력");
		for(int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i]+"\t");
		}
		System.out.println();
	}
	public void test3() {//[],[] 앞 행, 뒤 열 번호
		//2차원 배열 -> 배열의 자료형이 배열인 데이터 형태
		int[][] arr = new int[2][3];
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void test4() {
		int[][] arr = new int [5][5];	
		/*
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		*/
		int k = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
		/*
		for(int i=0; i<arr[0].length; i++) {
			arr[0][i] = k++;
		}
		for(int i=0; i<arr[1].length; i++) {
			arr[1][i] = k++;
		}
		for(int i=0; i<arr[2].length; i++) {
			arr[2][i] = k++;
		}
		for(int i=0; i<arr[3].length; i++) {
			arr[3][i] = k++;
		}
		for(int i=0; i<arr[4].length; i++) {
			arr[4][i] = k++;
		}
		*/
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void exam1() {
		int[][] arr = new int [5][5];
		int k = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[4-i][j] = k++;
			}
		}
		
		/*
		for(int j=0; j<arr[0].length;j++) {
			arr[0][4-j] = k++;
		}
		for(int j=0; j<arr[0].length;j++) {
			arr[1][4-j] = k++;
		}
		for(int j=0; j<arr[0].length;j++) {
			arr[2][4-j] = k++;
		}
		for(int j=0; j<arr[0].length;j++) {
			arr[3][4-j] = k++;
		}
		for(int j=0; j<arr[0].length;j++) {
			arr[4][4-j] = k++;
		}
		
		arr[0][4] = k++;
		arr[0][3] = k++;
		arr[0][2] = k++;
		arr[0][1] = k++;
		arr[0][0] = k++;
		*/
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void exam2() {
		int[][] arr = new int [5][5];
		int k = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[j][i] = k++;
			}
		}
		/*
		arr[0][0] =k++;
		arr[1][0] =k++;
		arr[2][0] =k++;
		arr[3][0] =k++;
		arr[4][0] =k++;
		*/
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void exam3() {
		int[][] arr = new int [5][5];
		int k = 1;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[4-j][i] = k++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void exam4() {
		
		int[][] arr = new int [5][5];
		int k = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = k++;			
			}
		}

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void snail() {										//달팽이배열
		System.out.print("2차원 배열 크기 입력(정방형) > ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];					//입력받은크기의 정방형 배열 생성
		int k = 1;												//배열안의 채울 값 변수
		int inc =1;											//인덱스번호 증감용 변수
		int r=0;												//2차원배열 행 인덱스번호
		int c=-1;												//2차원배열 열 인덱스번호
		while(size>0) {
			for(int i=0;i<size;i++) {
				c=c+inc;
				arr[r][c]=k;
				k++;
			}
			size--;
			for(int i=0;i<size;i++) {
				r=r+inc;
				arr[r][c]=k;
				k++;
			}
			inc = -inc;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void bobbleSort() {
		Scanner scanner = new Scanner(System.in);

		int[]arr = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + "번째 숫자 입력 : ");

			arr[i] = scanner.nextInt();

			sum += arr[i];

			}
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length-1-i; j++) {

			if (arr[j] > arr[j + 1]) {

			int temp = arr[j];

			arr[j] = arr[j + 1];

			arr[j + 1] = temp;

			}
			}
		}
		System.out.print("정렬 결과 : ");
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + "\t");

		}
		System.out.println("\n입력한 수의 총 합은 : " + sum);
		}
	}


