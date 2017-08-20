<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>Login</title>
    <asset:stylesheet src="bootstrap.css"/>
    <asset:stylesheet src="jquery.growl.css"/>
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="https://cdn.auth0.com/js/lock/10.0/lock.min.js"></script>
    <asset:javascript src="jquery.growl.js"/>
</head>
<body>
<div class="container">
    <script type="text/javascript">
        $(function () {
            $.growl({title: "Welcome!", message: "Please log in"});
        });
        $(function () {
            var lock = new Auth0Lock('${clientId}', '${domain}', {
                auth: {
                    redirectUrl: "${createLink(controller: 'callback', absolute: true)}",
                    responseType: 'code',
                    params: {
                        state: '${state}',
                        // Learn about scopes: https://auth0.com/docs/scopes
                        scope: 'openid user_id name nickname email picture'
                    }
                }
            });
            setTimeout(function () {
                lock.show();
            }, 1500);
        });
    </script>
</div>
</body>
</html>
