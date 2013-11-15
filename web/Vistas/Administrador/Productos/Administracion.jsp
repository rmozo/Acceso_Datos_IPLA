<!DOCTYPE html>
<!--[if IE 8]> 				 <html class="no-js lt-ie9" lang="en" > <![endif]-->
<!--[if gt IE 8]><!--> 
<html class="no-js" lang="es" > <!--<![endif]-->

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>Gestión de Productos</title>
  <link rel="stylesheet" href="../../../css/foundation.css">
  <script src="../../../js/vendor/custom.modernizr.js"></script>

    <!-- Abrir pagina en DIV -->
    <script type="text/javascript">
        function ajaxFunction() {
            var xmlHttp;
            try {

            xmlHttp=new XMLHttpRequest();
            return xmlHttp;
          } catch (e) {

            try {
              xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
              return xmlHttp;
            } catch (e) {

                  try {
                xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
                return xmlHttp;
              } catch (e) {
                alert("Tu navegador no soporta AJAX!");
                return false;
              }}}
        }
       function Enviar(_pagina,capa) {
            var ajax;
            ajax = ajaxFunction();
            ajax.open("POST", _pagina, true);
            ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

            ajax.onreadystatechange = function() {
                        if (ajax.readyState==1){
                                document.getElementById(capa).innerHTML = " Aguarde por favor...";
                                     }
                        if (ajax.readyState == 4) {

                        document.getElementById(capa).innerHTML=ajax.responseText; 
                             }}

                ajax.send(null);
        } 
    </script>

</head>
	<body>
		<div class="row">
			<!-- Menu -->
			<div class="large-4 columns">
                            <img src="../../../Images/icono.png" width="128" height="128" alt="icono"/>

                        </div>
            <div class="large-8 columns">
            	<div class="large-12 columns">
	              

        <nav class="top-bar">
          <ul class="title-area">
            <!-- Title Area -->
            <li class="name">
              <h1><a href="/">Ventas Ipla</a></h1>
            </li>
            <!-- Remove the class "menu-icon" to get rid of menu icon. Take out "Menu" to just have icon alone -->
            <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
          </ul>

          <section class="top-bar-section">
            <ul class="left">
              <li class="divider"></li>
              <li class="has-dropdown"><a href="/grid.php">Item 1</a>

                <ul class="dropdown">
                  <li><label>Level One</label></li>
                  <li><a href="#">Sub-item 1</a></li>
                  <li><a href="#">Sub-item 2</a></li>
                  <li class="divider"></li>
                  <li><a href="#">Sub-item 3</a></li>
                  <li class="has-dropdown"><a href="#">Sub-item 4</a>

                    <ul class="dropdown">
                      <li><label>Level Two</label></li>
                      <li class="has-dropdown"><a href="#">Sub-item 1</a>

                        <ul class="dropdown">
                          <li><label>Level Three</label></li>
                          <li class="has-dropdown"><a href="#">Sub-item 1</a>

                            <ul class="dropdown">
                              <li><label>Level Four</label></li>
                              <li><a href="http://zurb.com">Sub-item 1</a></li>
                            </ul>
                          </li>
                          <li><a href="#">Sub-item 2</a></li>
                          <li><a href="#">Sub-item 3</a></li>
                          <li class="divider"></li>
                          <li><a href="#">Sub-item 4</a></li>
                        </ul>
                      </li>
                      <li><a href="#">Sub-item 2</a></li>
                      <li><a href="#">Sub-item 3</a></li>
                      <li><a href="#">Sub-item 4</a>
                    </ul>
                  </li>
                  <li><a href="#">Sub-item 5</a></li>
                </ul>
              </li>
              <li class="divider"></li>
            </ul>
            <!-- Right Nav Section -->
            <ul class="right">
              <li class="divider hide-for-small"></li>
              <li><a href="#">Item 2</a></li>
            </ul>
          </section>
        </nav>
	            </div>
	            <div class="large-12 columns">
					<ul class="button-group right">
						<li><a href="#"class="button tiny">Botoncitos</a></li>
						<li><a href="#"class="button tiny">Botoncitos</a></li>
					</ul>		            	
	            </div>    
            </div> 
            <hr/>   
		</div>

		<div class="row">
			
			<!-- Contenido -->
			<div class="large-3 columns">
				<!-- Menu desplegable-->
				<div class="float-left">
					<div class="docs section-container accordion"
					data-section="accordion" data-option="one_up:false">
					<section class="section active">
						<p class="title"><a href="#">Productos</a></p>
							<div class="content">
								<ul class="side-nav">
									<li><a href="javascript:Enviar('Categorias.jsp','contenedor')">Categorías</a></li>
									<li><a href="javascript:Enviar('Marcas.jsp','contenedor')">Marcas</a></li>
                                                                        <li><a href="javascript:Enviar('Medidas.jsp','contenedor')">Medidas</a></li>
                                                                        <li><a href="javascript:Enviar('Proveedores.jsp','contenedor')">Proveedores</a></li>
                                                                        <li><a href="javascript:Enviar('Productos.jsp','contenedor')">Productos</a></li>
								</ul>
							</div>
					</section>
					<section class="section">
						<p class="title"><a href="#">Utilidades</a></p>
							<div class="content">
								<ul class="side-nav">
									<li><a href="#">Cerrar Sesión</a></li>
									<li><a href="#">Cambiar Password</a></li>
								</ul>
							</div>
					</section>	
					</div>
				</div>
			</div>
                        <div class="large-9 columns" id="contenedor">
				
			</div>	
		</div>
		<div class="row">
			<hr>
			<!-- Pie de Página -->
			<dl class="sub-nav right">
			  <dt>Opciones:</dt>
			  <dd class="active"><a href="#">Index</a></dd>
			  <dd><a href="#">Nuevo</a></dd>
			  <dd><a href="#">OP1</a></dd>
			  <dd><a href="#">OP2</a></dd>
			</dl>
		</div>
<!-- Script -->

  <script>
      document.write('<script src=' +
      ('__proto__' in {} ? '../../../js/vendor/zepto' : '../../../js/vendor/jquery') +
      '.js><\/script>')
  </script>
  
  <script src="../../../js/foundation.min.js"></script>
   
  <script>
      $(document).foundation();
  </script>


	</body>
</html>
