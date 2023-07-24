<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
 <link rel="stylesheet" href="/resources/css/login.css">

 <script src="/resources/js/jquery.min.js"></script>
 <script src="/resources/js/login.js"></script>
</head>
<body>
 <header>
        <img src="/resources/img/petlogo.png" alt="logo" class="p-logo">
        <img src="/resources/img/mlogo.png" alt="mlogo" class="m-logo">
        <div class="login">
            <a href="#">로그인</a>
            <a href="#">회원가입</a>
        </div>
        <div class="m-login">
            <img src="/resources/img/user.png" alt="사용자">
        </div>
    </header>
    <div class="login-container">
        <img class="login-banner" src="/resources/img/login-banner.png" alt="banner" style="margin-left: -7px;">
        <div class="p-login">
            <h1>로그인</h1>
            <form class="login-conta" id="loginForm" method="post">
                <div class="login-id" style="position: relative;margin-bottom: 10px;margin-left: 28px;">
                <span id="span11" style="display: none;">아이디</span>
                <label for="username">
                 <input class="bee-username" type="text" id="username" name="userid" required  placeholder="아이디" oninput="login()"></label>
                </div>
                 <div class="login-pass" style="position: relative; display: inline-block;">
                    <span id="span1" style="display: none;">비밀번호</span>
                    <input class="bee-password" type="password" id="password" name="password" required  placeholder="비밀번호" oninput="pass()">
                    <i class= "fa-regular fa-eye" style="position: absolute; right: 5px; top: 50%; transform: translateY(-50%); cursor: pointer;"></i>
                  </div>
                  
                <div class="idpass" id="error-msg" style="display: none;">
                    <p style="font-size: 14px; margin-top:2px;padding-left: 140px;color:#D43915;">아이디 또는 비밀번호를 확인해주세요.</p>
                </div>
                <div class="huid-container" style="display: flex;width: 345px;margin-left: 27px;margin-top: 5px;">
                <label class="huid">
                    <div class="huid-s">
                <input type="checkbox" name="huid" id="huid" value="ok"/> <span id="huid-span" style="font-size: 13px;">아이디 저장</span>
                    </div> 
                </label>
                <div class="text-end">
                    <a href="javascript:void(0);" onclick="" style="padding-right: 5px;">아이디찾기</a>
                    <a href="javascript:void(0);" onclick="">패스워드찾기</a>
                </div>
                </div>
                <button class="bee-login-1" id="loginclick" type="submit" onclick="LoginClick()">로그인</button>
                <div class="b-regi" >
                <p>아직 펫더랜드의 회원이 아니신가요?</p>
                <a href="#">회원가입</a>
                </div>
                <div class="snslogin">
                    <a href="#"><img src="/resources/img/naver.png" alt="naver"></a>
                    <a href="#"><img src="/resources/img/kaka.png" alt="kakao"></a>
                    <a href="#"><img src="/resources/img/google.png" alt="google"></a>
                </div>
            </form>
        </div>
    </div>
</body>
</html>