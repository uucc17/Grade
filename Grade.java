import java.util.Scanner;
public class Grade{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		for(int i=1; i<=5; i++){
	
			System.out.print("학번 : ");
			String num=scan.next();

			System.out.print("이름 : ");
			String nam=scan.next();

			System.out.print("국어 : ");
			int kor=scan.nextInt();

			System.out.print("수학 : ");
			int mat=scan.nextInt();

			System.out.print("영어 : ");
			int eng=scan.nextInt();

			System.out.print("자바 : ");
			int jav=scan.nextInt();

			int a=(kor+mat+eng+jav);		     //점수의 합
			double b=(kor+mat+eng+jav)/(double)4; //점수 평균

			System.out.printf("%s %s %d %d %d %d %d %.2f ", num, nam, kor, eng, mat, jav, a, b); //전체 정리
		
			if (b>=90) {
				System.out.println("A");
			}
			else if(b>=80) {
				System.out.println("B");
			}
			else if(b>=70) {
				System.out.println("C");
			}
			else if(b>=60) {
				System.out.println("D");
			}
			else {
				System.out.println("E");
			}
		}
	}
}

//학 이 국 영 수 자 총 평균 한줄로
//5명, 각각출력, 메시지 출력 - 첫번째학생 데이터 입력