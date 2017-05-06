(function($){
	$.wyDialog=function(option){
		 var $dialog=$("<div style='position:absolute;width:"+option.width+"px;height:"+option.height+"px;border:1px solid #000;z-index:9'></div>");
		 var $head=$("<div style='height:40px;width:100%;border-bottom:1px solid #000;background:#fff'></div>");
		 var $title=$("<span style='display:block;float:left;height:40px;line-height:40px;padding-left:40px'>"+option.title+"</span>");
		 var $close=$("<span style='display:block;float:right;height:40px;line-height:40px;margin-right:10px;cursor:pointer'>X</span>");
		 $head.append($title).append($close);
		 var bodyheight=option.height-40-1;
		 var $body=$("<div style='height:"+bodyheight+"px;width:100%;'></div>");
		 var $frame=$("<iframe src='"+option.url+"' style='width:100%;height:100%;border:0'></iframe>");
		 $body.append($frame);
		 var _left=($(window).width()-$dialog.width())/2
		 var _top=($(window).height()-$dialog.height())/2
		 $dialog.css({"left":_left+"px","top":_top+"px"});
		 var $shadow=$("<div style='left:0;top:0;width:100%;height:100vh;position:absolute;background:#000;opacity:0.3;z-index:8'></div>");
		 $dialog.append($head).append($body);
		 $("body").append($dialog).append($shadow);
		 $close.click(function(){
			 $dialog.remove();
			 $shadow.remove();
			 window.location=window.location;
		 });
	}
	
})(jQuery)