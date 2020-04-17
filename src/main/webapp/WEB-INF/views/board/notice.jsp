<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<%@ include file="../includes/header.jsp" %>
<body>
<div class="content">
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Board List Pages
                            <button type="button" class="btn btn-xs pull-right" onclick="location.href='/board/register'">Register New Board</button>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive container">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead class="primary">
                                        <tr>
                                            <th>#NUM</th>
                                            <th>TITLE</th>
                                            <th>WRITER</th>
                                            <th>REGDATE</th>
                                            <th>#Check</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${list }" var="board">                                                            
                                        <tr style="cursor:pointer" onclick="location.href='/board/get?bno=${board.bno}'">
                                            <td><c:out value="${board.bno }" /></td>
                                            <td>                                           
                                            <a class="move" href='<c:out value="${board.bno }" />'><c:out value="${board.title }" /> <b>[  
                                            <c:out value="${board.replyCnt }"></c:out>  ]</b>
                                            </a>
                                            </td>
                                            <td><c:out value="${board.writer }" /></td>
                                            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.created }" /></td>
                                            <td><fmt:formatDate pattern="yyyy-MM-dd" value="" /></td>
                                        </tr>
                                         </c:forEach>
                                    </tbody>
                                </table>
                                
                                <!-- search  -->
                               <%--  <div class="row">
                                	<div class="col-lg-12">
                                		
                                		<form action="/board/list" method="get" id="searchForm">
                                			<select name="type">
                                				<option value=""
                                				<c:out value="${pageMaker.cri.type == null ? 'selected' : '' }" ></c:out> 
                                				>--</option>
                                					<option value="T"
                                						<c:out value="${pageMaker.cri.type == 'T' ? 'selected' : '' }" ></c:out> 
                                					>제목</option>
                                					<option value="C"
                                						<c:out value="${pageMaker.cri.type == 'C' ? 'selected' : '' }" ></c:out> 
                                					>내용</option>
                                					<option value="W"
                                						<c:out value="${pageMaker.cri.type == 'W' ? 'selected' : '' }" ></c:out> 
                                					>작성자</option>
                                					<option value="TC"
                                						<c:out value="${pageMaker.cri.type == 'TC' ? 'selected' : '' }" ></c:out> 
                                					>제목 or 내용</option>
                                					<option value="TW"
                                						<c:out value="${pageMaker.cri.type == 'TW' ? 'selected' : '' }" ></c:out> 
                                					>제목 or 작성자</option>
                                					<option value="TWC"
                                						<c:out value="${pageMaker.cri.type == 'TWC' ? 'selected' : '' }" ></c:out> 
                                					>제목 or 작성자 or 내용</option>
                                			</select>
                                			<input type="text" name="keyword" 
                                			value='<c:out value="${pageMaker.cri.keyword }"></c:out>'
                                			/>
                                			<input type="hidden" name="pageNum" value='<c:out value="${pageMaker.cri.pageNum }"></c:out>'>
                                			<input type="hidden" name="amount" value='<c:out value="${pageMaker.cri.amount }"></c:out>'>
                                			<button class="btn btn-default">Search</button>
                                		</form>
                                	</div>
                                </div> --%>
                                
                                <div class="row">
                                	<div class="col-lg-12">
                                		<div class="dropdown">
                                			<button  class="btn btn-primary dropdown-toggle" id="depLabel" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                			Department Category <span class="caret"></span> </button>
                                			<ul class="dropdown-menu" role="menu" aria-labelledy="depLabel">
                                				<li class="presentation">
                                					<a role="menuitem" tabindex="-1" href="#">Full View</a>
                                				</li>
                                				<li class="presentation">
                                					<a role="menuitem" tabindex="-1" href="#">Personnel Department</a>
                                				</li>
                                				<li class="presentation">
                                					<a role="menuitem" tabindex="-1" href="#">Finance Department</a>
                                				</li>
                                				<li class="presentation">
                                					<a role="menuitem" tabindex="-1" href="#">The Legal Department</a>
                                				</li>
                                			</ul>
                                		</div>
                                	</div>
                                </div>
                                <!-- pageNation -->
                               <div class="pull-right">
                                	<ul class="pagination">
                                		
                                		<c:if test="${page.prev }">
                                			<li class="page-item disabled">
                                			<a class="page-link" href="${page.startPage -1 }">Previous</a>
                                			</li>
                                		</c:if>
                                		<c:forEach var="num" begin="${page.startPage }" end="${page.endPage }">
                                			<li class="page-item ${page.cri.pageNum == num?'active':'' }">
                                			<a class="page-link" href="${num }">${num }</a>
                                			</li>
                                		</c:forEach>
                                		<c:if test="${page.next }">
                                			<li class="page-item">
                                			<a class="page-link" href="${page.endPage+1 }">Next</a>
                                			</li>
                                		</c:if>
                                	</ul>
                                	
                                	<form action="/board/notice" id="actionForm" method="get">
                                		<input type="hidden" name="pageNum" value='${page.cri.pageNum }'>
                                		<input type="hidden" name="amount" value='${page.cri.amount }'>
                                	</form>
                                </div>
                                
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                
                <div class="modal fade" id="myModal" tabindex="-1 "role="dialog" aria-labelledy="myModalLabel" aria-hidden=true>
                	<div class="modal-dialog">
                		<div class="modal-content">
                			<div class="modal-header">
                				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                					&times;
                				</button>
                				<h4 class="modal-title" id="myModalLabel">Message!!</h4>
                			</div>
                			<div class="modal-body">처리가 완료되었습니다</div>
                			<div class="modal-footer">
                				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                				<button type="button" class="btn btn-primary">Save changes</button>
                			</div>
                		</div>
                		<!-- modal content -->
                	</div>
                	<!-- modal dialog -->
                </div>
	</div>
 </div>
 <script type="text/javascript">
	$(function(){
		var actionForm = $("#actionForm");
		$(".page-item a").on("click",function(e){
			e.preventDefault();
			actionForm.find("input[name='pageNum']").val($(this).attr("href"));
			actionForm.submit();
			});
		});
 </script>
<%@ include file="../includes/footer.jsp" %>
</body>
