<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>
<%@include file="Header.jsp"%>
<script>

var prod;
var app=angular.module("searchApp",[]).controller("Tablectr",function($scope){$scope.prod=${key};});


</script>
<title>Products</title>
</head>
<body>
<div ng-app="searchApp">
<div class="container" ng-controller="Tablectr">
<input type="search" ng-model="searchText" class="form-control" id="inputsearch" placeholder="search here"/>
    <div class="table-responsive">
    <table class="table table-striped table-bordered w3-blue">
    <caption>${{prod.category}}</caption>
    <thead style="color:#CD5C5C">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Brand</th>
        <th>Color</th>
        <th>Size</th>
        <th>Category</th>
        <th>Price</th>
         <th>More</th>
    </tr>
    </thead>
    <tbody>
    
        <tr ng-repeat="p in prod">
        <td>{{product.id}} </td>
                      <td>{{product.name}}</td>
            <td>{{product.brand}}</td>
            <td>{{product.color}}</td>
            <td>{{product.size}}</td>
            <td>{{product.category}}</td>
            <td>{{product.price}}</td>         
            <td><a href="<c:url value='/productdescription' />" >More</a></td>
        </tr>
   
    <tbody>
    </table>
 </div>
 </div>
<div class="col-xs-1"></div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/2.0.0-beta.17/angular2.min.js"></script>
</body>
</html>