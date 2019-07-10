<%-- 
    Document   : error
    Created on : 22.06.2019, 15:22:44
    Author     : JAVA
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setBundle basename="resources.errors"/>

<%@attribute name="error"%>

<c:if test="${not empty error}">
    
    <div class="box error gap-bottom">
        <fmt:message key="${error}"/>
    </div>
    
</c:if>