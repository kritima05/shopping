<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
  <%@include file="Header.jsp" %>
<div class="navbar navbar-inverse navbar-static-top" role="navigation">

    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" rel="home" href="Home.jsp" title=""></a>
    </div>  
  
    

    <div class="collapse navbar-collapse navbar-ex1-collapse">

        <ul class="nav navbar-nav">
              <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" >Apparel <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href=${session.getContextPath()}"/shoppingAdda/product/Top Wear">Top Wear</a></li>
          <li><a href="#">Bottom Wear</a></li>
          <li><a href="#">Winter Wear</a></li>
        </ul>
      </li>
              <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" >Footwear <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="product">Flats</a></li>
          <li><a href="#">Flip-Flops</a></li>
          <li><a href="#">Heels</a></li>
        </ul>
      </li>
        
  <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Accessories<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Watches</a></li>
          <li><a href="#">Bags</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Cosmetics<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
              <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Brands <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Sales <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
        </ul>

        <div class="col-sm-3 col-md-3 pull-right">
        <form class="navbar-form" role="search">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search" height="15px" name="srch-term" id="srch-term">
            <div class="input-group-btn">
                <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
            </div>
        </div>
        </form>
        </div>

    </div>
</div>
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/apparels.jpg" alt="Apparels" width="460" height="345">
      </div>

      <div class="item">
        <img src="resources/images/footwear.jpg" alt="Footwear" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="resources/images/accessories.jpg" alt="Accessories" width="460" height="345">
      </div>

      <div class="item">
        <img src="resources/images/cosmetics.jpg" alt="Cosmetics" width="460" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<%@include file="Footer.jsp" %>