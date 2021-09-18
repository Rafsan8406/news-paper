<div class="form-group">
    <label><g:message code="first.name"/>*  </label>
    <g:textField name="firstName" class="form-control" value="${member?.firstName}" placeholder="Please Enter First Name" validation="true"/>

</div>

<div class="form-group">
    <label><g:message code="last.name"/></label>
    <g:textField name="lastName" class="form-control" value="${member?.lastName}" placeholder="Please Last Name" validation="true"/>
</div>

<div class="form-group">
    <label><g:message code="email.address"/> *</label>
    <g:field type="email" name="email" class="form-control" value="${member?.email}" placeholder="Please Enter Email" validation="true"/>

</div>

<g:if test="${!edit}">
    <div class="form-group">
        <label><g:message code="password"/> *</label>
        <g:passwordField name="password" class="form-control" value="${member?.password}" placeholder="Please Enter Password" validation="true"/>

    </div>
</g:if>
