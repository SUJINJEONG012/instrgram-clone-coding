<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인스타그램</title>

<!-- jquery -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<!-- Style -->
<link rel="stylesheet" href="/css/layout.css">
<link rel="stylesheet" href="/css/feed.css">
<link rel="stylesheet" href="/css/explore.css">
<link rel="stylesheet" href="/css/profile.css">
<link rel="stylesheet" href="/css/upload.css">
<link rel="stylesheet" href="/css/profileSetting.css">


<link rel="shortcut icon" href="/images/insta.svg">

<!-- Fontawesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />
<!-- Fonts -->
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;200;300;400;500;600;700&display=swap"
	rel="stylesheet">

</head>
<body>


	<input type="hidden" id="principal-id" value="${principal.user.id}" />
	<input type="hidden" id="principal-username"
		value="${principal.user.username}" />


	<header class="header">
		<div class="inner">
			<a href="/image/feed" class="logo"> <img src="/images/instagram-logo.png"
				alt="">
			</a>
			<nav class="navi">
				<ul class="navi-list">
					<li class="navi-item"><a href="/image/feed"> <i
							class="fas fa-home"></i>
					</a></li>
					<li class="navi-item"><a href="/image/explore"> <i
							class="far fa-compass"></i>
					</a></li>
					<li class="navi-item"><a href="/user/${principal.user.id}">
							<i class="far fa-user"></i>
					</a></li>
				</ul>
			</nav>
		</div>
	</header>