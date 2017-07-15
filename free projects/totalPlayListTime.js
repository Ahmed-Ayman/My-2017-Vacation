// this will alert the total time in minutes
function getSecs(item){
 var arr= item.split(':');
	var hours=0,mins=0,secs=0,tsecs=0;
	if(arr.length == 3){
    	hours=parseInt(arr[0])*60*60;
		mins=parseInt(arr[1])*60;
		secs=parseInt(arr[2]);

	}else{
	console.log("arr length ->"+ arr.length)
    	mins=parseInt(arr[0])*60;
		secs=parseInt(arr[1]);
	}
tsecs=hours+mins+secs;
return tsecs;
}

var list = document.getElementsByClassName('timestamp');
if (list !=0){
var secs=0;
for (var i =0;i<list.length;i++){
	var item = list[i].innerText;
	 secs+= getSecs(item);
}
var date = new Date(null);
date.setSeconds(secs); // specify value for SECONDS here
var result = date.toISOString().substr(11, 8);
alert("the total amount of time is -> "+result)
}
else{
  alert('cant find any list')
}
