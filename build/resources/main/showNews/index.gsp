<meta name="layout" content="main"/>
<div class="newsrow row">
<g:each in="${newsList}" var="info">
    <g:if test="${info.isPublish ==true}">
    <%--<div class="square">
        <img src="https://images.unsplash.com/photo-1504610926078-a1611febcad3?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=e1c8fe0c9197d66232511525bfd1cc82&auto=format&fit=crop&w=1100&q=80" class="mask">
        <div class="h1">${info.title}</div>
        <p>${info.description}</p>

        <div>
            <g:link controller="ShowNews" action="readMore" id="${info.id}" class="button"><g:message code="readmore"/></g:link></div>
    </div>--%>
        <div class="col-md-4">
        <div class="card" style="margin-bottom: 15px;display: flex">
            <%--<g:img uri="https://images.unsplash.com/photo-1504610926078-a1611febcad3?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=e1c8fe0c9197d66232511525bfd1cc82&auto=format&fit=crop&w=1100&q=80" class="card-img-top"/>--%>
            <img  class="card-img-top"  alt="Missing Cover" src="${createLink(controller:'ShowNews', action:'showCover', id:"${info.id}")}">
            <div class="card-body">

                <h5 class="card-title">${info.title}</h5>
                <p class="card-text">${info.description}</p>
                <g:link controller="ShowNews" action="readMore" id="${info.id}" class="btn btn-primary"><g:message code="readmore"/></g:link></div>

        </div>
        </div>

    </g:if>
</g:each>
</div>




