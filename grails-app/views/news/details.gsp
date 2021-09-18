%{--Include Main Layout--}%
<meta name="layout" content="main"/>

<div class="card">
    <div class="card-header">
        <g:message code="member" args="['Details']"/>
    </div>
    <div class="card-body">
        <g:if test="${news}">
            <div class="form-group">
                <label><g:message code="news.title"/>*  </label>
                <g:textField name="title" class="form-control" value="${news?.title}" placeholder="Please Enter Headline" validation="true"/>

            </div>

            <div class="form-group">
                <label><g:message code="news.description"/></label>
                <g:textArea name="description" class="form-control" value="${news?.description}" placeholder="Please Enter Detail News" validation="true"/>
            </div>

            <div class="form-group">
                <label><g:message code="news.image"/> *</label>
                <g:field type="file" name="image" accept=".png, .jpg, .jpeg" value="${news?.image}" />

            </div>
            <div class="form-group">
                <label><g:message code="news.date"/> *</label>
                <g:datePicker name="dateCreated" value="${new Date()}"
                              noSelection="['':'-Choose-']"/>
            </div>



        </g:if>
        <div class="form-action-panel">
            <g:link controller="news" action="index" class="btn btn-primary"><g:message code="cancel"/></g:link>
        </div>
    </div>
</div>