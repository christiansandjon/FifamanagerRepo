<jsp:include page="headerpublic.jsp"/>
<!-- Home -->

<div class="home">
    <div class="home_slider_container">

        <!-- Home Slider -->
        <div class="owl-carousel owl-theme home_slider">

            <!-- Home Slider Item -->
            <div class="owl-item">
                <div class="home_slider_background"
                     style="background-image:url(${pageContext.request.contextPath}/resources/images/rashhh.jpg)"></div>
                <div class="home_slider_content">
                    <div class="container">
                        <div class="row">
                            <div class="col text-center">
                                <div class="col text-center">
                                    <div class="home_slider_title">${app_welcome}</div>
                                    <div class="home_slider_subtitle">${app_description}</div>
                                    <div class="home_slider_form_container"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Home Slider Item -->
            <div class="owl-item">
                <div class="home_slider_background"
                     style="background-image:url(${pageContext.request.contextPath}/resources/images/mbappe.jpg)"></div>
                <div class="home_slider_content">
                    <div class="container">
                        <div class="row">
                            <div class="col text-center">
                                <div class="home_slider_title">${app_welcome}</div>
                                <div class="home_slider_subtitle">${app_description}</div>
                                <div class="home_slider_form_container"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Home Slider Item -->
            <div class="owl-item">
                <div class="home_slider_background"
                     style="background-image:url(${pageContext.request.contextPath}/resources/images/dembele.jpg)"></div>
                <div class="home_slider_content">
                    <div class="container">
                        <div class="row">
                            <div class="col text-center">
                                <div class="col text-center">
                                    <div class="home_slider_title">${app_welcome}</div>
                                    <div class="home_slider_subtitle">${app_description}</div>
                                    <div class="home_slider_form_container"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>

    <!-- Home Slider Nav -->

    <div class="home_slider_nav home_slider_prev"><i class="fa fa-angle-left" aria-hidden="true"></i></div>
    <div class="home_slider_nav home_slider_next"><i class="fa fa-angle-right" aria-hidden="true"></i></div>
</div>

<!-- Features -->

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

<!-- Nos formules -->

<div class="courses">
    <div class="section_background parallax-window" data-parallax="scroll"
         data-image-src="${pageContext.request.contextPath}/resources/images/courses_background.jpg"
         data-speed="0.8"></div>
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="section_title_container text-center">
                    <h2 class="section_title">Creer vos championnats</h2>
                </div>
            </div>
        </div>
        <div class="row courses_row">

            <!-- Course -->
            <div class="col-lg-4 course_col">
                <div class="course">
                    <div class="course_image"><img
                            src="${pageContext.request.contextPath}/resources/images/rash.jpg" alt=""></div>
                    <div class="course_body">
                        <h3 class="course_title"><a href="../newchampionnat.jsp">La Premier League</a></h3>
                        <div class="course_teacher">UK</div>
                        <div class="course_text">
                            <p>Le championnat le plus engage au monde</p>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Course -->
            <div class="col-lg-4 course_col">
                <div class="course">
                    <div class="course_image"><img
                            src="${pageContext.request.contextPath}/resources/images/dembele.jpg" alt=""></div>
                    <div class="course_body">
                        <h3 class="course_title"><a href="../newchampionnat.jsp">La Liga</a></h3>
                        <div class="course_teacher">BVBA</div>
                        <div class="course_text">
                            <p>Le championnat des plus grands techniciens de ballon</p>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Course -->
            <div class="col-lg-4 course_col">
                <div class="course">
                    <div class="course_image"><img
                            src="${pageContext.request.contextPath}/resources/images/camavinga.jpg" alt=""></div>
                    <div class="course_body">
                        <h3 class="course_title"><a href="course.html">La ligue 1</a></h3>
                        <div class="course_teacher">Castorama</div>
                        <div class="course_text">
                            <p>Le championnat le plus physique au monde</p>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>


<!-- Popular Courses -->

<div class="courses">
    <div class="section_background parallax-window" data-parallax="scroll"
         data-image-src="${pageContext.request.contextPath}/resources/images/courses_background.jpg"
         data-speed="0.8"></div>
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="section_title_container text-center">
                    <h2 class="section_title">Creer vos equipes</h2>
                    <div class="section_subtitle"><p>
                    </p></div>
                </div>
            </div>
        </div>
        <div class="row courses_row">

            <!-- Course -->
            <div class="col-lg-4 course_col">
                <div class="course">
                    <div class="course_image"><img src="${pageContext.request.contextPath}/resources/images/messi.jpg"
                                                   alt=""></div>
                    <div class="course_body">
                        <h3 class="course_title"><a href="course.html">Le Barça</a></h3>
                        <div class="course_teacher">Mr. Christian Sandjon</div>
                        <div class="course_text">
                            <p>Meilleure equipe de Liga</p>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Course -->
            <div class="col-lg-4 course_col">
                <div class="course">
                    <div class="course_image"><img src="${pageContext.request.contextPath}/resources/images/svv.jpg"
                                                   alt=""></div>
                    <div class="course_body">
                        <h3 class="course_title"><a href="course.html">Liverpool</a></h3>
                        <div class="course_teacher">Ms. Lucius</div>
                        <div class="course_text">
                            <p>Les maitres du foot</p>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Course -->
            <div class="col-lg-4 course_col">
                <div class="course">
                    <div class="course_image"><img
                            src="${pageContext.request.contextPath}/resources/images/halsanch.jpg" alt=""></div>
                    <div class="course_body">
                        <h3 class="course_title"><a href="course.html">Philosophie</a></h3>
                        <div class="course_teacher">Mr. Charles</div>
                        <div class="course_text">
                            <p>prof de math tres proche de ses eleves</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Newsletter -->


<!-- Footer -->
<jsp:include page="../footer.jsp"/>