$(function(){
	$("#t2").ready(function(){
		var num1 = $("#t1ta1").width() + $("#t1ta2").width() +$("#t1ta3").width() + 15;
		var num2 = $("#t1ta4").width();
		var num3 = $("#t1ta5").width();
		
		$("#t2ta1").width(num1);
		$("#t2ta2").width(num2);
		$("#t2ta3").width(num3);
//		$("#t1ta1").css("padding", "4px");
//		alert($("#t1ta1").css("padding"));
	});
})