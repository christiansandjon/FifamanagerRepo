<jsp:include page="header.jsp"/>
<!-- Home -->

<div class="home">
    <div class="home_slider_container">

        <!-- Home Slider -->
        <div class="owl-carousel owl-theme home_slider">

            <!-- Home Slider Item -->
            <div class="owl-item">
                <div class="home_slider_background"
                     style="background-image:url(${pageContext.request.contextPath}/resources/images/leo.jpg)"></div>
                <div class="home_slider_content">
                    <div class="container">
                        <div class="row">
                            <div class="col text-center">
                                <div class="home_slider_title">FifaManager Tournament</div>
                                <div class="home_slider_subtitle">Numero 1 sur l'organisation des championnats</div>
                                <div class="home_slider_form_container">
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
                                <div class="home_slider_title">FifaManager Tournament</div>
                                <div class="home_slider_subtitle">Numero 1 sur l'organisation des championnats</div>
                                <div class="home_slider_form_container">
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
                        <p>Ma liste de championnats créés</p>
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


<!-- Popular Courses -->

<div class="championnat">
    <div class="section_background parallax-window" data-parallax="scroll"
         data-image-src="${pageContext.request.contextPath}/resources/images/courses_background.jpg"
         data-speed="0.8"></div>
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="courses_button trans_200"><a href="#">voir toute la liste</a></div>
            </div>
        </div>
    </div>
</div>

<!-- Newsletter -->


<!-- Footer -->
<jsp:include page="footer.jsp"/>