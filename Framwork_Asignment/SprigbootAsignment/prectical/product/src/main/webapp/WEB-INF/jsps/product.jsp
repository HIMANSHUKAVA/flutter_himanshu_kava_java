<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Add Product</title></head>
<body>

<h2>Add Product</h2>

<form action="/productsave" method="post">
    <label>Product Name:</label>
    <input type="text" name="name"/><br><br>

    <label>Price:</label>
    <input type="text" name="price"/><br><br>

    <label>Category:</label>
    <select name="category.category_id">
        <c:forEach var="c" items="${categories}">
            <option value="${c.category_id}">${c.category_name}</option>
        </c:forEach>
    </select>
    <br><br>

    <input type="submit" value="Save"/>
</form>


<table border="1" style="padding: 5px">

<thead>


<tr>


<th>Name</th>
<th>Price</th>
<th>Category</th>
</tr>
</thead>

<tbody>

<c:forEach var="c" items="${s1}">


<tr>

<td>${c.name}</td>
<td>${c.price}</td>
<td>${c.category.category_name}</td>

</tr>

</c:forEach>

</tbody>


</table>


<c:if test="${currentpage + 1< totalpages}">

<a href="?page=${currentpage+1}">Next</a>
</c:if>
</body>
</html>
