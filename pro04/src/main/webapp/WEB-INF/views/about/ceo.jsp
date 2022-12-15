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
	<title>CEO</title>
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
	      <h2 class="h1">CEO</h2>
	      <hr>
	      <div class="container">
		      <table>
		      	<thead>
		      		<tr>
		      		</tr>
		      	</thead>
		      	<tbody>	
		      	<h2>모두의 삶에 가치를 더하는
Lifetime Value Creator, 롯데그룹 입니다.
		      	</h2>
		      	<p>롯데는 지난 50년간 인류의 삶을 풍요롭게 하기 위한 여정을 이어왔습니다. 식품, 유통, 관광, 화학, 건설, 금융 등
다양한 분야에서 끊임없는 도전과 혁신으로 고객들에게 행복과 즐거움을 전하며 성장하였습니다. 또한 해외 시장을
적극적으로 개척하여 명실상부한 글로벌 그룹으로의 위상을 갖추었습니다.

이제, 롯데는 더 큰 도약을 이루고자 합니다. 고객들의 전 생애에 가치를 더하는 Lifetime Value Creator를 비전으로
삼아, 모든 이해관계자들과 함께 지속 가능한 미래를 만들어 나갈 것입니다. 준법경영과 경영투명성을 기반으로,
사회적 가치를 지향하고 질적 성장을 추구하는 롯데가 되기 위해 노력할 것입니다.

롯데지주 주식회사의 출범은 그 시작점이 될 것입니다. 롯데는 롯데지주 주식회사의 출범을 통해 경영투명성을 더욱
강화하는 한편, 주주가치를 제고하고 미래성장의 토대를 단단히 구축할 수 있을 것입니다.

앞으로 롯데지주 주식회사는 자회사의 기업가치 제고와 경쟁력 강화를 위해 적극적으로 협력 및 지원해 나갈
계획입니다. 중장기적인 관점에서 그룹의 지속 가능한 성장을 위해 신성장동력 발굴 및 신시장 개척에도 앞장설 것입니다.
또한 뉴 심볼로 대표되는 롯데의 브랜드 가치를 제고하기 위해 지속적으로 노력해 나가겠습니다.

롯데지주 주식회사는 투명한 지배구조를 기반으로 고객과 주주, 임직원 및 모든 이해관계자들과 더 큰 가치를 나누며
함께 성장해 나가고자 합니다. 함께 가는 친구, 롯데와 롯데지주 주식회사에 여러분의 많은 관심과 사랑을 부탁 드립니다.
감사합니다.
<strong>롯데그룹 회장
신 동 빈</strong>
		      	</p>
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