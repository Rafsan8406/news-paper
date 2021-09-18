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


<%--<g:if test="${!edit}">
    <div class="form-group">
        <label><g:message code="password"/> *</label>
        <g:passwordField name="password" class="form-control" value="${member?.password}" placeholder="Please Enter Password" validation="true"/>

    </div>
</g:if>--%>
