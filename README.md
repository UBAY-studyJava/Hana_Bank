# 본인 소개
<img src="증명사진 (1).jpg" width="160" height="200"/><br>
이름 : 구재희 <br> 
skill set <br> 
Frontend - HTML, CSS, Javascript <br>
Backend - Java, Spring, Oracle <br>
Analysis - R, SAS <br>
<br>
수상 <br>
제 5회 L.POINT Big Data Competition (장려상) <br>
The 8th KCB  데이터를 이용한 금융스타일 시각화 경진대회(Rank9) <br>


# 프로젝트 : 계좌 관리 및 분석 웹 서비스


## 발표 ppt 
[발표자료 pdf](/하나금융티아이_구재희_최종발표(pdf).pdf)<br>

## 시연 동영상 
https://youtu.be/eDuqK-9gwCM







# 1. 프로젝트 개요

 현재 디지털 금융 산업의 패권은 신생 핀테크 업체들이 기존의 대형 금융그룹인 빅뱅크 기업들에게 공세를 펴는 형국입니다. 토스, 뱅크샐러드와 같은 업체들은 사회 초년생들인 20대의 이용량이 각각 45%, 43%를 차지할 정도로 20대에 대한 의존도가 높습니다. 그 이유는 금융IT 서비스를 새롭게 접하는 사회 초년생들이 재미있고 똑똑하게 자산을 관리할 수 있다는 인식을 가지고 있기 때문입니다.
 이번 프로젝트의 목적은 기존의 계좌관리 서비스를 구현하는 것에서 나아가, 핀테크 기업들이 가지고 있는 특징 중에서 분석하기, 도전하기라는 테마를 벤치마킹해 20대 손님들을 유입시킬 수 있는 계좌관리 서비스를 구현하는 것입니다.

# 2. 프로젝트 요약

담당 업무 <br>
- 기획, DB모델링, 프론트앤드, 백앤드 등 모든 과정 <br>

사용 기술 <br>
- spring 기반 웹 어플리케이션 제작 <br>
- JavaMailSender, scheduler를 이용한 정기 메일 서비스 <br>
- Google chart API를 이용한 동적 시각화 <br>
- Kakao message API를 이용한 링크 전송 <br>
- R 연동 후 Holt-Winters모형을 이용한 지출액 예측 <br>

개발 환경 <br>
Language : Java, Javascript, HTML, CSS, R <br>
DB : Oracle 11g XE <br>
WEB server : Apache <br>
WAS server : Tomcat 9 <br>
JDB : JDK 1.8 <br>
Framework : Spring4, MyBatis <br>
Build tool : maven <br>
GUI : eclipse, sqldeveloper <br>
VCS : Github, sorucetree <br>

요구사항서 <br>

입출금 자유 예금 계좌<br>

- 보유한 입출금 계좌 정보와 보유 입출금 계좌의 총액을 볼 수 있습니다<br>
- 상세 정보 조회하여, 별칭을 변경할 수 있고 메인 계좌로 등록시킬 수 있습니다<br>
- 상세 내역을 볼 수 있고, 월별, 카테고리별, 키워드별로 조회가능합니다<br>
- 입출금 계좌를 개설할 수 있습니다<br>
- 입출금 계좌를 삭제할 수 있고, 삭제 시 메인 계좌로 자동이체 됩니다<br>

정기 적금 계좌<br>

- 매월 입금 추이를 그래프로 볼 수 있습니다<br>
- 입금 회자별 입금액 테이블을 볼 수 있습니다<br>
- 월 평균 입금액과 남은 만기일을 확인할 수 있습니다<br>
- 상세 정보를 확인할 수 있고, 별칭, 입금 일자, 출금 계좌를 변경할 수 있습니다<br>
- 예약 이체 설정이 가능하고, 예약 이체 시 월 평균 입금액이 자동으로 입금됩니다<br>
- 적금 상품을 개설할 수 있습니다<br>
- 적금 상품 개설 시 초기 가입 금액은 설정한 출금계좌에서 자동이체됩니다<br>
- 예약 이체를 해지할 수 있습니다<br>

계좌이체<br>

- 최근 이체 목록을 확인할 수 있습니다<br>
- 즐겨찾는 계좌 목록을 관리(추가/삭제)할 수 있습니다<br>
- 이체 시 즐겨찾는 계좌, 입금액 추가 버튼으로 편의성을 제공합니다<br>
- 정기 예약 이체 서비스를 이용할 수 있습니다<br>

현금관리<br>

- 현재 현금 보유 상태를 확인할 수 있습니다<br>
- 직접 현금 보유 내역을 기록할 수 있습니다<br>
- 내역을 삭제할 수 있습니다<br>

순자산<br>

- 순자산을 확인할 수 있습니다<br>
- 지난 달 대비 순자산 증가액을 확인할 수 있습니다<br>

분석하기<br>

- 자신과 같은 나이대이면서 같은 직군의 직업을 가진 회원들이 가장 많이 가입한 <br>
  입출금 예금 상품과 정기 적금 상품을 확인할 수 있습니다<br>
- 이번 달 자신의 지출 내역 중 지출액이 가장 컸던 내역 3개를 볼 수 있습니다<br>
- 이번 달 자신의 지출이 잦았던 내역을 볼 수 있습니다<br>
- 이번 달 지출이 가장 많았던 카테고리를 알 수 있고, <br>
  이 카테고리의 최근 2개월 지출 추이 그래프를 볼 수 있습니다<br>
- 이번 달 카테고리별 지출 비율과 총 지출액, 지출 내역을 보여줍니다<br>
- 이번 달 주차별 지출 내역을 알려주고, <br>
  주 평균 지출액과 이번 주 지출액을 비교해줍니다<br>
- 최근 3개월 수입, 지출 그래프를 보여주고, <br>
  잔여금이 연속 증가할 경우 적금 가입을 권유받을 수 있습니다<br>
- 예측된 자신의 지출액(3개월) 추이 그래프를 확인할 수 있습니다<br>

정기 메일 받기<br>

- 메일 서비스를 신청하면 매월 말일에 EDA내용을 메일로 받을 수 있습니다<br>
- 정기 메일 서비스를 취소할 수 있습니다<br>

도전하기<br>

- 총 10개의 소비 카테고리 중 , 지출을 줄이고 싶은 카테고리를 <br>
  선택할하여 도전을 진행할 수 있습니다<br>
- 선택한 카테고리의 이전 달 지출액을 확인 후, <br>
   목표 지출액을 설정하여 도전을 시작할 수 있습니다<br>
- 도전 설정 시 목표 금액, 현재까지의 지출액, 도전 마감일, <br>
  도전 상태, 도전 달성 가능한 하루 예상 지출액을 알 수 있습니다<br>
- 해당 카테고리의 지출액이 목표금액의 70%가 되면 경고 멘트를 띄웁니다<br>

도전 공유하기<br>

- 도전을 공유하고 싶은 친구에게 공유 요청을 보낼 수 있습니다<br>
- 공유 시 친구에게 카카오톡으로 링크를 보내줄 수 있습니다<br>
- 자신이 보낸 요청의 승인/거절 상태를 볼 수 있고, <br>
  받은 요청을 승인/거절할 수 있습니다<br>
- 공유가 승인된 친구들의 모든 도전 상태 정보를 볼 수 있습니다<br>

주요 서비스 <br>

1. 입출금 자유 예금 계좌, 정기 적금 계좌 상품 가입 및 관리 <br>
2. 계좌 이체(최근 이체 목록, 즐겨찾는 계좌 관리, 자동 이체)<br>
3. 순자산 및 현금 관리<br>
4. 지출 상태 분석 및 분석 내용 정기 메일 발송<br>
5. 지출 줄이기 도전 및 카카오 알림<br>

기대 효과 <br>

 자산 관리에 미숙한 사회 초년생이 쉽고 똑똑하게 자신의 자산을 관리할 수 있도록 분석하기 및 도전하기 서비스를 제공함으로써 20대 손님의 유입을 증가시키고, 분석내용을 토대로 예적금 상품 가입을 권유하여 유입의 확장 효과를 기대합니다. 


   
 
