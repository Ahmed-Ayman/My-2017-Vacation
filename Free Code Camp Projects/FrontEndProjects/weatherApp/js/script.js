
function replaceAllDashes (string){
  var out="";
  for (var i =0;i<string.length;i++){
    if(string[i]=='-')
      out+='_';
   else
     out+=string[i];
  }
   return out;
}

var images = {
  //orange or green with opacity
  rain:"url(https://images.unsplash.com/uploads/14116603688211a68546c/30f8f30b?dpr=1&auto=format&fit=crop&w=1199&h=799&q=80&cs=tinysrgb&crop=&bg=)",
  //defauly
  clear_day :"url(https://images.unsplash.com/photo-1454942901704-3c44c11b2ad1?dpr=1&auto=format&fit=crop&w=1080&h=720&q=80&cs=tinysrgb&crop=&bg=)",
  // white
  clear_night:"url(https://images.unsplash.com/photo-1473454363643-6155ad5edd24?dpr=1&auto=format&fit=crop&w=1199&h=799&q=80&cs=tinysrgb&crop=&bg=)",
  //orange
  snow:"url(https://images.unsplash.com/photo-1428604339796-72401d912824?dpr=1&auto=format&fit=crop&w=1080&h=720&q=80&cs=tinysrgb&crop=&bg=)",
  //brown
  sleet:"url(https://lintvwwlp.files.wordpress.com/2016/03/carolyn-wynkoop-holland-sleet.jpg?w=1080)",
  //niley
  wind:"url(https://images.unsplash.com/photo-1474393881983-cd780bf9f4ad?dpr=1&auto=format&fit=crop&w=1080&h=720&q=80&cs=tinysrgb&crop=&bg=)",
  //black
  fog:"url(https://images.unsplash.com/photo-1491680085255-b1803aa9fff6?dpr=1&auto=format&fit=crop&w=1199&h=800&q=80&cs=tinysrgb&crop=&bg=)",
  cloudy:"url(https://images.unsplash.com/photo-1496512347486-8668833dead7?dpr=1&auto=format&fit=crop&w=1080&h=810&q=80&cs=tinysrgb&crop=&bg=)",
  //orange
  partly_cloudy_day:"url(https://images.unsplash.com/photo-1431057259500-78dd318a0a75?dpr=1&auto=format&fit=crop&w=1080&h=720&q=80&cs=tinysrgb&crop=&bg=)",
  //white
  partly_cloudy_night: "url(https://images.unsplash.com/photo-1488251550865-19b3b4ae5734?dpr=1&auto=format&fit=crop&w=1080&h=810&q=80&cs=tinysrgb&crop=&bg=)",
  thunderstorm:"url(https://images.unsplash.com/photo-1427507791254-e8d2fe7db7c0?dpr=1&auto=format&fit=crop&w=1199&h=799&q=80&cs=tinysrgb&crop=&bg=)",
  tornado:"url(https://images.unsplash.com/photo-1475181624534-3e2ff2beb57c?dpr=1&auto=format&fit=crop&w=1080&h=720&q=80&cs=tinysrgb&crop=&bg=)",
  //blue
  hail:"url(https://images.unsplash.com/photo-1489552615259-23c7732e3472?dpr=1&auto=format&fit=crop&w=1080&h=1620&q=80&cs=tinysrgb&crop=&bg=)"
};
// list of back ground colors
var backgrounds = {
  //orange or green with opacity
  rain:"rgba(255, 204,100,0.4)",
  //defauly
  clear_day :"rgba(255, 216, 255,0.4)",
  // white
  clear_night:"rgba(255, 255, 255,0.4)",
  //orange
  snow:"rgba(255, 204,255 ,0,4)",
  //brown
  sleet:"rgba(102, 51, 0,4)",
  //niley
  wind:"rgba(102, 255, 255,4)",
  //black
  fog:"rgba(0,0,0,4)",
  cloudy:"rgba(255, 255, 255,4)",
  //orange
  partly_cloudy_day:"rgba(255, 204, 0,0.4)",
  //white
  partly_cloudy_night: "rgb(255, 255, 255,4)",
  thunderstorm:"rgba(255, 204, 0,4)",
  tornado:"rgba(255, 255, 255,4)",
  //blue
  hail:"rgba(255, 204, 0,4)"
};
var temp =0;
var lat=0,long=0;

if (navigator.geolocation) {
  navigator.geolocation.getCurrentPosition(function(position) {
   lat=position.coords.latitude;
   long = position.coords.longitude;
    getWeatherData(lat,long);
  });//navigator
}//if navigator
function getWeatherData(lat,long){
  var url = "https://crossorigin.me/https://api.darksky.net/forecast/49734b0bae44c7af837baa750b92d877/"+lat+","+long;
  $.getJSON(url,function(json){
  $('#time_zone').text(json.timezone);
  $('#summary').text(json.currently.summary);
    temp= json.currently.temperature;
   temp = (parseInt(temp)-32)*(5/9);
  $('#temperature').html( parseInt(temp)+" °C ").append('<br> <button onClick = "toF()" class="btn btn-warning" id="change_temp">change to °F</button>');

    $('#humidity').text("humidity : "+ json.currently.humidity);
  $('#windSpeed').text(" wind speed : "+json.currently.windSpeed+ " MPS" );
  $('#pressure').text("pressure : "+json.currently.pressure +" Hp");
   // console.log(json.currently.icon);
    var icon = replaceAllDashes(json.currently.icon);
    //console.log(icon);
    $("body").css({"background-image": images[icon]});

    $('#weather_card').css("background",backgrounds[icon]);
    $('#header').css('color',"orange");
    });
}
// change from C to F
function toC(){
      $('#change_tempC').css("display","none");
     $('#temperature').text( parseInt(temp)+" °C  ").append('<br><button onClick="toF()"class="btn btn-warning" id="change_temp">change to °F</button>');;
}
function toF(){
     $('#change_temp').css("display","none");
     $('#temperature').text( parseInt(temp*(9/5)+32) +" °F  ").append('<br><button class="btn btn-warning" onclick="toC()" id="change_tempC">change to °C</button>');
}
new WOW().init();

//search
$(function () {
    $('#list').on('click', function(event) {
        $('main').css('display','none');
        $('#search').addClass('open');
        $('#search > form > input[type="search"]').focus();
    });

    var cityName ="";


    $('#search,#submit,#search button.close').on('click keyup', function(event) {
        cityName=$('#data').val();
        updateLocation(cityName);

      if (event.target == this || event.target.className == 'close' || event.keyCode == 27) {
            $(this).removeClass('open');
            $('main').css('display','block');

        }
    });
});
function updateLocation(cityName){

  ul ="https://maps.googleapis.com/maps/api/geocode/json?address="+cityName+"&sensor=false";
  $.ajax({
            dataType: "json",
            url: ul,
            success: function(data) {
              lat=data.results[0].geometry.location.lat;
              long=data.results[0].geometry.location.lng;
              console.log(lat,long)
            },
            error: function() {
              console.log
            }
        });
  getWeatherData(lat,long);
}
