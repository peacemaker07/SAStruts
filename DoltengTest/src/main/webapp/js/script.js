$(function(){
//	$(document).on('ready', moveTotal);
	// テーブル１
	$(document).on('ready', moveTotal2($('#t1 tr:eq(2) td'), $('#t2 tr:eq(0) td')));		// 画面表示時
	$('#t1').on('resize', moveTotal2($('#t1 tr:eq(2) td'), $('#t2 tr:eq(0) td')));			// 画面リサイズ時
	// テーブル２
	$(document).on('ready', moveTotal2($('#tt1 tr:eq(2) td'), $('#tt2 tr:eq(0) td')));		// 画面表示時
	$('#tt1').on('resize', moveTotal2($('#tt1 tr:eq(2) td'), $('#tt2 tr:eq(0) td')));		// 画面リサイズ時
	// tdのidを指定して幅を調節
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
	// 1行分のtrを取得して繰り返して幅を調整
	// @param orgTable：幅をあわせる元のテーブルの1行分
	// @param orgTable：幅を合わせる先のテーブルの1行分
	function moveTotal2(orgTable, preTable){
		var preIndex = 0;				// 元テーブルのIndex
		var totalWidth = 0;				// 複数セルの幅合計
		var tmp = 0;
		// 元テーブルの1〜5列目を先テーブルの1列目と幅をあわせる
		// 6列目以降は元、先の1列ずつ幅を合わせる
		// 基本的に幅が大きいセルにあわせる
		for(var orgIndex = 0; orgIndex < orgTable.length; orgIndex++){
			alert(orgTable.eq(orgIndex).innerWidth());
			// 元テーブルの1〜4列目までは元テーブルの幅を加算していく
			if(orgIndex < 4){
				totalWidth = totalWidth + orgTable.eq(orgIndex).innerWidth();
			// 元テーブルの5列目から先テーブルの幅を合わせていく
			} else if(orgIndex == 4) {
				totalWidth = totalWidth + orgTable.eq(orgIndex).innerWidth();
				preTable.eq(preIndex).innerWidth(totalWidth);
				preIndex = preIndex + 1;
			} else {
				tmp = orgTable.eq(orgIndex).innerWidth();
				if(tmp < preTable.eq(preIndex).innerWidth()){
					tmp = preTable.eq(preIndex).innerWidth();
				}
				preTable.eq(preIndex).innerWidth(tmp);
				orgTable.eq(orgIndex).innerWidth(tmp);
				preIndex = preIndex + 1;
			}
		}
	}
})