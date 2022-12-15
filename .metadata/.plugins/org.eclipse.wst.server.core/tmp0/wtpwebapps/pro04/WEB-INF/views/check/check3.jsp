<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Insert title here</title>
</head>
<body>

	id : <input type="text" name="id" id="id" /><br><br>
    pw : <input type="password" name="pw" id="pw" /><br><br>
    <button class="button" id="submit_btn"> 전송 </button>
    
    <script>
    $(document).ready(function(){
    	var id = $("#id").val();
    	var pw = $("#pw").val();
    	
    	if(id=="" || pw==""){
    		alert("아이디 또는 비밀번호 입력칸이 비어있습니다");
    		return false;
    	}
    	if(id.length<5 || id.length>12) {
    		alert("아이디의 글자수가 맞지않습니다");
    		return false;
    	}
    	if(pw.length<5 || pw.length>12) {
    		alert("비밀번호의 글자수가 맞지않습니다");
    		return false;
    	}
    	var idReg = /^[a-z0-9]{5,12}$/g;
    	if(!idReg.test(id)){
    		alert("아이디 입력 형식이 아닙니다");
    	}
    	var pwReg = /^[a-zA-Z0-9]{8,12}$/g;
    	if(!pwReg.test(pw)){
    		alert("비밀번호 입력 형식이 아닙니다");
    		return;
    	}
    	
    	location.href = "./check3.do?id="+id+"&pw="+pw;
    	
    });
    
  });
    </script>

</body>
</html>