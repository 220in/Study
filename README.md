# gitTest
jsp
- **JSP란?**

   - HTML내에 Java 코드를 작성하고 웹 서버에서 웹페이지를 생 

     성하여 웹브라우저에 돌려주는 자바를 기본으로 한 스크립트 

     언어

   - jsp → .java → class → html

- **Servlet과 jsp의 역할**

   - 로직 구현은 Servlet에, HTML 중심의 코드는 JSP에

   - Servlet 복잡한 로직 구현에 적합

   - JSP 화면작성, 수정 용이

- **JSP 구성요소**

  - 지시자(Directive) : <%@%> 

     **1)지시자(Direvtive)**

        page지시자 : JSP페이지의 전체적인 환경설정을 할 때 사용

        taglib지시자 : 태그 라이브러리에서 태그를 가져와 사용 할 

         수 있는 기능 제공

  - 선언문(Declaration) : <%!%> 전역변수,전역메소드 선언

  - 스크립트릿(Scriptlet) : <%%>java코드 작성하고 싶을 때

  - 표현식(Expression) :  <%=%> java코드안에서 작성한변수,  

     메소드,연산을 화면에 출력하고 싶을 때 사용
