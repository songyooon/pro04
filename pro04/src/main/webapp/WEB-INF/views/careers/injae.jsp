<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>인재상</title>
    <!-- 헤드 부분 인클루드 -->
    <jsp:include page="../include/head.jsp"></jsp:include>
</head>
<body>
	<header id="header">
		<!-- 헤더 부분 인클루드 -->
	 	<jsp:include page="../include/hd.jsp"></jsp:include>
    </header>
	<div class="content" id="content">
	    <div class="row column text-center">
	      <h2 class="h1">인재상</h2>
	      <hr>
	      <div class="container">
		      <table>
		      	<thead>
		      		<tr>
		      		</tr>
		      	</thead>
		      	<tbody>	
		      	</tbody>
		      </table>
			      	    <%-- <c:if test='${sid eq "admin"}'>  --%> 
		      	<div class="button-group">
				  <a class="button" href="${path1 }/about/insert.do">글쓰기</a>
				</div>
			<%-- </c:if> --%>
	      </div>

	    </div>
	</div>
    <footer id="footer" class="footer-nav row expanded collapse">
    	<!-- 푸터 부분 인클루드 -->
    	<jsp:include page="../include/ft.jsp"></jsp:include>
    </footer>
</body>
</html>