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
  회원탈퇴,정보수정,아이디 & 비밀번호찾기,서버 및 배포구축

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
FunSpot 서비스의 핵심 기능은 사용자 커스텀 여행 코스제작 및 커뮤니티 기능입니다.
사용자 커스텀 여행 코스 제작을 통하여 사용자가 직접 여행지 코스를 짜고 게시판에 업로드 하고 피드를 통해 자신이 다녀온 
여행지를 여러 사용자들과 공유하고 소통하며 채팅을 통해 자신만의 여행지를 일부 사람들에게 공유 할 수 있습니다.

</br>

## 5. 참여 기능 페이지 
<details>
<summary><b>참여기능 페이지 보기</b></summary>
<div markdown="1">

### 1. 로그인 페이지(OAuth2 포함)
![image](https://github.com/user-attachments/assets/4500d40b-e8d2-4b5d-88cb-b5d2e79afbbd)</br>
- 자체로그인과 소셜로그인이 함께 페이지에 나타납니다.
- 소셜 로그인시 구글,네이버,카카오 아이콘 클릭시 소셜 아이디로 로그인하면 FunSpot페이지에 로그인이 가능합니다.
![image](https://github.com/user-attachments/assets/87b878cc-cc77-42d6-b733-2478a31c3d95)</br>
- 로그인 후 헤더 부분의 로그인 / 회원가입 부분이 닉네임으로 표시 됩니다.

### 1. 약관동의 페이지
![image](https://github.com/user-attachments/assets/7c8729fc-68af-4771-ae93-e2d4e32e29d4)</br>
- 자체 회원가입시에만 해당 페이지를 거치게 됩니다.

### 1. 자체 회원가입 페이지
![image](https://github.com/user-attachments/assets/5412c189-a83a-467b-b6c8-f969f6862cce)</br>

### 1. 소셜 회원가입 페이지
![회원가입 소셜](https://github.com/user-attachments/assets/5d9f9c4a-6ed5-4003-aef4-3e6f08dd056a)</br>
- 소셜 회원가입은 비밀번호 입력을 제거하고 이메일 인증을 거치치 않습니다.
- 아이디입력필드는 추후 디벨롭하여 추가되는 기능에 한하여 제거하거나 아이디를 이용할 수 있기에 추가하였습니다. 

### 1. 아이디 찾기 페이지
![image](https://github.com/user-attachments/assets/c3682568-27c6-4e87-871b-dc1f3916e728)</br>
![image](https://github.com/user-attachments/assets/e33447da-d193-4787-a4a5-ebf4c68e1a8b)</br>
- 자체 회원일시 이름,생년월일,이메일 인증을 통해 아이디를 찾을 수 있습니다.
- 아이디를 찾은 후 로그인하러 가기 클릭시 로그인 페이지의 아이디 입력필드로 포커스됩니다.

### 1. 비밀번호 찾기 페이지
![image](https://github.com/user-attachments/assets/778f3115-dc71-4cca-a331-3af8595fb865)</br>
![image](https://github.com/user-attachments/assets/d566d457-f847-4ae3-858a-b348b6007b58)</br>
- 자체 회원일시 이름,아이디,생년월일,이메일 인증을 통해 새로운 비밀번호로 변경이 가능합니다.
- 비밀번호 변경을 클릭시 비밀번호가 변경되며 로그인 페이지의 아이디 입력필드로 포커스됩니다.

### 1. 정보수정 모달(자체)
![정보수정(자체)](https://github.com/user-attachments/assets/dd5e1866-632f-411e-b083-0681098e0226)</br>
- 자체 회원은 비밀번호를 수정할 수 있기에 보안을 좀 더 강화하여 비밀번호를 체크한 후에 정보수정 모달에 진입 가능합니다.
- 비밀번호,핸드폰번호,주소를 수정할 수 있습니다.
- 닉네임은 마이페이지에서 수정 가능합니다.

### 1. 정보수정 모달(소셜)
![정보수정(소셜)](https://github.com/user-attachments/assets/052d37b7-f870-4968-a24a-4e5ef3bb56b6)</br>
- 소셜 회원은 회원가입시 비밀번호를 입력하지 않기에 바로 정보수정 모달에 진입 가능합니다.
- 핸드폰번호,주소를 수정할 수 있습니다.
- 닉네임은 마이페이지에서 수정 가능합니다.

### 1. 회원 탈퇴 모달
![회원 탈퇴](https://github.com/user-attachments/assets/053a7851-e59a-4a26-b414-ebe90f714c2f)</br>
- 자체는 비밀번호 입력 후 탈퇴가 가능하고 소셜은 이메일 인증 후 탈퇴가 가능합니다.
- 탈퇴된 계정으로 접속시 alert로 탈퇴된 회원임을 알려줍니다.(소셜과 자체 모두 동일)

</div>
</details>
</br>

## 6. 참여부분 핵심 기능

### 6.1. 로그인

#### 6.1.1 자체로그인 

> JWT와 Security를 사용하고 쿠키에 토큰을 저장하는 방식의 자체로그인을 구현 하였습니다.</br>
> - BackEnd코드</br>
> [Controller 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/usr/login/controller/UserLoginController.java#L1-L95)</br>
> [Service 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/usr/login/service/UserLoginServiceImpl.java#L1-L70)</br>
> - FrontEnd코드</br>
> [Compornent 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/frontend/src/usr/login/component/LoginComponent.jsx#L1-L247)</br>
> [API 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/frontend/src/usr/login/api/LoginApi.js#L1-L16)</br>

#### 6.1.2 OAuth2 로그인

>구글,네이버,카카오를 이용한 OAuth2 소셜 로그인 기능 구현 하였습니다(토큰 생성 및 저장은 자체와 동일).</br>
> - BackEnd코드</br>
> [Service 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/usr/oauthlogin/service/CustomOAuth2UserService.java#L1-L167)</br>
> [핸들러 코드보기](https://github.com/SKYCloud11/Final-Project/blob/6cbcc17155a1a52bb815549555830d75f305331a/backend/src/main/java/com/spot/fun/config/WebSecurityConfig.java#L173-L252)</br>

### 6.2. 회원가입

#### 6.2.1 자체,소셜 회원가입

> 자체,소셜 회원가입을 통해 서비스를 이용할 수 있습니다.
> - BackEnd코드</br>
> [Controller 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/usr/signup/controller/SignupController.java#L1-L84)</br>
> [Service 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/usr/signup/service/SignupServiceImpl.java#L1-L169)</br>
> - 자체와 소셜 회원가입은 같은 컨트롤러와 서비스에 작성</br>
> - FrontEnd코드</br>
> [Compornent(자체) 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/frontend/src/usr/signup/component/SignupComponent.jsx#L1-L595)</br>
> [Compornent(소셜) 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/frontend/src/usr/signup/component/SocialSignupComponent.jsx#L1-L503)</br>
> [API 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/frontend/src/usr/signup/api/SignupApi.js#L1-L51)</br>
> - 자체와 소셜 이메인 인증 API는 같은 API에 작성</br>

### 6.3. 이메일 인증

> 이메일 인증을 통해 회원가입,아이디,비밀번호 찾기 진행이 가능합니다.
> - BackEnd코드</br>
> [Controller 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/usr/signup/controller/EmailController.java#L1-L26)</br>
> [Service 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/usr/signup/service/EmailService.java#L1-L37)</br>

### 6.4. WebSecurityConfig

> Spring Security를 사용하여 인증 및 권한 부여를 설정하고 OAuth2 기반 소셜 로그인, JWT 인증, CORS 설정 등을 관리하는 코드를 WebSecurityConfig로 구현 하였습니다.</br>
> [코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/config/WebSecurityConfig.java#L1-L253)</br>

### 6.5. JwtToken

> Spring Security에서 사용되는 OncePerRequestFilter를 상속하여 매 요청에 대해 JWT를 검증하고 인증 정보를 설정하는 역할을 합니다.</br>
> [TokenFilter 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/config/jwt/JwtTokenFilter.java#L1-L116)</br>
> JWT를 생성, 검증, 파싱하여 사용자 인증을 처리하고, 사용자 정보를 포함한 토큰을 생성하거나 추출하는 역할을 합니다.</br>
> [TokenProvider 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/config/jwt/JwtTokenProvider.java#L1-L134)</br>


### 6.6. Token관리

> 리프레시 토큰을 쿠키에서 추출하고 유효성을 검사하여 새로운 액세스 토큰을 발급하거나, OAuth 및 사용자 로그인을 처리하는 유틸리티와 함께 현재 사용자 정보를 관리하는 서비스 구현 하였습니다.</br>
> [Service 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/token/service/AuthTokenServiceImpl.java#L1-L121)</br>
> 토큰 생성, 검증, 삭제, 쿠키 관리, 토큰 갱신, 그리고 사용자 인증 정보를 반환하는 유틸리티 역할을 구현 하였습니다.</br>
> [Utill 코드보기](https://github.com/SKYCloud11/Final-Project/blob/54d4633878612bcffd0cf6add9607a12349c58e3/backend/src/main/java/com/spot/fun/token/util/AuthTokenUtil.java#L1-L252)</br>


## 7. 핵심 트러블 슈팅
### 7.1. OAuth2 로그인 이슈 

#### 기존 사항 
- 소셜로그인 이후 명시적으로 리다이렉트URL을 CustomOAuth2UserService에 지정했지만  Spring Security가 기본적으로 제공하는 로그인 성공 화면으로이동하는 문제가 발생하였습니다.

- OAuth2로그인을 처음으로 구현해보았기에 CustomOAuth2UserService만 작성하고 이 안에서 리다이렉트처리를 하면된다고 생각하였지만 해당 이슈를 통해 구글링 한 결과 성공 핸들러와 실패 핸들러 프론트의 성공페이지를 작성하여야 한다는것을 알게 되었습니다.

<details>
<summary><b>기존 코드</b></summary>
<div markdown="1">
 
- 기존의 코드는 로그인 성공 실패 핸들러 없이 Service내에서 jwt토큰 생성과 http 응답객체를 가져오고
  로그인 성공 페이지로 메인페이지를 리다이렉트하였고 비회원의 경우 바로 Repository에 저장
  이후 자체 회원가입페이지로 리다이렉트 하였습니다.</br>
![image](https://github.com/user-attachments/assets/9dee49f0-881e-442e-b3d3-7813ae4dab80)</br>
![image](https://github.com/user-attachments/assets/c7edd8d9-eb0d-462a-a1f9-7c8426bdefc1)</br>

</div>
</details>

#### 개선 사항 

- 계속된 Spring Security 기본 로그인 성공 화면으로 이동하는 이슈로 인해 WebSecurityConfig에 Bean으로 성공 실패 핸드러를
  작성하고 filterChain에 OAuth2 로그인 설정에 해당 핸들러를 설정해주고 LoginSuccess페이지를 작성하여 해결하였습니다.
  
<details>
<summary><b>개선된 코드</b></summary>
<div markdown="1">
 
- CustomOAuth2UserService수정(리다이렉트 처리과정 삭제,Provider를 통한 소셜 구분,회원 비회원처리 수정,탈퇴회원 구분)</br>
![image](https://github.com/user-attachments/assets/37d77102-959e-46b7-8721-00fff2df4f1a)</br>
![image](https://github.com/user-attachments/assets/558a87ff-a481-4900-a69a-242b3326dbf7)</br>
![image](https://github.com/user-attachments/assets/fe29e2fa-7dce-47dc-a30b-32b8c0136d6f)</br>
- OAuth2 로그인 성공 핸들러</br>
![image](https://github.com/user-attachments/assets/39bcfa1a-39ca-4d7c-8cc5-645235c8f61a)</br>
![image](https://github.com/user-attachments/assets/51bfc879-8ec3-4e5a-9cd6-ff499b6074e3)</br>
- OAuth2 로그인 실패 핸들러</br>
![image](https://github.com/user-attachments/assets/d577698c-5e8b-46b2-a610-3da6276023e8)</br>
- LoginSuccess페이지</br>
![image](https://github.com/user-attachments/assets/852c3973-419e-4fec-b943-7675ad56dc21)</br>


</div>
</details>

</br>
