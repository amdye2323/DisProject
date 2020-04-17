<!-- start header -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
=======
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="../includes/header.jsp"%>
<!-- end header -->


<h2><c:out value="${error }"></c:out></h2>
<h2><c:out value="${logout }"></c:out></h2>
<div class="content">
	<div class="card">
		<div class="card-header card-header-primary">
			<h4 class="card-title">JOIN</h4>
			<p class="card-category">회원가입</p>
			
		</div>
		<div class="card-body">
			<p><c:out value="${error }"/></p>
			<p><c:out value="${logout }"/></p>
			<form action="/sign/memberInsert" method="post" role="form" id="frm">
			<fieldset>
				<div class="row">
					<div class="col-md-4">
						<div class="form-group">
							<label class="bmd-label-floating">사용할 ID를 입력하세요</label>
							<input type="text" name="emp_id" class="form-control">
						</div> 
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<div class="form-group">
							<label class="bmd-label-floating">사용할 비밀번호를 입력하세요</label>
							<input type="password" name="emp_pass" class="form-control">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<div class="form-group">
							<label class="bmd-label-floating">이름 입력하세요</label>
							<input type="text" name="emp_name" class="form-control" autofocus="autofocus">
						</div> 
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<div class="form-group">
							<label class="bmd-label-floating">전화번호를 입력하세요</label>
							<input type="text" name="emp_tel" class="form-control">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<div class="form-group">
							<label class="bmd-label-floating">부서를 선택하세요</label>
								<div class="form-check form-check-radio">
									<label class="form-check-label">
									<input type="radio" name="emp_dir" value="personnal"> 인사팀 
							</label>
							<label class="form-check-label">
									<input type="radio" name="emp_dir" value="finance"> 재무팀 
							</label>
							<label class="form-check-label">
									<input type="radio" name="emp_dir" value="legal"> 법무팀 
							</label>
						</div>
					
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<div class="form-group">
							<label class="bmd-label-floating">주소를 입력하세요</label>
								<div class="input-group">
								<input type="text" name="emp_addr" id="addr" class="form-control">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button"onclick="javascript:goPopup()">주소 찾기</button>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<div class="form-check form-check-radio">
							<label>USER GRADE</label>
							<label class="form-check-label">
								<input type="radio" name="emp_grade" value="ROLE_USER"> user 
							</label>
							<label class="form-check-label">
								<input type="radio" name="emp_grade" value="ROLE_MEMBER"> member 
							</label>
							<label class="form-check-label">
								<input type="radio" name="emp_grade" value="ROLE_ADMIN"> admin 
							</label>
						</div>
					</div>
				</div>
				<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">
				<button type="submit" class="btn btn-primary pull-right">JOIN</button>
				</fieldset>
			</form>
		</div>
	</div>
</div>
	<script type="text/javascript">
		$(function(){
		   $(".btn-primary").on("click",function(e){
		      e.preventDefault();
		      $("#frm").submit();
		      })
		});
		
		function goPopup() {
		   // 주소검색을 수행할 팝업 페이지를 호출합니다.
		   // 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
		   var pop = window.open("jusoPopup","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
		   
		   // 모바일 웹인 경우, 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrMobileLinkUrl.do)를 호출하게 됩니다.
		    //var pop = window.open("/popup/jusoPopup.jsp","pop","scrollbars=yes, resizable=yes"); 
		}


		function jusoCallBack(roadFullAddr){
		      // 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
		      $("#addr").val(roadFullAddr);
		}
	</script>
	
	

<!-- start footer -->
<%@ include file="../includes/footer.jsp"%>
<!-- end footer -->
>>>>>>> c08ce0fac828869523bbb5420129db3b65375c4f
</html>