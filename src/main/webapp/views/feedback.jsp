
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Feedback</title>
	<%@include file="../links.jsp" %>
	<link rel="stylesheet" href="<%=application.getContextPath()%>/css/style.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
  <body>
    <%@include file="../script.jsp" %>
     <%@include file="header.jsp" %>
    
    <form action="<%=application.getContextPath() %>/feedback" method="post">
  <div class="mb-3">
 
    <label for="InputEmail1" class="form-label">Email address</label>
    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

  </div>
  <div class="mb-3">
    <label for="InputName" class="form-label">Name</label>
    <input type="text" name="username" class="form-control" id="InputName">
  </div>
    <div class="mb-3">
    <label for="InputNumber" class="form-label">Phone Number</label>
    <input type="text" name="number" class="form-control" id="InputNumber">
  </div>
      <div class="mb-3">
    <label for="InputFeedback" class="form-label">FeedBack</label>
    <input type="text" name="feedbackmsg" class="form-control" id="InputFeedback">
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>
    
    
  </body>
</html>
