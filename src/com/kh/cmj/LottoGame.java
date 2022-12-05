package com.kh.cmj;

public class LottoGame {
	private String name;
	private String level;
	private	int money;
	private int playCount;
	
	// �ʱ�ȭ
	public LottoGame() {
		playCount = 0;
		level = "�����";
	}
	
	public LottoGame(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// gettet �޼ҵ�
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
	
	// setter �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
}
