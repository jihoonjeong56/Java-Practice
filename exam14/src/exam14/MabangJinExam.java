package exam14;

import java.util.Arrays;

public class MabangJinExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mabangjin = new int[5][5];
		
		int row =0;//행의 위치
		int col =2;//열의 위치
		
		//마방진 시작위치 설정
		mabangjin[row][col]=1;
		for(int i=2; i<=25; i++) {
			//위치이동 오른쪽 대각 위
			row--;
			col++;
			//1.row가 벗어난다면
			if(row <0&& col<5) {
				//해당열의 마지막행
				row =4;
			}
			//2.col가 벗어난다면
			if(row >=0 && col>4) {
				//해당행의 마지막열
				col =0;
			}
			//3.row,col 가 벗어난다면
			if(row <0 && col>4) {
				//행이 2칸 밑으로 열이 ㅎ1칸 위로
				row += 2;
				col--;
			}
			//4.이동위치에 값이 있는경우
			if(mabangjin[row][col] != 0) {
				//행이 2칸 밑으로 열이 ㅎ1칸 위로
				row += 2;
				col--;
			}
			mabangjin[row][col] = i;
		}
		for(int i=0; i<mabangjin.length; i++) {
			System.out.println(Arrays.toString(mabangjin[i]));
		}

	}

}
