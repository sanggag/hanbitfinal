<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table width="100%">
	<tr>
	<c:forEach items="${tempData.bottomList }" var="mm">
		<td ><a href="../../${mm.url }/index/index">${mm.value }</a></td>
		</c:forEach>
	</tr>
</table>