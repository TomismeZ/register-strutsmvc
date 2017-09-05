    function registerValidate() {

        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        var confimPassword = document.getElementById("confimPassword").value;
        var email = document.getElementById("email").value;
        // if(username==""||password==""||confimPassword==""||email==""){
        // 	alert("不允许为空！");
        // return false;
        // }
        if (username == "") {
            alert("用户名不允许为空！");
            return false;
        } else if (password == "") {
            alert("密码不允许为空！");
            return false;
        } else if (confimPassword == "") {
            alert("确认密码不允许为空！");
            return false;
        } else if (email == "") {
            alert("邮箱不允许为空！");
            return false;
        }
        if (username.length < 6 || username.length > 20) {
            alert("用户名长度必须在6-20个字符之间");
            return false;
        }
        if((password.length>=6&&password<=20)||(confimPassword.length>=6&&confimPassword.length<=20)){
        	if(password===confimPassword){
        		return true;
        	}else{
        		alert("密码和重复密码必须相同！");
        		return false;
        	}
        }else{
        	alert("密码或者重复密码的长度必须在6-20个字母之间！");
        	return false;
        }
    }