<!DOCTYPE html>
<!--[if IE 8]> 				 <html class="no-js lt-ie9" lang="en" > <![endif]-->
<!--[if gt IE 8]><!--> 
<html class="no-js" lang="es" > <!--<![endif]-->
<head>
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width">
  	<title>Retail</title>
  	<link rel="stylesheet" href="css/foundation.css">
  	<script src="js/vendor/custom.modernizr.js"></script>
</head>
<body>
	<div class="row">
		<!-- Encabezado -->
		<div class="large-4 columns">
                    <a href="index.jsp">
                        <img src="Images/icono.png"/>
                    </a>    
		</div>
		<div class="large-8 columns">
			<div class="large-12 columns">
				<div data-magellan-expedition="fixed">
          			<dl class="sub-nav right">
            			<dd data-magellan-arrival="build"><a href="#" data-reveal-id="ventana">Iniciar Sesión</a></dd>
            			<dd data-magellan-arrival="js"><a href="#">Registrate</a></dd>
          			</dl>
        		</div>
			</div>
			<div class="large-12 columns">
				<ul class="button-group right">
					<li><a href="#" class="button">Botones</a></li>
					<li><a href="#" class="button">Botones</a></li>
					<li><a href="#" class="button">Botones</a></li>
					<li><a href="#" class="button">Botones</a></li>
				</ul>
			</div>
		</div>				
	</div>
	<div class="row">
		<!-- Contenido -->
                <div id="ventana" class="reveal-modal">
                    <jsp:include page="Vistas/Login.jsp"/>
                </div>
		<div class="panel">
			Contenido de la página
			
		</div>
	</div>
	<div class="row">
		<!-- Pie -->
		<ul class="breadcrumbs right">
			<li><a href="#">Botones</a></li>
			<li><a href="#">Botones</a></li>
			<li><a href="#">Botones</a></li>
			<li><a href="#">Botones</a></li>
		</ul>	
	</div>


<!-- Script -->
	<script>
      document.write('<script src=' +
      ('__proto__' in {} ? 'js/vendor/zepto' : 'js/vendor/jquery') +
      '.js><\/script>')
  </script>


  <script src="js/foundation/foundation.js"></script>
  <script src="js/foundation/foundation.reveal.js"></script>
  <script src="js/foundation.min.js"></script>
  <!-- Other JS plugins can be included here -->

  <script>
    $(document).foundation();

     $.ajax({
        url: '//zurb.com/jobs/widgets/jobs.json?limit=3',
        dataType: 'jsonp',
        success: function(data) {
          var list = $("<ul></ul>");
          $.each(data.jobs, function(idx, job) {
            var item = "<li><a href='"+job.url+"' target='_blank'>" +
              "<span class='positionTitle'>"+job.title+"</span>" +
              "<span class='location'><span class='companyName'>"+job.company_name+"</span> in "+job.location+"</span>" +
              "</a>" +
              "</li>";
            list.append(item);
          });
            // Customize This
          $("#zurbJobsWidget").html(list);
        }
      });

      // For Kitchen Sink Page
      $('#start-jr').on('click', function() {
        $(document).foundation('joyride','start');
      });
  </script>
</body>
</html>
