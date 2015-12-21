$( document ).ready(function() {

	$(".cat-li").hover(function() {
		$(".cat-li").removeClass("activate");
		$(this).addClass("activate");
		$("div#" + this.id).css("display","block");
	}, function() {
		$(this).removeClass("activate");
		$("div#" + this.id).css("display","none");
	});
	
	$(".cat-li").click(function() {
		$(".cat-li").removeClass("activate");
		$(this).addClass("activate");
	});

});