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
				System.out.println("��� �ܾ��� �����Ͽ����ϴ�.");
				System.out.printf("������ �����մϴ�.\n\n");
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
					System.out.printf("������ �����մϴ�.\n\n");
					System.out.println();
					break end;
				default :
					System.out.printf("�ٽ� �Է����ּ���.\n\n");
					break;
				}
			//}
		}
	}
}
