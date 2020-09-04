<jsp:include page="../headercon.jsp" />
<!-- Contact -->

<div class="contact">

	<!-- Contact Map -->

	<!-- Contact Info -->

	<div class="contact_info_container">
		<div class="container">
			<div class="row">

				<!-- Contact Form -->
				<div class="col-lg-6">
					<div class="contact_form">
						<div class="contact_info_title">Veuillez introduire vos
							identifiants pour vous connecter</div>
						<%
							String error = (String) request.getAttribute("error");

							if (error == "true") {
						%>
						<p style='text-align: center;'>
							<span style="color: red;">Email ou mot de passe eronne</span>
						</p>
						<%
							}
						%>
						<form method="POST" action="/fifamanager/student"
							class="counter_form_content d-flex flex-column align-items-center justify-content-center">
							<input type="email" class="comment_input" name="email"
								placeholder="Email :" required="required"> 
							<input
								type="password" class="comment_input" name="password"
								placeholder="Mot de passe:" required="required">

							<button type="submit" class="comment_button trans_200">Connexion</button>
							<p>
								<a href="/fifamanager/student/register">Pas encore inscrit ?
									S'inscrire</a>
							</p>
						</form>
					</div>
				</div>

				<!-- Contact Info -->
				<div class="col-lg-6">
					<div class="contact_info">
						<div class="contact_info_title"></div>
						<div class="contact_info_text">
							<p>Bienvenue sur Profacile. Le site de soutien à domicile conçu pour des étudiants en difficultés. Grace à nos remises à niveau très éfficaces, votre enfant pourra reussir son année.</p>
							<p>
								<a href="#">Devenez Professeur</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- Newsletter -->

<div class="newsletter" style="display: none;">
	<div class="newsletter_background"
		style="background-image:url(${pageContext.request.contextPath}/resources/images/newsletter_background.jpg)"></div>
	<div class="container">
		<div class="row">
			<div class="col">
				<div
					class="newsletter_container d-flex flex-lg-row flex-column align-items-center justify-content-start">

					<!-- Newsletter Content -->
					<div class="newsletter_content text-lg-left text-center">
						<div class="newsletter_title">Inscrivez vous a notre
							Newsletter et recevez des promotions</div>
						<div class="newsletter_subtitle">Abonnez-vous aux dernieres
							actualites sur les smartphones et aux meilleures offres que nous
							proposons</div>
					</div>

					<!-- Newsletter Form -->
					<div class="newsletter_form_container ml-lg-auto">
						<form action="#" id="newsletter_form"
							class="newsletter_form d-flex flex-row align-items-center justify-content-center">
							<input type="email" class="newsletter_input"
								placeholder="Votre Email" required="required">
							<button type="submit" class="newsletter_button">S'inscrire</button>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
