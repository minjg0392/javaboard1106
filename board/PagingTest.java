package board;

import java.util.Scanner;

public class PagingTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int currentPageNo = 1;
		
		while(true) {
			System.out.print("페이징 명령어를 입력해주세요 ((prev : 이전,  next : 다음,  go : 선택,  back : 뒤로가기):");
			String pageCmd = sc.nextLine();

			if(pageCmd.equals("prev")) {
				currentPageNo--;
			} else if(pageCmd.equals("next")) {
				currentPageNo++;
			} else if(pageCmd.equals("go")) {
				System.out.print("몇번 페이지로 이동하시겠습니까 : ");
				currentPageNo = Integer.parseInt(sc.nextLine());
			}

			// 2. 현재페이지가 5 > 6으로 바뀔 때 페이지를 6 7 8 9 10
			
			
			if(currentPageNo <= 5) {
				for(int i = 1; i <= 5; i++) {
					if(i == currentPageNo) {
						System.out.print("[" + i + "] ");				
					} else {
						System.out.print(i + " ");
					}
				}
			} else if(currentPageNo > 5) {
				for(int i = 6; i <= 10; i++) {
					if(i == currentPageNo) {
						System.out.print("[" + i + "] ");				
					} else {
						System.out.print(i + " ");
					}
				}
			}
			
		}
		
		
		
		
	}

}
