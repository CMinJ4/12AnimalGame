package com.kh.cmj;

public class LottoRun {
	public static void main(String [] args) {
		LottoGameFunction lFunc = new LottoGameFunction();
		lFunc.startGame();
		
		end :
		while(true) {
			int choice = lFunc.printMenu();
			lFunc.levelSet();
			 
			switch(choice) {
			case 1 :
				lFunc.gameRules();
				break;
			case 2 :
				lFunc.buyLotto();
				break;
			case 3 :
				lFunc.showPlayer();
				break;
			case 4 :				
				System.out.printf("게임을 종료합니다.\n\n");
				System.out.println();
				break end;
			default :
				System.out.printf("다시 입력해주세요.\n\n");
				break;
			}
			
			if(lFunc.nowMoney() <= 0) {
				System.out.printf("잔액을 전부 소진하셨습니다.\n");
				lFunc.lastPrint();
				System.out.printf("수고하셨습니다 : )\n\n");
				break end;
			}
		}
	}
}
