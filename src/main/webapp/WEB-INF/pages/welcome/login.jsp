
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Manage Your Grade</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">

         <link rel="stylesheet" type="text/css"  href="/web12/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="/web12/css/font-awesome.min.css">
		<link rel="stylesheet" href="/web12/css/form-elements.css">
        <link rel="stylesheet" href="/web12/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
      
  <style type="text/css">
  	     .div{
  	     	
  	     	background-image: url(img/1.jpg) ;
  	     
  	     }
  	     .sp{
  	     color:red;
  	     font-size:14px;
  	    
  	     }
  	      .div1{
  	     	background-image: url(img/7fcd24fda43f68c3542cb3d957403663.png);
  	     }
  	     .div2{
  	     	margin-top: -90px;
  	     }
  </style>
    </head>

    <body class="div">

        <!-- Top content -->
        <div class="top-content div2 "  >
        	
            <div class="inner-bg" >
                <div class="container"  >
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>Grade OS Pro Beat 1.0</strong></h1>                            <div class="description">
                            	<p>
	                            	
                            	</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top div1">
                        		<div class="form-top-left">
                        			<h3>Manage Your Grades</h3>
                            		<p>Enter your username and password to log on:</p>
                        		</div>
                        		<div class="form-top-right">
                        			
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="welcome.do" method="post" class="login-form">
			                    	<div class="form-group">
			                    		
			                    		
			                        <input type="text" name="username" placeholder="Username..." class="form-username form-control" id="form-username">
			                        </div>
			                        <div class="form-group">
			                        	
			                        	<input type="password" name="password" placeholder="Password..." class="form-password form-control" id="form-password">
			                        </div>
			                      <span class="sp">${ message}</span>
			                        <button type="submit" class="btn">Login in</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                      <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 social-login">
                     
                        	<div class="social-login-buttons">
	                        	<a class="btn btn-link-1 btn-link-1-facebook" href="#">
	                        		 Facebook
	                        	</a>
	                        	<a class="btn btn-link-1 btn-link-1-twitter" href="#">
	                        	 Twitter
	                        	</a>
	                        	<a class="btn btn-link-1 btn-link-1-google-plus" href="#">
	                        		Google Plus
	                        	</a>
                        	</div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>


        <!-- Javascript -->
       
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>