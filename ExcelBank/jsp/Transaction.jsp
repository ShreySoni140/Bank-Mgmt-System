<% String msg=(String)request.getAttribute("msg"); %>
<html>
	<head>
    		<title>Core Banking</title>
    	</head>

	<body bgcolor="#FFFFFF" text="#000000">
		<center>
				<% if(msg!=null) {%>
					<%=msg%>
				<%}%>
				<link rel="stylesheet" href="/ExcelBank/style/bank.css">
				<table cellpadding="5" border="3" bordercolor="red" width="1000">
						<jsp:include page="/jsp/header.jsp"/>
						<jsp:include page="/jsp/TransactionMain.jsp"/>
						<jsp:include page="/jsp/footer.jsp"/>
				</table>
		</center>
	</body>
</html>
