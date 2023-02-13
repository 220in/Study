## 데이터 베이스 관련 용어 정리

### 데이터베이스

- 데이터를 일정한 형태로 저장해 놓은 것

### 데이터베이스 관리 시스템(DBMS)

- 기존 데이터베이스 기능에 추가로 데이터 손상을 방지 및 복구 , 인증된 사용자만 접근 등 추가 기능을 지원하는 관리 시스템

### 관계형 DBMS (RDBMS)

- 테이블로 데이터를 관리하고 테이블간 관계를 이용해 데이터 테이블을 만들고 관리하는 시스템

### 테이블

- 엔터티 : 테이블
- 속성 : 컬럼
- 인스턴스 : 튜플

### SQL (1,2,3,5번)

- RDBMS에서 데이터 정의, 조작, 조회 ,제어 등을 하기위해 사용하는 언어

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8e017e89-bde6-4ea8-8398-6536c078db75/Untitled.png)

## DDL(Create , Alter , Drop, Rename, Truncate)

### VARCHAR2(n)

- 문자형 값을 n 바이트까지 입력 받을 수 있는 가변형 문자열

### CHAR(n)

- 문자형 값을 n 바이트까지 입력 받을 수 있는 고정형 문자열

### NUMBER(n,m)

- 숫자형 값을 n 자리만큼 입력 받고 그 중 소수점은 m 자리 까지 입력 가능한 숫자형 자료형
- 예를 들어 NUMBER(8,2) 는 정수를 6자리, 소수를 2자리로 받는다는 의미

### DATE

- 날짜 정보를 받는 자료형

### NULL이란?(8번)

- 아직 정해지지 않은 부재의 값이며 공백이나 숫자 0과는 다른의미

### 테이블 생성시 주의사항(11번)

1. 대소문자 구분을 하지 않음
2. 테이블명 중복 불가
3. 테이블 내에서 동일한 컬럼명 사용 불가(다른 테이블 간 동일한 컬럼명은 가능)
4. 문자로 시작 가능, 예약어는 사용 불가 등
5. 가급적 단수형으로 사용

### 제약조건이란?(10,14,15번)

- PRIMARY KEY (PK) ⇒ 이 컬럼은 중복값X(UNIQUE) + NOT NULL + 테이블당 하나!
- UNIQUE KEY(UK) ⇒ UNIQUE + NULL
- NOT NULL ⇒ NOT NULL
- CHECK ⇒ 지정한 조건을 만족하는 값만 들어감
- FOREIGN KEY ⇒ 다른 테이블의 컬럼을 참조하는 KEY , 테이블 당 여러개 가능

### 제약 조건 - PRIMARY KEY (PK) (6번)

- PK 설정 방법 -테이블을 만들면서 작성 1

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6260699f-ec83-43d8-ba78-5c42c03ee3e0/Untitled.png)

- CONSTRAINT 키워드 사용 -테이블을 만들면서 작성 2

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ccb35002-9180-4c01-ba3e-3c8d5a3ade9e/Untitled.png)

- 테이블을 만들면서 작성 3

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b2f2d2b2-f415-4e27-a366-8825684060ae/Untitled.png)

- 테이블을 만들고 나서 PK 설정하는 방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7283992e-c8e3-4df1-bfe5-b8da0ef517a0/Untitled.png)

### 제약조건 - FOREIGN KEY(FK)

- **FK 설정 시 데이터 처리 방법 정하기 ( 9,17,22번)**

     **- ON DELETE CASCADE**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4420505c-e7be-4938-9c7c-ba90f8122e01/Untitled.png)

     **- ON DELETE SET NULL**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d64899c5-05dd-4708-b123-5103d4c7aec1/Untitled.png)

### CTAS 사용하기- 테이블 생성 (Create  Table .. As .. Select .. )

- 예시 ( 단 , 제약조건은 NOT NULL 만 복사 됨)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c9a04be2-afe5-42ea-b4a7-09d7408430b9/Untitled.png)

### 테이블 수정하기 (ALTER)

- ALTER TABLE ADD ⇒ 기존 테이블에 컬럼 추가

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e657b6f0-6d72-4fa7-9191-acc6a6a9efb2/Untitled.png)

- ALTER TABLE DROP COLUMN ⇒ 기존 테이블에 컬럼 삭제

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/71713af8-8eb9-4154-aa89-702a79c44a46/Untitled.png)

- ALTER TABLE MODIFY ⇒ 기존 테이블에 컬럼 속성 변경

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/09c11c3e-674e-4e4d-a982-9e16e86d93db/Untitled.png)

- ALTER TABLE RENAME ⇒ 기존 테이블에 컬럼 이름 변경

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/24c8bc82-4f8c-43c0-b498-5e2c0482fc7f/Untitled.png)

- RENAME A TO B ⇒ 기존 테이블 이름을 A에서 B로 변경

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b56cdb8e-a88e-4dc3-94a8-4f95455018b5/Untitled.png)
