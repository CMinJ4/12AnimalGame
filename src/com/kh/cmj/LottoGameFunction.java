package com.kh.cmj;

import java.util.Random;
import java.util.Scanner;

public class LottoGameFunction {
	LottoGame lottoGame;
	
	//초기화
	public LottoGameFunction() {
		lottoGame = new LottoGame();
	}
	
	//첫 출력화면 딱 한번 실행됨.
	public void startGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 12지신 복권 게임 ======");
		System.out.print("사용자 이름 입력 : ");
		lottoGame.setName(sc.next());
		
		end:
		while(true) {
			try{	
				System.out.print("초기 자금 : ");
				lottoGame.setMoney(sc.nextInt());
				System.out.println(lottoGame.getMoney());
				System.out.println();
				break end;
			}catch(java.util.InputMismatchException e) {
				System.out.println("숫자만 입력하세요!");
				sc.next();
			}
		}
	}
	
	//메뉴 출력화면
	public int printMenu() {
			int menu = 0;
		end:
			
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("====== 12지신 복권 게임 ======");
			System.out.println("1. 게임 설명.");
			System.out.println("2. 복권 구입.");
			System.out.println("3. 정보 출력.");
			System.out.println("4. 게임 종료.");
			System.out.print("메뉴 입력 : ");
			try {
				menu = sc.nextInt();
				System.out.println();
				break end;
			}catch(java.util.InputMismatchException e) {
				System.out.println();
				System.out.printf("다시 입력해주세요.\n\n");
				sc.next();
			}
		}
		return menu;
	}
	
	//게임 룰 설명
	public void gameRules() {
		System.out.println("======= 12지신 복권 게임 설명서 =======");
		System.out.println("- 복권은 원하는 금액으로 구입할 수 있습니다.");
		System.out.println("- 복권 하나에는 총 다섯번의 당첨 기회가 있습니다. ");
		System.out.println("- 12지신중 랜덤으로 들어가는 이름이 동일하면 당첨입니다.");
		System.out.println("- 복권 당첨시 당첨금은 구입하신 금액의 2배 입니다.");
		System.out.println();
		System.out.println("예시");
		System.out.println("복권 3000원 구입.");
		System.out.println("[[[용]]][[[용]]] [당첨] -> 6000원");
		System.out.println("[[토끼]][호랑이] [낙첨] -> 0원");
		System.out.println("[[[개]]][[[소]]] [낙첨] -> 0원");
		System.out.println("[[[쥐]]][[[용]]] [낙첨] -> 0원");
		System.out.println("[[[닭]]][[[닭]]] [당첨] -> 6000원");
		System.out.println("이렇게 되면 한게임에 총 12000원 당첨 입니다.");
		System.out.println();
		System.out.println("플레이어 등급안내");
		System.out.println("잔액 10만원 이하 = 브론즈");
		System.out.println("잔액 100만원 이하 = 실버");
		System.out.println("잔액 100만원 이상 = 골드");
		System.out.println("=================================");
		System.out.println();
		System.out.println();
	}
	
	// 게임진행
	public void buyLotto() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("복권을 얼마 구입하겠습니까? : ");
		int buy = sc.nextInt();
		System.out.println();
		int sum = 0;
		
		String [] playerLotto = new String[10]; // 플레이어 구입한 복권을 숫자로 저장 1 ~ 12
		//playerLotto[0 ~ 9]
		String [] god12 = {"[[쥐]]", "[[소]]", "호랑이", "[토끼]", "[[용]]", "[[뱀]]", "[[말]]", "[[양]]", "원숭이", "[[닭]]", "[[개]]", "[돼지]"};
		//쥐 / 소 / 호랑이 / 토끼 / 용 / 뱀 / 말 / 양 / 원숭이 / 닭 / 개 / 돼지
		//god12[0 ~ 11]
		while(true) {
			if(buy > lottoGame.getMoney()) {
				System.out.println("잔액이 부족합니다.");
				System.out.printf("현재 잔액 : %d\n", lottoGame.getMoney());
				System.out.printf("복권을 얼마 구입하겠습니까? : ");
				buy = sc.nextInt();
			}else {
				lottoGame.setMoney(lottoGame.getMoney()- buy);
				System.out.println("===== 12지신 복권 =====");
				//복권생성
				for(int i = 0; i < playerLotto.length; i++) {
					playerLotto[i] = god12[rand.nextInt(12)];
				}
				
				//복권 당첨 확인
				for(int i = 0; i < 10; i+=2) {
					System.out.printf("= [%s][%s]",playerLotto[i],playerLotto[i+1]);
					if(playerLotto[i] == playerLotto[i+1]) {
						System.out.print("    [당첨] =");
						lottoGame.setMoney(lottoGame.getMoney()+buy*2);
						sum += buy*2;
					}else {
						System.out.print("    [낙첨] =");
					}
					System.out.println();
				}
				System.out.println("====================");
				System.out.printf("총 당첨금 : %d\n",sum);
				System.out.printf("현재 잔액 : %d\n", lottoGame.getMoney());
				lottoGame.setPlayCount(lottoGame.getPlayCount()+1);
				
				System.out.println();
				break;
			}
		}
	}
	// 현재상태 출력
	public void showPlayer() {
		System.out.println("====== 플레이어 정보 ======");
		System.out.println("이름 : " + lottoGame.getName());
		System.out.println("잔액 : " + lottoGame.getMoney());
		System.out.println("등급 : " + lottoGame.getLevel());
		System.out.println("총 복권 구입수 : " + lottoGame.getPlayCount());
		System.out.println();
	}
	
	//레벨 조정
	public void levelSet() {
		if(lottoGame.getMoney() <= 100000) {
			lottoGame.setLevel("브론즈");
		}else if(lottoGame.getMoney() <= 1000000) {
			lottoGame.setLevel("실버");
		}else if(lottoGame.getMoney() > 1000000) {
			lottoGame.setLevel("골드");
		}
	}
	
	public int nowMoney() {
		return lottoGame.getMoney();
	}
	
	public void lastPrint() {
		System.out.println("최종 복권 구입수 : " + lottoGame.getPlayCount());
		System.out.println("최종 등급 : " + lottoGame.getLevel());
	}
}
