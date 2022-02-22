<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <table border="1">
   <tr>
      <td class="left">상품번호</td>
      <td class="left">상품이름</td>
      <td class="left">상품가격</td>
      <td class="left">상품이미지</td>
   </tr>
   <c:forEach items="${list}" var="one">
   <tr>
      <td class="right">${one.id}</td> <!-- one.getId() -->
      <td class="right"><a href="one?id=${one.id}">${one.name}</a></td>
      <td class="right">${one.price}</td>     
      <td class="right"><img src="resources/img/${one.img}" width="100px" height="50px"></td>
   </tr>
   </c:forEach>
</table>