


<%--<div id="global-wrapper">
    <div id="content-wrapper">
        <div class="container">
            <div class="row">
                <div class="col-sm-6 col-md-4 mx-auto">
                    <h1 class="text-center login-title">Member Login</h1>
                    <div class="account-wall">
                        <g:form  controller="Authentication" action="doLogin" class="form-signin">
                            <g:textField name="email" class="form-control" placeholder="Email" required="required" />
                            <g:passwordField name="password" class="form-control" placeholder="Password" required="required" />
                            <g:submitButton class="btn btn-lg btn-primary btn-block" name="login" value="Login"/>
                            <g:link controller="member" action="create" class="btn btn-lg btn-primary btn-block">Member Registration</g:link>
                        </g:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>--%>
<div class="row" style="background: #3598dc">
<h2> Member Login Form</h2>

<div class="cont">

    <div class="form">
        <%--<form action="">
            <h1>Login</h1>
            <input type="text"
                   class="user"
                   placeholder="Username"/>
            <input type="password"
                   class="pass"
                   placeholder="Password"/>
            <button                class="login">Login</button>
        </form>--%>
        <g:form  controller="Authentication" action="doLogin" class="form-signin">
            <h1>Login</h1>
            <g:textField name="email" class="user" placeholder="Email" required="required" />
            <g:passwordField name="password" class="pass" placeholder="Password" required="required" />
            <g:submitButton class="login" name="login" value="Login"/>
            <g:link controller="authentication" action="register" class="btn btn-lg btn-primary btn-block">Member Registration</g:link>
        </g:form>
    </div>


</div>
</div>
<style>
@import url('https://fonts.googleapis.com/css?family=Raleway:300,400,700');
.row{
    height: 100%;
}
.cont{
    /*background: #3598dc;*/
    margin: 0;
    padding: 0;
    outline: none;
    box-sizing: border-box;
    font-family: 'Raleway', sans-serif;
}

.cont{
    height: auto;
    background: greenyellow; }

.cont{
    position: relative;
    width: 25%;
    height: 400px;
    padding: 10px 25px;
    margin: 10vh auto;
    background: #fff;
    border-radius: 8px;
}

.cont .form{ width: 100%; height: 100%; }

.cont h1, h2, .user, .pass{
    text-align: center;
    display: block;
}

.cont h1{
    color: #606060;
    font-weight: bold;
    font-size: 40px;
    margin: 30px auto;
}

.cont .user, .pass, .login{
    width: 100%;
    height: 45px;
    border: none;
    border-radius: 5px;
    font-size: 20px;
    font-weight: lighter;
    margin-bottom: 30px;
}

.cont .user, .pass{ background: #ecf0f1; }

.cont .login{
    color: #fff;
    cursor: pointer;
    margin-top: 20px;
    background: #3570dc;
    transition: background 0.4s ease;
}

.cont .login:hover{ background: #3570dc; }

@media only screen and (min-width : 280px) {
    .cont{ width: 90% }
}

@media only screen and (min-width : 480px) {
    .cont{ width: 60% }
}

@media only screen and (min-width : 768px) {
    .cont{ width: 40% }
}
@media only screen and (min-width : 992px) {
    .cont{ width: 30% }
}

.cont h2{ color: #fff; margin-top: 25px; }



</style>