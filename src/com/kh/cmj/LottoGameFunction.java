package com.kh.cmj;

import java.util.Random;
import java.util.Scanner;

public class LottoGameFunction {
	LottoGame lottoGame;
	
	//�ʱ�ȭ
	public LottoGameFunction() {
		lottoGame = new LottoGame();
	}
	
	//ù ���ȭ�� �� �ѹ� �����.
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 12���� ���� ���� ======");
		System.out.print("����� �̸� �Է� : ");
		lottoGame.setName(sc.next());
		
		end1:
		while(true) {
			try{	
				System.out.print("�ʱ� �ڱ� : ");
				lottoGame.setMoney(sc.nextInt());
				System.out.println();
			
				break end1;
			}catch(java.util.InputMismatchException e) {
				System.out.println("�ٽ� �Է����ּ��� : )");
				sc.next();
			}
		}
		
		setDifficulty();
		
//		end2:
//		while(true) {
//			try{	
//				System.out.println("���̵� ����");
//				System.out.println("(���� 1 / ���� 2 / ����� 3) : ");
//				lottoGame.setDifficulty(sc.nextInt());
//				System.out.println();
//				
//				if(lottoGame.getDifficulty() > 3) {
//					System.out.println("�ٽ� �Է����ּ��� : )");
//					System.out.println();
//				}else {
//					break end2;
//				}
//				
//			}catch(java.util.InputMismatchException e) {
//				System.out.println("�ٽ� �Է����ּ��� : )");
//				System.out.println();
//				sc.next();
//			}
//		}
	}
	
	//�޴� ���ȭ��
	public int printMenu() {
			int menu = 0;
		end:
			
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("====== 12���� ���� ���� ======");
			System.out.println("1. ���� ����.");
			System.out.println("2. ���� ����.");
			System.out.println("3. ���� ���.");
			System.out.println("4. ���̵� ����. ");
			System.out.println("5. ���� ����.");
			System.out.print("�޴� �Է� : ");
			try {
				menu = sc.nextInt();
				System.out.println();
				break end;
			}catch(java.util.InputMismatchException e) {
				System.out.println();
				System.out.printf("�ٽ� �Է����ּ���.\n\n");
				sc.next();
			}
		}
		return menu;
	}
	
	//���� �� ����
	public void gameRules() {
		System.out.println("======= 12���� ���� ���� ���� =======");
		System.out.println("- ������ ���ϴ� �ݾ����� ������ �� �ֽ��ϴ�.");
		System.out.println("- ���� �ϳ����� �� �ټ����� ��÷ ��ȸ�� �ֽ��ϴ�. ");
		System.out.println("- 12������ �������� ���� �̸��� �����ϸ� ��÷�Դϴ�.");
		System.out.println("- ���� ��÷�� ��÷���� �����Ͻ� �ݾ��� 2�� �Դϴ�.");
		System.out.println("===���̵�===");
		System.out.println("1 ~ 3 ������ ���̵��� ������ 1�� ���� �����ϴ�.");
		System.out.println("���̵��� ���� ���� �Ѱ��Ӵ� �����Ǵ� ������ �޶����ϴ�.");
		System.out.println("1 = 10�� / 2 = 8�� / 3 = 5��.");
		System.out.println();
		System.out.println("===����===");
		System.out.println("���� 3000�� ����.");
		System.out.println("[[[��]]][[[��]]] [��÷] -> 6000��");
		System.out.println("[[�䳢]][ȣ����] [��÷] -> 0��");
		System.out.println("[[[��]]][[[��]]] [��÷] -> 0��");
		System.out.println("[[[��]]][[[��]]] [��÷] -> 0��");
		System.out.println("[[[��]]][[[��]]] [��÷] -> 6000��");
		System.out.println("�̷��� �Ǹ� �Ѱ��ӿ� �� 12000�� ��÷ �Դϴ�.");
		System.out.println();
		System.out.println("�÷��̾� ��޾ȳ�");
		System.out.println("�ܾ� 10���� ���� = �����");
		System.out.println("�ܾ� 100���� ���� = �ǹ�");
		System.out.println("�ܾ� 100���� �̻� = ���");
		System.out.println("=================================");
		System.out.println();
		System.out.println();
	}
	
	// ��������
	public void buyLotto() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		//���̵��� ���� �����Ǵ� ������ �� ����
		int difficulty = 0;
		if(lottoGame.getDifficulty() == 1) {
			difficulty = 20;
		}else if(lottoGame.getDifficulty() == 2) {
			difficulty = 16;
		}else if(lottoGame.getDifficulty() == 3) {
			difficulty = 10;
		}
		
		System.out.print("������ �� �����ϰڽ��ϱ�? : ");
		int buy = sc.nextInt();
		System.out.println();
		int sum = 0;
		
		String [] playerLotto = new String[difficulty]; // �÷��̾� ������ ������ ���ڷ� ���� 1 ~ 12
		//playerLotto[0 ~ 9]
		String [] god12 = {"[[��]]", "[[��]]", "ȣ����", "[�䳢]", "[[��]]", "[[��]]", "[[��]]", "[[��]]", "������", "[[��]]", "[[��]]", "[����]"};
		//�� / �� / ȣ���� / �䳢 / �� / �� / �� / �� / ������ / �� / �� / ����
		//god12[0 ~ 11]
		while(true) {
			if(buy > lottoGame.getMoney()) {
				System.out.println("�ܾ��� �����մϴ�.");
				System.out.printf("���� �ܾ� : %d\n", lottoGame.getMoney());
				System.out.printf("������ �� �����ϰڽ��ϱ�? : ");
				buy = sc.nextInt();
			}else {
				lottoGame.setMoney(lottoGame.getMoney()- buy);
				System.out.println("= 12���� ���� ================");
				//���ǻ���
				for(int i = 0; i < playerLotto.length; i++) {
					playerLotto[i] = god12[rand.nextInt(12)];
				}
				
				//���� ��÷ Ȯ��
				for(int i = 0; i < playerLotto.length; i+=2) {
					System.out.printf("= [%s][%s]",playerLotto[i],playerLotto[i+1]);
					if(playerLotto[i] == playerLotto[i+1]) {
						System.out.print("    [��÷] =");
						lottoGame.setMoney(lottoGame.getMoney()+buy*2);
						sum += buy*2;
					}else {
						System.out.print("    [��÷] =");
					}
					System.out.println();
				}
				System.out.println("==============================");
				System.out.printf("�� ��÷�� : %d\n",sum);
				System.out.printf("���� �ܾ� : %d\n", lottoGame.getMoney());
				lottoGame.setPlayCount(lottoGame.getPlayCount()+1);
				
				System.out.println();
				break;
			}
		}
	}
	// ������� ���
	public void showPlayer() {
		System.out.println("====== �÷��̾� ���� ======");
		System.out.println("�̸� : " + lottoGame.getName());
		System.out.println("�ܾ� : " + lottoGame.getMoney());
		System.out.println("��� : " + lottoGame.getLevel());
		System.out.println("���̵� : " + lottoGame.getDifficulty());
		System.out.println("�� ���� ���Լ� : " + lottoGame.getPlayCount());
		System.out.println();
	}
	
	//���� ����
	public void levelSet() {
		if(lottoGame.getMoney() <= 100000) {
			lottoGame.setLevel("�����");
		}else if(lottoGame.getMoney() <= 1000000) {
			lottoGame.setLevel("�ǹ�");
		}else if(lottoGame.getMoney() > 1000000) {
			lottoGame.setLevel("���");
		}
	}
	
	//���� �ܾ��� return��
	public int nowMoney() {
		return lottoGame.getMoney();
	}
	
	//���� ��ް� ���� ����Ƚ�� ���
	public void lastPrint() {
		System.out.println("���� ���� ���Լ� : " + lottoGame.getPlayCount());
		System.out.println("���� ��� : " + lottoGame.getLevel());
	}
	
	//���̵��� �����Ѵ�.
	public void setDifficulty() {
		Scanner sc = new Scanner(System.in);
		end:
		while(true) {
			try{	
				System.out.println("���̵� ����");
				System.out.println("(���� 1 / ���� 2 / ����� 3) : ");
				lottoGame.setDifficulty(sc.nextInt());
				System.out.println();
				
				if(lottoGame.getDifficulty() > 3) {
					System.out.println("�ٽ� �Է����ּ��� : )");
					System.out.println();
				}else {
					break end;
				}
				
			}catch(java.util.InputMismatchException e) {
				System.out.println("�ٽ� �Է����ּ��� : )");
				System.out.println();
				sc.next();
			}
		}
	}

}
