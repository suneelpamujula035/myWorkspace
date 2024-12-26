<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link
	href="http://fullcalendar.io/js/fullcalendar-2.2.5/fullcalendar.css"
	th:href="@{/webjars/fullcalendar/2.2.5/fullcalendar.css}"
	rel="stylesheet"></link>
<link
	href="http://fullcalendar.io/js/fullcalendar-2.2.5/fullcalendar.print.css"
	th:href="@{/webjars/fullcalendar/2.2.5/fullcalendar.print.css}"
	rel="stylesheet" media="print"></link>
<script
	src="http://cdnjs.cloudflare.com/ajax/libs/moment.js/2.9.0/moment.min.js"
	th:src="@{/webjars/momentjs/2.9.0/min/moment.min.js}"
	type="text/javascript"></script>
<script src="http://cdn.jsdelivr.net/webjars/jquery/3.4.1/jquery.min.js"
	th:src="@{/webjars/jquery/3.4.1/jquery.min.js}" type="text/javascript"></script>
<script
	src="http://fullcalendar.io/js/fullcalendar-2.2.5/fullcalendar.min.js"
	th:src="@{/webjars/fullcalendar/2.2.5/fullcalendar.min.js}"
	type="text/javascript"></script>

<script>

$(document).ready(function() {

	$('#calendar').fullCalendar({
		defaultDate: '2021-12-01',
		editable: true,
		eventLimit: true, // allow "more" link when too many events
		events: [
			{
				title: 'All Day Event',
				start: '2021-12-01'
			},
			{
				title: 'Long Event',
				start: '2021-12-07',
				end: '2021-12-10'
			},
			{
				id: 999,
				title: 'Repeating Event',
				start: '2021-12-09T16:00:00'
			},
			{
				id: 999,
				title: 'Repeating Event',
				start: '2021-12-16T16:00:00'
			},
			{
				title: 'Conference',
				start: '2021-12-11',
				end: '2021-12-13'
			},
			{
				title: 'Meeting',
				start: '2021-12-12T10:30:00',
				end: '2021-12-12T12:30:00'
			},
			{
				title: 'Lunch',
				start: '2021-12-12T12:00:00'
			},
			{
				title: 'Meeting',
				start: '2021-12-12T14:30:00'
			},
			{
				title: 'Happy Hour',
				start: '2021-12-12T17:30:00'
			},
			{
				title: 'Dinner',
				start: '2021-12-12T20:00:00'
			},
			{
				title: 'Birthday Party',
				start: '2021-12-13T07:00:00'
			},
			{
				title: 'Click for Google',
				url: 'http://localhost:8080/showCreateMeetingPage',
				start: '2021-12-28'
			}
		]
	});
	
});
</script>

<style>
body {
	margin: 40px 10px;
	padding: 0;
	font-family: "Lucida Grande", Helvetica, Arial, Verdana, sans-serif;
	font-size: 14px;
}

#calendar {
	max-width: 900px;
	margin: 0 auto;
}
</style>

</head>
<body>
	<div align="right">
		<a href="http://localhost:8080"><button class="btn btn-primary">Home</button></a>
	</div>
	<div align="center">
		<button class="btn btn-primary">Create Meeting</button>
		<button class="btn btn-primary">Update Meeting</button>
		<button class="btn btn-primary">Meeting List</button>
	</div>
	<div id="calendar"></div>
</body>
</html>