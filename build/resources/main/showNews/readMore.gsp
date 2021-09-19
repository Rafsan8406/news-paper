
<meta name="layout" content="main"/>
<div>
   <%--<g:img uri="https://images.unsplash.com/photo-1504610926078-a1611febcad3?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=e1c8fe0c9197d66232511525bfd1cc82&auto=format&fit=crop&w=1100&q=80"
   style="width: 2000px; height: 400px"/>--%>
   <img  alt="Missing Cover" style="width: 622px; height: 450px" src="${createLink(controller:'ShowNews', action:'showCover', id:"${news.id}")}">
   <p><b>${news.title}</b></p>
   <p><b>${news.dateCreated}</b></p>
   <p><b>${news.member.firstName}</b></p>

<div></div>

<p>
   ${news.description}
</p>




</div>


<%--<g:if test="${!edit}">
    <div class="form-group">
        <label><g:message code="password"/> *</label>
        <g:passwordField name="password" class="form-control" value="${member?.password}" placeholder="Please Enter Password" validation="true"/>

    </div>
</g:if>--%>
