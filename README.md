# 12AnimalGame
___ 
## 주제
12지신 복권 게임
___ 
### 요구사항
- 플레이어의 이름과 초기잔액을 입력받는다.
- 복권은 12지신의 동물의 이름을 랜덤하게 넣어준다.<br/>
	[쥐 / 소 / 호랑이 / 토끼 / 용 / 뱀 / 말 / 양 / 원숭이 / 닭 / 개 / 돼지]<br/>
	[쥐 / 소 / 호 / 토 / 용 / 뱀 / 말 / 양 / 원 / 닭 / 개 / 돼] 동물은 앞글자로 표시
- 복권 하나에 다섯게임(한게임에 랜덤 이름이 두개)이 들어간다.
- 한게임당 랜덤으로 들어간 이름 두개가 일치하면 당첨된다.
- 당첨시 플레이어의 잔액이 당첨금만큼 증가한다.
	(당첨금은 복권 구입비용의 2배이다.)
- 잔액에 따라 플레이어의 등급을 나눈다.
	[브론드 = 10만원 이하, 실버 = 100만원 이하, 골드 = 100만원 이상]


**- 복권 예시**
	[용][닭]	[낙첨]
	[닭][닭]	[당첨] -> 잔액 + 구입비용 x 2
	[소][쥐]	[낙첨]
	[양][호]	[낙첨]
	[원][원]	[당첨] -> 잔액 + 구입비용 x 2


**- 초기화면**
	====== 12지신 복권 게임 ======
	1. 게임 설명.
	2. 복권 구입.
	3. 정보 출력.
	4. 게임 종료.
	메뉴 입력 : 


**- 복권 구입 화면**
	복권을 얼마 구입하겠습니까? :

	===== 12지신 복권 =====
	= [용][돼]   [낙첨] =
	= [닭][양]   [낙첨] =
	= [토][쥐]   [낙첨] =
	= [돼][양]   [낙첨] =
	= [소][말]   [낙첨] =
	====================
	총 당첨금 : 0
	현재 잔액 : 198000


**- 정보 출력 화면**
	이름 : 최민준
	잔액 : 198000
	등급 : 실버
	총 복권 구입수 : 1
___ 
