<%@include file="../include/header.jsp"%>

<section class="content">
	<div class="row">
		<div class="col-md-12">
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">READ BOARD</h3>
				</div>
				<form role="form" action="modifyPage" method="post">
					<input type="hidden" name="bno" value="${boardVO.bno }">
					<input type="hidden" name="page" value="${cri.page }">
					<input type="hidden" name="perPageNum" value="${cri.perPageNum }">
				</form>
				<div class="box-body">
					<div class="form-group">
						<label for="exampleInputEmail1">Title</label> <input type="text"
							name="title" class="form-control" value="${boardVO.title }"
							readonly="readonly">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Content</label>
						<textarea class="form-control" name="content" rows="3"
							readonly="readonly">${boardVO.content }</textarea>
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">writer</label> <input type="text"
							name="writer" class="form-control" value="${boardVO.writer }"
							readonly="readonly">
					</div>
				</div>
				<div class="box-footer">
					<button type="submit" class="btn btn-warning">Modify</button>
					<button type="submit" class="btn btn-danger">Remove</button>
					<button type="submit" class="btn btn-primary">List All</button>
				</div>
				<script type="text/javascript">
					$(document).ready(function() {
						var formObj = $("form[role='form']");
						console.log(formObj);

						$(".btn-warning").on("click", function() {
							formObj.attr("action", "/board/modifyPage");
							formObj.attr("method", "get");
							formObj.submit();
						});

						$(".btn-danger").on("click", function() {
							formObj.attr("action", "/board/removePage");
							formObj.submit();
						});

						$(".btn-primary").on("click", function() {
							formObj.attr("method", "get");
							formObj.attr("action", "/board/listPage");
							formObj.submit();
						});
					});
				</script>
			</div>
		</div>
	</div>
</section>

<%@include file="../include/footer.jsp"%>
