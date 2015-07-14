$(function(){
	$(document).on('ready', moveTotal);
//	$(document).on('ready', moveTotal2($('#t1 tr:eq(2) td'), $('#t2 tr:eq(0) td')));
//	$('#t1').on('resize', moveTotal2($('#t1 tr:eq(2) td'), $('#t2 tr:eq(0) td')));
	$(document).on('ready', moveTotal2($('#tt1 tr:eq(2) td'), $('#tt2 tr:eq(0) td')));
	$('#tt1').on('resize', moveTotal2($('#tt1 tr:eq(2) td'), $('#tt2 tr:eq(0) td')));
	function moveTotal(){
		var num1 = $('#t1ta1').innerWidth() + $('#t1ta2').innerWidth() + $('#t1ta3').innerWidth() + $('#t1ta4').innerWidth()+ $('#t1ta5').innerWidth();
		var num2 = $('#t1ta6').innerWidth();
		var num3 = $('#t1ta7').innerWidth();
		var num4 = $('#t1ta8').innerWidth();
		
		$('#t2ta1').innerWidth(num1);
		$('#t2ta2').innerWidth(num2);
		$('#t2ta3').innerWidth(num3);
		$('#t2ta4').innerWidth(num4);
		
	}
	function moveTotal2(orgTable, preTable){
//		var orgTable = $('orgTable tr:eq(2) td');
//		var preTable = $('preTable tr:eq(0) td');

		var tIndex = 0;
		var totalTitleWidth = 0;
		var tmp = 0;
		for(var dIndex = 0; dIndex < orgTable.length; dIndex++){
			alert(orgTable.eq(dIndex).innerWidth());
			if(dIndex < 4){
				totalTitleWidth = totalTitleWidth + orgTable.eq(dIndex).innerWidth();
			} else if(dIndex == 4) {
				totalTitleWidth = totalTitleWidth + orgTable.eq(dIndex).innerWidth();
				preTable.eq(tIndex).innerWidth(totalTitleWidth);
				tIndex = tIndex + 1;
			} else {
				tmp = orgTable.eq(dIndex).innerWidth();
				if(tmp < preTable.eq(tIndex).innerWidth()){
					tmp = preTable.eq(tIndex).innerWidth();
				}
				preTable.eq(tIndex).innerWidth(tmp);
				orgTable.eq(dIndex).innerWidth(tmp);
				tIndex = tIndex + 1;
			}
		}
	}
})