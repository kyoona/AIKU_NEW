<h1 align="center" style="font-weight: bold;">지각을 방지하는 약속 관리 어플리케이션 AIKU ✨</h1>
<p align="center">
  <img align='center' src='https://github.com/user-attachments/assets/d14b7984-07a7-47f5-9b0c-0453487fa9dd' width="700"/></img>
</p>
<p align="center">
  약속을 지키는 그날까지 <b>"약속을 편리하게 관리하고, 재미있게 지각을 방지하자”</b></br></br>
  본 서비스는 (구)https://github.com/kyoona/AiKu_backend 를 개선하여 서비스 런칭을 목표로 하고 있습니다.</br>
  기존 서버는 단일 서버로 구성되었지만 MSA를 목표로 다시 구현중에 있습니다.
</p>
<p align="center">기간 | 2024.08.05 ~ 진행중</p>
<p align="center">팀원 | 곽유나, 최원탁</p>

<p align="center">
 <a href="">API 명세서</a> • 
  <a href="">E-R 다이어그램</a> • 
  <a href="">Entity 설계</a> • 
</p>
<br/>

<h2 id="technologies">🛠️ 기술</h2>

| Category | Stack |
| --- | --- |
| Language | Java |
| Framework | Spring Boot |
| Library | Spring Data JPA, Spring Cloud Gateway, Query DSL |
| Database | H2 |
| Infra | AWS, Kafka, Docker, Kubernetes |
| Cloud Service | Firebase Messaging |

</br>
<h2>💻주요 화면 및 기능</h2>

### 1. 그룹 생성 및 그룹 내 약속 생성
- 그룹을 생성하고 카카오톡 url 공유를 통해 사용자를 초대할 수 있습니다.
- 그룹 내 약속을 생성할 수 있고 사용자는 자유롭게 약속에 참가할 수 있습니다.
- 약속 참가자는 무료 참가자인 '깍두기'와 유료 참가자인 '일반 참가자'로 나뉩니다.
- '일반 참가자'는 약속 시간의 30분 전까지 '꼴찌 고르기' 베팅을 할 수 있습니다.

### 2. 맵 & 실시간 위치 공유
- 약속 시간 30분 전 알림과 함께 맵 기능이 열립니다.
- 맵에서 참가자들의 실시간 위치를 확인할 수 있습니다.
- '일반 참가자'끼리 포인트를 걸고 '레이싱'게임을 진행할 수 있습니다.
- 참가자 모두가 약속 장소에 도착하거나, 약속 시간 30분 후에 알림과 함께 맵이 종료됩니다.

### 3. 결과 분석
- 맵이 종료된 후 도착 순위와 베팅 결과를 확인할 수 있습니다.
- 그룹 내 모든 약속 결과(지각 순위, 베팅 승률 등)를 분석한 결과를 확인할 수 있습니다.

### 4. 포인트 상점
- 사용자는 결제를 통해 현금을 서비스 내 머니인 '아쿠'로 전환할 수 있습니다.
- 스케줄을 통해서 얻은 '아쿠'로 모바일 상품권을 구매할 수 있습니다.

<h2> 진행 과정 </h2>

### 1. 이벤트 스토밍

이벤트 스토밍을 통해 서비스 기획과 로직에 대해 이해관계를 일치시키는 과정을 거쳤다.
1. 이벤트를 탐색한다.
2. 타임라인에 맞게 이벤트를 정리한다.
3. 이벤트를 발생시키는 커멘드를 탐색한다.
4. 이벤트에 해당하는 정책을 추가한다.
5. 외부 시스템을 보강한다.
6. 어그리거트를 탐색한다.
7. 바운디드 컨텍스트의 경계를 찾는다.


<img width="761" alt="스크린샷 2024-10-01 오후 7 55 53" src="https://github.com/user-attachments/assets/426a11b7-980d-4d79-a9e9-413bce325e47">
<img width="727" alt="스크린샷 2024-10-01 오후 7 52 42" src="https://github.com/user-attachments/assets/0539c844-6168-4721-aa00-c130a300471c">

확대하면 다음과 같은 과정을 거친다.
<img width="1027" alt="스크린샷 2024-10-01 오후 7 54 34" src="https://github.com/user-attachments/assets/798c0825-ddf7-411a-a319-b02fb6db9b6e">

### 2. 어그리거트 추출
도메인 별 어그리거트를 추출하고 어그리거트 루트를 지정한다.
<img width="833" alt="스크린샷 2024-10-01 오후 8 24 38" src="https://github.com/user-attachments/assets/a390793d-7145-4d64-a5cf-423b961aa436">

### 3. MSA 분리



