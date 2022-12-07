# 12AnimalGame

## 12지신 복권 게임


### 요구사항<br/>
- 플레이어의 이름과 초기잔액을 입력받는다.
- 복권은 12지신의 동물의 이름을 랜덤하게 넣어준다.<br/>
	[쥐 / 소 / 호랑이 / 토끼 / 용 / 뱀 / 말 / 양 / 원숭이 / 닭 / 개 / 돼지]<br/>
	[쥐 / 소 / 호 / 토 / 용 / 뱀 / 말 / 양 / 원 / 닭 / 개 / 돼] 동물은 앞글자로 표시
- 복권 하나에 다섯게임(한게임에 랜덤 이름이 두개)이 들어간다.
- 한게임당 랜덤으로 들어간 이름 두개가 일치하면 당첨된다.
- 당첨시 플레이어의 잔액이 당첨금만큼 증가한다.<br/>
	(당첨금은 복권 구입비용의 2배이다.)
- 잔액에 따라 플레이어의 등급을 나눈다.<br/>
	[브론드 = 10만원 이하, 실버 = 100만원 이하, 골드 = 100만원 이상]


**- 복권 예시**<br/>
	[용][닭]	[낙첨]<br/>
	[닭][닭]	[당첨] -> 잔액 + 구입비용 x 2<br/>
	[소][쥐]	[낙첨]<br/>
	[양][호]	[낙첨]<br/>
	[원][원]	[당첨] -> 잔액 + 구입비용 x 2<br/>
<br/>

**- 초기화면**<br/>
	====== 12지신 복권 게임 ======<br/>
	1. 게임 설명.<br/>
	2. 복권 구입.<br/>
	3. 정보 출력.<br/>
	4. 게임 종료.<br/>
	메뉴 입력 : <br/>
<br/>

**- 복권 구입 화면**<br/>
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
<br/>

**- 정보 출력 화면**<br/>
	이름 : 최민준<br/>
	잔액 : 198000<br/>
	등급 : 실버<br/>
	총 복권 구입수 : 1<br/>
___ 
### 2022.12.05 업데이트<br/>
- 잘못된 입력에 대한 예외처리<br/>
- 잔액이 0원이 되었을때 최종 화면 출력 후 게임종료
- 복권 구입하면 동물들 이름이 모두 출력되도록 변경

___ 
### 2022.12.06 업데이트<br/>
- 난이도 추가.<br/>
초기 화면에서 난이도 선택 ( 1 ~ 3 )<br/>
난이도에 따라 복권 구입시 생성되는 양이 달라짐<br/>
1 = 10개 / 2 = 8개 / 3 = 5개<br/>
- 메뉴에 난이도 변경가능.
- 게임설명에 난이도에 대한 설명 추가.
