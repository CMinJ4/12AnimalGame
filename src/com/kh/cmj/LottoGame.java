package com.kh.cmj;

public class LottoGame {
	private String name; // 이름
	private String level; // 등급
	private	int money; // 잔액
	private int playCount; // 게임횟수
	private int difficulty; // 게임 난이도
	
	// 초기화
	public LottoGame() {
		playCount = 0;
		level = "브론즈";
	}
	
	public LottoGame(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// gettet 메소드
	public String getName() {
		return this.name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int getPlayCount() {
		return playCount;
	}
	
	public String getLevel() {
		return level;
	}
	
	public int getDifficulty() {
		return difficulty;
	}
	
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void setPlayCount(int playCount) {//복권 구입수 저장
		this.playCount = playCount;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
}
