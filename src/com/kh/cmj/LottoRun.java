package com.kh.cmj;

public class LottoRun {
	public static void main(String [] args) {
		LottoGameFunction lFunc = new LottoGameFunction();
		LottoGame lGame = new LottoGame();
		lFunc.startGame();
		
		end :
		while(true) {
			int choice = lFunc.printMenu();
			lFunc.levelSet();
			//int money = lGame.getMoney();
			//System.out.println(money);
			
			/*if(lGame.getMoney() <= 0) {
				System.out.println("모든 잔액을 소진하였습니다.");
				System.out.printf("게임을 종료합니다.\n\n");
				break end;
			}else {*/
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
			//}
		}
	}
}
