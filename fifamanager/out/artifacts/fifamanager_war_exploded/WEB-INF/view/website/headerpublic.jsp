<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>FIFA MANAGER la gestion de votre tournoi</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="Unicat project">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/styles/bootstrap4/bootstrap.min.css">
    <link href="${pageContext.request.contextPath}/resources/plugins/font-awesome-4.7.0/css/font-awesome.min.css"
          rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/contact.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/styles/contact_responsive.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/main_styles.css"/>
</head>

<style>
    .contact_form td {
        height: 8em;
        width: 6%;
        color: black;
    }

    .tab td {
        width: 100% !important;
        font-size: 16px !important;
        font-weight: none;
    }

    .comment_input {

        margin-top: 1em;
        margin-bottom: 1em;
    }
</style>
<body>

<div class="super_container">

    <!-- Header -->

    <header class="header">

        <!-- Top Bar -->
        <div class="top_bar" style="height: 50px">
            <div class="top_bar_container">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="top_bar_content d-flex flex-row align-items-center justify-content-start">
                                <div class="logo_container"><a href="/fifamanager/">
                                    <div class="logo_text">FIFA<span style="color: #ffffff">MAN</span><span
                                            style="color: darkgoldenrod">AGER</span></div>
                                </a>
                                </div>
                                    <div class="top_bar_login ml-auto">
                                        <div class="login_button" style="margin: 5px 4px 4px 4px; border-radius: 4px;">
                                            <a href="/fifamanager/register">S'inscrire</a></div>
                                    </div>
                                    <div class="top_bar_login ml-auto">
                                        <div class="login_button" style="margin: 5px 4px 4px 4px; border-radius: 4px;">
                                            <a href="/fifamanager/login">Se connecter</a></div>
                                    </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Header Content -->
        <div class="header_container">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <div class="header_content d-flex flex-row align-items-center justify-content-start">
                            <nav class="main_nav_contaner ml-auto">

                                <div class="hamburger menu_mm">
                                    <i class="fa fa-bars menu_mm" aria-hidden="true"></i>
                                </div>
                            </nav>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Header Search Panel -->
        <div class="header_search_container">
            <div class="container">
                <div class="row">
                    <div class="col">
                        <div class="header_search_content d-flex flex-row align-items-center justify-content-end">
                            <form action="#" class="header_search_form">
                                <input type="search" class="search_input" placeholder="Search" required="required">
                                <button class="header_search_button d-flex flex-column align-items-center justify-content-center">
                                    <i class="fa fa-search" aria-hidden="true"></i>
                                </button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- Menu -->

    <div class="menu d-flex flex-column align-items-end justify-content-start text-right menu_mm trans_400">
        <div class="menu_close_container">
            <div class="menu_close">
                <div></div>
                <div></div>
            </div>
        </div>
        <div class="search">
            <form action="#" class="header_search_form menu_mm">
                <input type="search" class="search_input menu_mm" placeholder="Search" required="required">
                <button class="header_search_button d-flex flex-column align-items-center justify-content-center menu_mm">
                    <i class="fa fa-search menu_mm" aria-hidden="true"></i>
                </button>
            </form>
        </div>
        <nav class="menu_nav">
            <ul class="menu_mm">
            </ul>
        </nav>
    </div>
</div>