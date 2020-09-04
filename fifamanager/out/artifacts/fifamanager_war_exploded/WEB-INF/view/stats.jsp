<jsp:include page="website/headerpublic.jsp" />

<div class="features">
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="section_title_container text-center">
					<h2 class="section_title">${app_welcome}</h2>
					<div class="section_subtitle"><p>${app_description}</p></div>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- Mes Championnats -->

<div class="championnat">
	<div class="section_background parallax-window" data-parallax="scroll"
		 data-image-src="${pageContext.request.contextPath}/resources/images/courses_background.jpg"
		 data-speed="0.8"></div>
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="section_title_container text-center">
					<h2 class="section_title">Mes championnats</h2>
					<div class="section_subtitle">
						<p>Ma liste de championnats</p>
					</div>
				</div>
			</div>
		</div>
		<div class="row courses_row">
			<!-- championnnat liste BD -->

		</div>
	</div>
</div>
</div>
				
				<!-- Course -->
				<div class="col-lg-4 course_col">
					<div class="course">
						<div class="course_image"><img src="${pageContext.request.contextPath}/resources/images/course_2.jpg" alt=""></div>
						<div class="course_body">
							<h3 class="course_title"><a href="course.html">Preparation au CE1D</a></h3>
							<div class="course_teacher">2e Secondaire</div>
							<div class="course_text">
								<p>La formule ideale pour des enfants en difficulte a l'approche de leur CE1D</p>
							</div>
						</div>
						<div class="course_footer">
							<div class="course_footer_content d-flex flex-row align-items-center justify-content-start">
								<div class="course_info">
									<i class="fa fa-graduation-cap" aria-hidden="true"></i>
									<span>10 jours de preparation intensive</span>
								</div>
								<div class="course_price ml-auto">$300</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Course -->
				<div class="col-lg-4 course_col">
					<div class="course">
						<div class="course_image"><img src="${pageContext.request.contextPath}/resources/images/course_3.jpg" alt=""></div>
						<div class="course_body">
							<h3 class="course_title"><a href="course.html">Preparation a l'examen du jury Central</a></h3>
							<div class="course_teacher">Jury Central</div>
							<div class="course_text">
								<p>la formule ideale pour etre pret lors de cet examen crucial</p>
							</div>
						</div>
						<div class="course_footer">
							<div class="course_footer_content d-flex flex-row align-items-center justify-content-start">
								<div class="course_info">
									<i class="fa fa-graduation-cap" aria-hidden="true"></i>
									<span>10 jours de preparation intensive</span>
								</div>
								<div class="course_price ml-auto">$250</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Course -->
				<div class="col-lg-4 course_col">
					<div class="course">
						<div class="course_image"><img src="${pageContext.request.contextPath}/resources/images/course_1.jpg" alt=""></div>
						<div class="course_body">
							<h3 class="course_title"><a href="course.html">Preparation Examen d'entree en medecine</a></h3>
							<div class="course_teacher">Medecine concours d'entree</div>
							<div class="course_text">
								<p>la formule ideale pour etre pret lors de cet examen crucial</p>
							</div>
						</div>
						<div class="course_footer">
							<div class="course_footer_content d-flex flex-row align-items-center justify-content-start">
								<div class="course_info">
									<i class="fa fa-graduation-cap" aria-hidden="true"></i>
									<span>10 jours de preparation intensive</span>
								</div>
								promo
								<div class="course_price ml-auto"><span>$500</span>$300</div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>



	<!-- Footer -->
<jsp:include page="footer.jsp" />