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
				System.out.printf("������ �����մϴ�.\n\n");
				System.out.println();
				break end;
			default :
				System.out.printf("�ٽ� �Է����ּ���.\n\n");
				break;
			}
			
			if(lFunc.nowMoney() <= 0) {
				System.out.printf("�ܾ��� ���� �����ϼ̽��ϴ�.\n");
				lFunc.lastPrint();
				System.out.printf("�����ϼ̽��ϴ� : )\n\n");
				break end;
			}
		}
	}
}
