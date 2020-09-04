<jsp:include page="../headercon.jsp"/>
<!-- Contact -->

<div class="contact">
    <!-- Contact Info -->

    <div class="contact_info_container">
        <div class="container">
            <div class="row">

                <!-- Contact Form -->
                <div class="col-lg-6">
                    <div class="contact_form">
                        <div class="contact_info_title">Creer un compte Profacile etudiant</div>
                        <% String error = (String) request.getAttribute("error");

                            if (error == "true") {

                        %>
                        <p style='text-align:center;'><span style="color:red;">Cet Email est deja utilise</span></p>
                        <% } %>
                        <form method="POST" action="/fifamanager/student/register"
                              class="counter_form_content d-flex flex-column align-items-center justify-content-center">
                            <input type="text" class="comment_input" name="nom" placeholder="Votre Nom (Obligatoire):"
                                   required="required">
                            <input type="text" class="comment_input" name="prenom" placeholder="Votre Prenom :"
                                   required="required">
                            <input type="email" class="comment_input" name="email"
                                   placeholder="Votre Email (Obligatoire):" required="required">
                            <input type="password" class="comment_input" name="password"
                                   placeholder="Votre Mot de passe (Obligatoire):" required="required">
                            <button type="submit" class="comment_button trans_200">Inscription</button>
                            <p><a href="login">Deja inscrit? Se connecter</a></p>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../footer.jsp"/>
