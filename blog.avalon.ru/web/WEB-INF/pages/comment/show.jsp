<%-- 
    Document   : show
    Created on : 09.07.2019, 21:17:51
    Author     : Svtlana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="common" tagdir="/WEB-INF/tags/common/" %>

<common:layout>
    <jsp:attribute name="title">
${review.title}
    
    </jsp:attribute>
    <jsp:body>
        <h2>
            ${comment.title}
            
        </h2>
       ${comment.content}
    </jsp:body>
    
    
</common:layout>
