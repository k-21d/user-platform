<head>
<jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
	<title>My Home Page</title>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>
<body>
	<div class="container">
		<form class="form-signin" >
			<h1 class="h3 mb-3 font-weight-normal">注册用户</h1>
			<label for="inputName" class="sr-only">请输入用户名</label>
			<input type="name" id="inputName" class="form-control"
				placeholder="请输入用户名" required autofocus> <label
				for="inputPassword" class="sr-only">Password</label> <input
				type="password" id="inputPassword" class="form-control"
				placeholder="请输入密码" required>
			<input type="button" value="注册"  class="btn btn-lg btn-primary btn-block" onClick="tpformsubmit()"/>
			<p class="mt-5 mb-3 text-muted">&copy; 2017-2021</p>
		</form>

	</div>
			<script>
                function tpformsubmit(){
                    var name = $('input[id=inputName]').val();
                    var password = $('input[id=inputPassword]').val();
                    url = '/doRegister?name='+name+'&password='+password;
                    window.location.href = url;
                }
            </script>
</body>