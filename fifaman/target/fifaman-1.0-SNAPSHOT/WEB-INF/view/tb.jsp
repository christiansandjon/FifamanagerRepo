<jsp:include page="header.jsp" />
	<!-- Contact -->

	<div class="contact">
		
		<!-- Contact Map -->

		<!-- Contact Info -->

		<div class="contact_info_container">
			<div class="container">
				<div class="row">

					<!-- Contact Form -->
					<div class="col-lg-6">
<h1>${welcomeMessage}</h1>>
					</div>

					<!-- Contact Info -->
					<div class="col-lg-6">
						<div class="contact_info">
							<div class="contact_info_title"></div>
							<div class="contact_info_text">
								<p>B${welcomeMessage}</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

<!-- Newsletter -->

<div class="newsletter" style="display:none;">
	<div class="newsletter_background" style="background-image:url(${pageContext.request.contextPath}/resources/images/newsletter_background.jpg)"></div>
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="newsletter_container d-flex flex-lg-row flex-column align-items-center justify-content-start">

					<!-- Newsletter Content -->
					<div class="newsletter_content text-lg-left text-center">
						<div class="newsletter_title">Inscrivez vous à notre Newsletter</div>
						<div class="newsletter_subtitle">Abonnez-vous aux dernieres actualites</div>
					</div>

					<!-- Newsletter Form -->
					<div class="newsletter_form_container ml-lg-auto">
						<form action="#" id="newsletter_form" class="newsletter_form d-flex flex-row align-items-center justify-content-center">
							<input type="email" class="newsletter_input" placeholder="Votre Email" required="required">
							<button type="submit" class="newsletter_button">S'inscrire</button>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="footer.jsp" />
