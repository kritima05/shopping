<!DOCTYPE html>
<html lang="en">
<head>
  <title>Sign Up</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div class="col-sm-1 middle-border"></div>
                        <div class="col-sm-1"></div>
                         
                        <div class="col-sm-5">
                         
                         <div class="form-box">
                          <div class="form-top">
                           <div class="form-top-left">
                            <h3>Sign up now</h3>
                               <p>Fill in the form below to get instant access:</p>
                           </div>
                           <div class="form-top-right">
                            <i class="fa fa-pencil"></i>
                           </div>
                             </div>
                             <div class="form-bottom">
                        <form role="form" action="signup" method="post" class="registration-form" model="user" commandName="user">
                         <div class="form-group">
                          <label class="sr-only" for="firstName">First name</label>
                             <input type="text" name="firstName" placeholder="First name" class="form-first-name form-control" id="firstName">
                            </div>
                            <div class="form-group">
                             <label class="sr-only" for="lastName">Last name</label>
                             <input type="text" name="lastName" placeholder="Last name..." class="form-last-name form-control" id="lastName">
                            </div>
                             <div class="form-group">
                             <label class="sr-only" for="genDer">Gender</label>
                             <input type="text" name="genDer" placeholder="Gender" class="form-gender form-control" id="genDer">
                           
                            </div>
                            <div class="form-group">
                             <label class="sr-only" for="phNumber">Phone Number</label>
                             <input type="number" name=phNumber" placeholder="Phone Number..." class="form-last-name form-control" id="phNumber">
                            </div>
                            <div class="form-group">
                             <label class="sr-only" for="emailId">Email</label>
                             <input type="text" name="emailId" placeholder="Email..." class="form-email form-control" id="emailId">
                            </div>
                            <div class="form-group">
                             <label class="sr-only" for="addRess">Address</label>
                             <textarea name="addRess" placeholder="Address..." 
                                class="form-address form-control" id="addRess"></textarea>
                            </div>
                            <button type="submit" class="btn">Sign me up!</button>
                        </form>
                       </div>
                         </div>
                         
                        </div>
                    </div>
                    
                </div>
            </div>
            
        </div>
 <!-- Footer -->
        <footer>
         <div class="container">
          <div class="row">
           
           <div class="col-sm-8 col-sm-offset-2">
            <div class="footer-border"></div>
           <i class="fa fa-smile-o"></i></p>
           </div>
           
          </div>
         </div>
        </footer>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

</body>
</html>