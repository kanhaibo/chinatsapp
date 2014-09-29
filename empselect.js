$(document).ready(function () {
	$("#chooses").change(function () {
		var chooses=$("#chooses").val();
		$('#data').find('option').remove();
		if(chooses==2){
			$("#info").removeAttr("readonly"); 
		}if(chooses==3){
			$("#info").attr({readonly: "readonly"});  
			$.getJSON("SelectInfoServlet?choose=1",null,function(data){
				$.each(data,function(i,n){
				     $("#data").append($("<option>").attr("value",n.deptno).text(n.dname));
		       });
			});
		}else if(chooses==4){
			$("#info").attr({readonly: "readonly"});  
			$.getJSON("SelectInfoServlet?choose=2",null,function(data){
				$.each(data,function(i,n){
				     $("#data").append($("<option>").attr("value",n.posno).text(n.pname));
		       });
			});
		}
		
	});
});