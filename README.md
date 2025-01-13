# Final-Project
더조은 파이널 프로젝트

# :pushpin: FunSpot

### 프로젝트 주제 및 선정 배경,기획의도
>"여행 코스 추천 및 커뮤니티 플랫폼 개발"
사용자가 맞춤형 여행 코스를 설계하고 맛집, 관광 명소, 숙박 정보를 공유하며 소통할 수 있는 웹사이트를 제작. 
분산된 여행 정보를 통합 제공하고, 커뮤니티 활성화를 통해 사용자 경험과 만족도를 높이는 것이 목표.

### 프로젝트 내용
>사용자 커스텀 데이트코스를 통해 사용자들끼리 공유하고 피드를통해 여행 커뮤니티를 활성화하고 기존의 유명한 장소뿐만 아니라
 숨겨진 명소들을 공유하고 여행할 수 있도록 함

### 활용방안 및 기대 효과
>코로나19이후 여행자들이 급증함에 따라 각 지역의 숨겨진 명소를 발견하고 수도권뿐만 아니라 각 지역의 관광산업의 발전을
 기대해 볼 수 있음

### 벤치마킹 사이트
> 완벽한 하루: https://xn--2s2b33eb3kgvpta.com/

> 데이트 팝: https://datepop.co.kr/

>앱으로 제작된 사이트이지만 앱과 웹의 기능 과 구조를 참고

</br>

## 1. 제작 기간 & 참여 인원 & 참여부분
- 제작 기간 : 2024년 11월 20일 ~ 2025년 1월 7일
  
- 참여 인원 : 더조은컴퓨터학원 팀 프로젝트(6명) & 웹 디자이너 협업
  
- 참여 부분
  - 팀에서 역할 : 팀장 및 웹 디자이너 협업 커뮤니케이션
  - 참여 기능 : 회원가입,로그인,이메일인증,약관동의,OAuth2 로그인</br>
  회원탈퇴,정보수정,아이디 & 비밀번호찾기

</br>

## 2. 사용 기술
####
  - Java 17
  - REACT
  - MySQL 8.4
  - Spring Boot
  - JWT
  - TailWindCSS
  - 공공데이터포탈 API
  - 카카오,네이버 지도 API
  - 카카오 우편 API
  - Spring Security
  - lombok
  - AWS
  - WebSocket
  - JPA
  - Figma
</br>

## 3. ERD 설계
![image](https://github.com/user-attachments/assets/7dcccd75-465d-4aee-9d8e-afb1d26c183a)


## 4. 핵심 기능
댕댕히어로즈 서비스의 핵심 기능은 봉사신청 및 커뮤니티 기능입니다.
캘린더 기능을 이용하여 사용자가 직접 봉사 신청을 하고, 게시판을 사용하여 사용자들과의 커뮤니케이션, 봉사, 유기견에 관한 정보 공유를 할 수 있습니다.

</br>

## 5. 참여 기능 페이지 
<details>
<summary><b>참여기능 페이지 보기</b></summary>
<div markdown="1">

### 1. 로그인 페이지
![image](https://github.com/user-attachments/assets/db0d8cc6-7be0-4377-9a71-8368bd000ef0)</br>

### 1. 회원가입 페이지
![image](https://github.com/user-attachments/assets/cadf68a6-e6e6-48dc-96db-480d0fc4b796)</br>

### 1. 아이디 찾기 페이지
![image](https://github.com/user-attachments/assets/4bf0f1d7-6f61-4619-ac9a-97e8514da67a)</br>

### 1. 비밀번호 찾기 페이지
![image](https://github.com/user-attachments/assets/6de5673c-b4c7-4a1b-8d15-a82e8c501619)</br>

### 1. 약관 동의 페이지
![image](https://github.com/user-attachments/assets/62b76270-3642-4d5c-b8b1-330b50645fbe)</br>

### 1. 마이페이지 접근
![image](https://github.com/user-attachments/assets/1e897adc-7292-437b-ad5d-3816d7d975e5)</br>

### 1. 마이페이지 & 회원정보 수정
![마이페이지](https://github.com/user-attachments/assets/3fe0ea4b-9c38-47b5-964e-20a038f1552f)</br>

### 1. 회원 탈퇴 모달
![image](https://github.com/user-attachments/assets/f0b48142-6944-4fba-9830-4bdd52e94a55)</br>

### 1. 회원 탈퇴 시 alert
![회원탈퇴](https://github.com/user-attachments/assets/951875ec-5b93-403e-a674-975f26cc4ec1)</br>

</div>
</details>
</br>

## 6. 참여부분 핵심 기능
<details>
<summary><b>참여부분 설명 펼치기</b></summary>
<div markdown="1">

### 6.1. 로그인

![image](https://github.com/user-attachments/assets/66cce10d-86c0-4d65-80c2-e3d94219fd13)

6.1.1 로그인 페이지 이동 get 메서드

![image](https://github.com/user-attachments/assets/25389fa5-7ae8-4609-bb89-0bd71439afb9)

6.1.2 로그인 처리기능 post 메서드

### 6.2. 회원가입
![image](https://github.com/user-attachments/assets/d3a3c490-6cf3-4f65-9328-26169b66fd77)
![image](https://github.com/user-attachments/assets/f9687e3d-f4fb-4702-bcf2-8461851c5509)

6.2.1 회원가입 처리기능 메서드 파라미터로 입력값 받은 후 JSP 유효성검사와 서버측 유효성검사 실행
      DTO객체 생성 및 비밀번호 SHA-256 해시 처리 DAO 싱글톤 구현 

### 6.3. 이메일 인증
![image](https://github.com/user-attachments/assets/c2cb933d-d31c-4e53-a8ae-4ed03106e620)

6.3.1 네이버 STMP사용 인증 메일 발송기능 

![image](https://github.com/user-attachments/assets/ae4079bf-dfb5-493f-b7d9-5d9e4372faef)

6.3.2 회원가입에서 이메일 인증 검증(요청 URI에 따라 처리 분기)

</div>
</details>

</br>

## 7. 핵심 트러블 슈팅
### 7.1. 이메일 재인증 불가 이슈
- 저는 이메일 인증 서비스가 회원가입과 아이디&비밀번호 찾기에 모두 다 사용되기를 바라는 마음으로
개발하였습니다. 

- 하지만 세션처리에 관한 공부를 제대로 하지못하여 한번 이메일 인증을하면 그 이메일 인증정보가 세션에 저장되어
  브라우저를 끈후 재접속하여 세션을 만료시킨뒤 재인증이 가능하게 된 현상을 발견하였습니다.

<details>
<summary><b>기존 코드</b></summary>
<div markdown="1">

![image](https://github.com/user-attachments/assets/4c8bab87-5c04-4a78-a1ee-77a979e97843)
세션에 인증번호를 저장하고 저장된 인증번호를 확인
그에 따른 응답을 JSON으로 JSP로 전달하는 방식으로 초기 구현


</div>
</details>

- 하여 Servlet에서 목적에 따라 세션을 체크하는 sendEmailAuthCodeForRecovery 메서드 부분을 추가하였습니다.   
- 회원가입과 아이디 & 비밀번호찾기 페이지에서 이미 이메일 인증이 된 사용자인지 확인(목적에따라 세션에서 확인)
- 인증이 된 경우 JSON응답을 통해 에러 메세지 출력하도록 하였습니다.
- 인증이 되지않은 경우에만 인증번호 생성 및 발송 로직 실행하도록 구현 하였습니다.

<details>
<summary><b>개선된 코드</b></summary>
<div markdown="1">

![image](https://github.com/user-attachments/assets/de7871f4-babb-4323-879d-c2a6c47f05d6)


</div>
</details>

</br>
